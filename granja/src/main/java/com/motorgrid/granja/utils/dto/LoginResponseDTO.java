package com.motorgrid.granja.utils.dto;



public class LoginResponseDTO{
    private final DataDTO data;
    private final String accessToken;
    private final String refreshToken;

    public LoginResponseDTO(DataDTO data, TokensDTO tokens) {
        this.data = data;
        this.accessToken = tokens.getAccessToken();
        this.refreshToken = tokens.getRefreshToken();
    }

    public Object getData() {
        return data;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }
}
