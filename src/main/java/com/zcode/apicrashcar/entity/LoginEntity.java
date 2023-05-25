package com.zcode.apicrashcar.entity;

import java.util.Objects;

public class LoginEntity {
    private String email;
    private String password;
    private int  tipologin;

    public LoginEntity(String email, String password, Integer tipo_login) {
        this.email = email;
        this.password = password;
        this.tipologin = tipo_login;
    }

    public LoginEntity() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getTipo_login() {
        return tipologin;
    }

    public void setTipo_login(Integer tipo_login) {
        this.tipologin = tipo_login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoginEntity that = (LoginEntity) o;

        if (tipologin != that.tipologin) return false;
        if (!Objects.equals(email, that.email)) return false;
        return Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        int result = email != null ? email.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + tipologin;
        return result;
    }
}
