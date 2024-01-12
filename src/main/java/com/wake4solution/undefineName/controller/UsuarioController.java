package com.wake4solution.undefineName.controller;

import com.wake4solution.undefineName.usuario.DadosUsuario;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @PostMapping
    public ResponseEntity efetuarLogin(@RequestBody @Valid DadosUsuario dados){

        System.out.println(dados);

        return ResponseEntity.ok("Mensagem chegou");
    }
}
