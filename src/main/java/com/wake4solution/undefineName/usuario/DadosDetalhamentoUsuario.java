package com.wake4solution.undefineName.usuario;

public record DadosDetalhamentoUsuario(Long id, String usuario) {
    public DadosDetalhamentoUsuario(Usuario usuario){
        this(usuario.getId(), usuario.getUsuario());
    }
}
