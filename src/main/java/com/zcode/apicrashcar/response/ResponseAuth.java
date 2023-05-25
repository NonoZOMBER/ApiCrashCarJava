package com.zcode.apicrashcar.response;

import com.zcode.apicrashcar.entity.UsuariosEntity;

import java.util.Objects;

public class ResponseAuth {
    private Integer code;
    private UsuariosEntity usuario;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public ResponseAuth() {
    }

    public ResponseAuth(Integer code, UsuariosEntity usuario, String msg) {
        this.code = code;
        this.usuario = usuario;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public UsuariosEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuariosEntity usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResponseAuth that = (ResponseAuth) o;

        if (!Objects.equals(code, that.code)) return false;
        return Objects.equals(usuario, that.usuario);
    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (usuario != null ? usuario.hashCode() : 0);
        return result;
    }
}
