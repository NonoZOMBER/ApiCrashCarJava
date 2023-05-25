package com.zcode.apicrashcar.response;

import com.zcode.apicrashcar.entity.UsuariosEntity;

import java.util.Objects;

public class ResponseChangePassword {
    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public ResponseChangePassword(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseChangePassword() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResponseChangePassword that = (ResponseChangePassword) o;

        if (!Objects.equals(code, that.code)) return false;
        return Objects.equals(msg, that.msg);
    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (msg != null ? msg.hashCode() : 0);
        return result;
    }
}
