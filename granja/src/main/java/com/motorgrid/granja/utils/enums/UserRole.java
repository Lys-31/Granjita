package com.motorgrid.granja.utils.enums;

public enum UserRole {

    FUNCIONARIO("funcionario"),
    ADMIN("admin");

    private final String role;

    UserRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}