package br.com.jsfcomwildfly.jsf.teste.bean;

import br.com.jsfcomwildfly.jsf.teste.dao.LivroDao;
import br.com.jsfcomwildfly.jsf.teste.model.Livro;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

@Named
@RequestScoped
public class AdminLivrosBean {

    private Livro livro = new Livro();

    @Inject
    private LivroDao dao;

    @Transactional
    public void salvar() {
        System.out.println("Livro Cadastrado: " + livro);
        dao.salvar(livro);
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

}
