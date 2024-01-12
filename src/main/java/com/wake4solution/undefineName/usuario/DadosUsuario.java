package com.wake4solution.undefineName.usuario;

import jakarta.validation.constraints.NotBlank;

public record DadosUsuario(

        @NotBlank
        String usuario,
        @NotBlank
        String senha

) {
}
