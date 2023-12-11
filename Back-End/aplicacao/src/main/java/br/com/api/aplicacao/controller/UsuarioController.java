package br.com.api.aplicacao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @GetMapping("/usuario")
    public String textp () {
    return "Hello WOrd!";
    }
}
