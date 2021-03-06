package org.acme.commandmode.dto;

import java.time.LocalDateTime;

import javax.json.bind.annotation.JsonbDateFormat;

public class TodoDto {

    private Long id;

    private String nome;

    @JsonbDateFormat("dd/MM/yyyy HH:mm")
    private LocalDateTime dataCriacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}