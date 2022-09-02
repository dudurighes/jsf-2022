package br.com.jsfcomwildfly.jsf.teste.dao;

import br.com.jsfcomwildfly.jsf.teste.model.Livro;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class LivroDao {

    @PersistenceContext
    private EntityManager manager;

    public void salvar(Livro livro) {
        manager.persist(livro);
    }

}
