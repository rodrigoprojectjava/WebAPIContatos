package br.com.api.aplicacao.controller;

import br.com.api.aplicacao.DAO.IUsuario;
import br.com.api.aplicacao.model.DAO.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private IUsuario dao;

    @GetMapping ("/usuarios")
    public List<Usuario> listaUsuarios () {
        return (List<Usuario>) dao.findAll();
    }
}
