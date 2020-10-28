package org.acme.commandmode.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import org.acme.commandmode.dao.TodoDao;

@RequestScoped
public class TodoService {

    @Inject 
    TodoDao dao;

    private void validar() {

    }

    @Transactional(rollbackOn = Exception.class)
    public void inserir() {

    }

    public void listar() {
        
    }
    
}
