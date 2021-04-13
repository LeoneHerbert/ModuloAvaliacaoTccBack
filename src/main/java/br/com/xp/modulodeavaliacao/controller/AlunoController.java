package br.com.xp.modulodeavaliacao.controller;

import br.com.xp.modulodeavaliacao.controller.response.Resposta;
import br.com.xp.modulodeavaliacao.model.Aluno;
import br.com.xp.modulodeavaliacao.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
@CrossOrigin
public class AlunoController {
    @Autowired
    private ApplicationEventPublisher publisher;

    private final AlunoService alunoService;

    @Autowired
    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<Aluno> todos() {
        return alunoService.todos();
    }

    @GetMapping("/{id}")
    public Resposta<Aluno> buscaPor(@PathVariable Integer id) {
        Aluno aluno = alunoService.buscaPor(id);
        return Resposta.comDadosDe(aluno);
    }
}
