package com.zcode.apicrashcar.controller;

import com.zcode.apicrashcar.entity.ChangePasswordEntity;
import com.zcode.apicrashcar.entity.LoginEntity;
import com.zcode.apicrashcar.entity.UsuariosEntity;
import com.zcode.apicrashcar.repository.RepoUsuarios;
import com.zcode.apicrashcar.response.ResponseAuth;
import com.zcode.apicrashcar.response.ResponseChangePassword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.desktop.PreferencesEvent;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/crash-car/auth")
public class LoginControler {
    @Autowired
    RepoUsuarios usuarios;

    @PostMapping("/login")
    ResponseEntity<ResponseAuth> loginUser(@RequestBody LoginEntity item) {
        ResponseAuth responseLogin = new ResponseAuth();
        Iterable<UsuariosEntity> listUsuarios = usuarios.findAll();
        if (item.getTipo_login() == 1) {
            for (UsuariosEntity usuario : listUsuarios) {
                if (usuario.getEmail().equalsIgnoreCase(item.getEmail())) {
                    if (usuario.getTipologin() == 1) {
                        if (usuario.getPassword().equals(item.getPassword())) {
                            responseLogin.setCode(1);
                            responseLogin.setUsuario(usuario);
                            responseLogin.setMsg("Iniciando sesión correctamente");
                        } else {
                            responseLogin.setCode(-2);
                            responseLogin.setMsg("La contraseña no es valida");
                        }
                        break;
                    } else {
                        responseLogin.setCode(-4);
                        responseLogin.setMsg("Este usuario no está registrado con este modo de inicio de sesión");
                        break;
                    }
                } else {
                    responseLogin.setCode(0);
                    responseLogin.setMsg("El usuario no está registrado");
                }
            }
            return ResponseEntity.ok(responseLogin);
        } else {
            if (item.getTipo_login() == 2) {
                for (UsuariosEntity usuario : listUsuarios) {
                    if (usuario.getEmail().equalsIgnoreCase(item.getEmail())) {
                        if (usuario.getTipologin() == 2) {
                            responseLogin.setCode(1);
                            responseLogin.setUsuario(usuario);
                            responseLogin.setMsg("Iniciando sesión correctamente");
                        } else {
                            responseLogin.setCode(-4);
                            responseLogin.setMsg("Este usuario no está registrado con este modo de inicio de sesión");
                        }
                        break;
                    } else {
                        responseLogin.setCode(0);
                        responseLogin.setMsg("El usuario no está registrado");
                    }
                }
            } else {
                responseLogin.setCode(-3);
                responseLogin.setMsg("El tipo de Login no es valido");
            }
            return ResponseEntity.ok(responseLogin);
        }
    }

    @PostMapping("/register")
    ResponseEntity<ResponseAuth> newItem(@RequestBody UsuariosEntity item) {
        ResponseAuth responseAuth = new ResponseAuth();
        Iterable<UsuariosEntity> listUsuarios = usuarios.findAll();
        for (UsuariosEntity usuario : listUsuarios) {
            if (usuario.getEmail().equals(item.getEmail())) {
                responseAuth.setCode(0);
                responseAuth.setMsg("El usuario está registrado");
                return ResponseEntity.ok(responseAuth);
            }
        }
        responseAuth.setCode(1);
        responseAuth.setMsg("Registrado con exito");
        item.setId(UUID.randomUUID().toString());
        usuarios.save(item);
        responseAuth.setUsuario(item);
        return ResponseEntity.ok(responseAuth);
    }

    @PostMapping("/change-password")
    ResponseEntity<ResponseChangePassword> changePassword(@RequestBody ChangePasswordEntity changePassword) {
        Optional<UsuariosEntity> usuario = usuarios.findById(changePassword.getUserId());
        ResponseChangePassword response = new ResponseChangePassword();
        if (usuario.isPresent()) {
            UsuariosEntity user = usuario.get();
            if (user.getPassword().equals(changePassword.getOldPassword())) {
                user.setPassword(changePassword.getNewPassword());
                usuarios.save(user);
                response.setCode(1);
                response.setMsg("Se ha actualizado la contraseña con éxito");
            } else {
                response.setCode(-1);
                response.setMsg("La contraseña actual no coincide con la cuenta de " + user.getEmail());
            }
        } else {
            response.setCode(-2);
            response.setMsg("El usuario actual no existe en los servicios de CrashCar");
        }
        return ResponseEntity.ok(response);
    }
}
