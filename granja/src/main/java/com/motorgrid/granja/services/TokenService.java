package com.motorgrid.granja.services;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import com.motorgrid.granja.model.Funcionario;
import com.motorgrid.granja.utils.dto.TokensDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;


@Service
public class TokenService {

    @Value("${api.security.token.secret}")
    private String secret;

    public String generateAccessToken(Funcionario funcionario) {
        return generateToken(funcionario, genAccessTokenExpiry());
    }

    public String generateRefreshToken(Funcionario funcionario) {
        return generateToken(funcionario, genRefreshTokenExpiry());
    }

    public TokensDTO generateTokens(Funcionario funcionario) {
        String accessToken = generateAccessToken(funcionario);
        String refreshToken = generateRefreshToken(funcionario);
        return new TokensDTO(accessToken, refreshToken);
    }

    public String validateAccessToken(String accessToken) {
        return validateToken(accessToken, "access");
    }

    public String validateRefreshToken(String refreshToken) {
        return validateToken(refreshToken, "refresh");
    }

    public String validateToken(String token, String type) {
        try {
            Algorithm algorithms = Algorithm.HMAC256(secret);

            // Valida o token
            return JWT.require(algorithms)
                    .withIssuer("auth-api")
                    .build()
                    .verify(token)
                    .getSubject();
        } catch (JWTVerificationException e) {
            return null;
        }
    }

    private String generateToken(Funcionario Funcionario, Instant expiry) {
        try {
            Algorithm algorithms = Algorithm.HMAC256(secret);
            return JWT.create()
                    .withIssuer("auth-api")
                    .withSubject(Funcionario.getEmail())
                    .withExpiresAt(expiry)
                    .sign(algorithms);
        } catch (JWTCreationException e) {
            throw new RuntimeException("Erro ao gerar token", e);
        }
    }

    private Instant genAccessTokenExpiry() {
        return LocalDateTime.now().plusHours(1).toInstant(ZoneOffset.of("-03:00"));
    }

    private Instant genRefreshTokenExpiry() {
        return LocalDateTime.now().plusDays(15).toInstant(ZoneOffset.of("-03:00"));
    }

    

}
