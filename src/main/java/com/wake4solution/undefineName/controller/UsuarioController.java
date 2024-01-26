package com.wake4solution.undefineName.controller;

import com.wake4solution.undefineName.usuario.DadosDetalhamentoUsuario;
import com.wake4solution.undefineName.usuario.DadosUsuario;
import com.wake4solution.undefineName.usuario.Usuario;
import com.wake4solution.undefineName.usuario.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;


    @PostMapping
    public ResponseEntity cadastrarUsuario(@RequestBody @Valid DadosUsuario dados, UriComponentsBuilder uriBuilder){

        var usuario = new Usuario(dados);

        System.out.println(usuario);

        usuarioRepository.save(usuario);

        var uri = uriBuilder.path("usuario/{id}").buildAndExpand(usuario.getId()).toUri();
        return ResponseEntity.created(uri).body(new DadosDetalhamentoUsuario(usuario));
    }
}
