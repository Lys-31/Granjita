package com.motorgrid.granja.services;


import com.motorgrid.granja.entity.FuncionarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;


public interface GetUserService extends JpaRepository<FuncionarioEntity, String> {
    UserDetails findByEmail(String login);
}
