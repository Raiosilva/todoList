package org.acme.commandmode.parse;

import org.acme.commandmode.dto.TodoDto;
import org.acme.commandmode.model.Todo;

public class TodoParser {
    
    public static TodoParser get() {
        return new TodoParser();
    }

    public Todo entidade(TodoDto dto) {
        Todo entidade = new Todo();

        entidade.setId(dto.getId());
        entidade.setNome(dto.getNome());
        entidade.setDataCriacao(dto.getDataCriacao());

        return entidade;
    }

    public TodoDto dto(Todo entidade) {
        TodoDto dto = new TodoDto();
        dto.setId(entidade.getId());
        dto.setNome(entidade.getNome());
        dto.setDataCriacao(entidade.getDataCriacao());

        return dto;
    }
}
