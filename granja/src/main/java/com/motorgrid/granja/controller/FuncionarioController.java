package com.motorgrid.granja.controller;

import java.util.List;

import com.motorgrid.granja.factory.FuncionarioFactory;
import com.motorgrid.granja.utils.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.motorgrid.granja.facade.FuncionarioFacade;
import com.motorgrid.granja.entity.FuncionarioEntity;
import com.motorgrid.granja.model.Funcionario;
import com.motorgrid.granja.services.TokenService;

@RestController
@RequestScope
@CrossOrigin
@RequestMapping("/api/funcionario")
public class FuncionarioController {
    private FuncionarioFacade funcionarioFacade;
    private final AuthenticationManager authenticationManager;

    private final TokenService tokenService;

    @Autowired
    public FuncionarioController(FuncionarioFacade funcionarioFacade,
            AuthenticationManager authenticationManager, TokenService tokenService) {
        this.authenticationManager = authenticationManager;
        this.tokenService = tokenService;
        this.funcionarioFacade = funcionarioFacade;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthorizationDTO data) {
        try {
            var usernamePass = new UsernamePasswordAuthenticationToken(
                    data.login().toLowerCase(),
                    data.senha());
            var auth = this.authenticationManager.authenticate(usernamePass);
            var user = (FuncionarioEntity) auth.getPrincipal();
            var tokens = tokenService.generateTokens(FuncionarioFactory.criarFuncionario(user));
            FuncionarioEntity funcionario = funcionarioFacade.findByEmail(data.login().toLowerCase());
            var response = new LoginResponseDTO(new DataDTO(funcionario.getId(), funcionario.getNome(), funcionario.getEmail(), funcionario.getRole().toString()), tokens);
            return ResponseEntity.ok(response);

        } catch (Exception e) {
            return ResponseEntity.status(401).body("Credenciais inválidas ou autenticação falhou.");
        }
    }

    @PostMapping("/refresh-token")
    public ResponseEntity<?> refreshToken(@RequestBody TokenResponseDTO refreshTokenRequest) {

        String login = tokenService.validateRefreshToken(refreshTokenRequest.token());
        if (login == null) {
            return ResponseEntity.status(401).body("Refresh Token inválido ou expirado.");
        }

        Funcionario funcionario = FuncionarioFactory.criarFuncionario(funcionarioFacade.findByEmail(login));

        return ResponseEntity.ok(new TokenResponseDTO(tokenService.generateAccessToken(funcionario)));
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Funcionario data) {

        FuncionarioEntity funcionario = funcionarioFacade.save(data);

        return new ResponseEntity<FuncionarioEntity>(funcionario, HttpStatus.CREATED);

    }

  

    @PutMapping("/update/{id}")
    public FuncionarioEntity update(@PathVariable Long id, @RequestBody Funcionario Funcionario) {
        return funcionarioFacade.update(id, Funcionario);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        funcionarioFacade.delete(id);
    }

    @GetMapping("/find/{id}")
    public FuncionarioEntity findById(@PathVariable Long id) {
        return funcionarioFacade.findById(id);
    }

    @GetMapping("/findAll")
    public List<FuncionarioEntity> findAll() {
        return funcionarioFacade.findAll();
    }
}
