package com.wesley.usuario.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioRequestDTO {
    @JsonProperty(required = true)
    private String nome;
    @JsonProperty(required = true)
    private String email;
    @JsonProperty(required = true)
    private String senha;

}
