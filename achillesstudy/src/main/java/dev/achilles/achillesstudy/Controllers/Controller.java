package dev.achilles.achillesstudy.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import dev.achilles.achillesstudy.Model.Empregado;
import dev.achilles.achillesstudy.Repositories.Repositorio;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class Controller {
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy 'as' HH:mm:ss z");

    @Autowired
    private Repositorio acao;


    @GetMapping("/api/v1")
    public String retornaData() {
        Date date = new Date(System.currentTimeMillis());
        return formatter.format(date);
    }

    @PostMapping("/api/v1/cadastroTeste")
    public Empregado empregado(@RequestBody Empregado e) {
        return e;
    }


    // Realiza o Cadastro
    @PostMapping("/api/v1/cadastro")
    public Empregado cadastrarEmpregado(@RequestBody Empregado e) {
        return acao.save(e);
    }

    // Atualiza o cadastro
    @PutMapping("/api/v1/cadastro")
    public Empregado atualizarEmpregado(@RequestBody Empregado e) {
        return acao.save(e);
    }

    // Retorna o total de empregados
    @GetMapping("/api/v1/empregados") 
    public List<Empregado> retornaEmpregados() {
        return acao.findAll();
    }


}
