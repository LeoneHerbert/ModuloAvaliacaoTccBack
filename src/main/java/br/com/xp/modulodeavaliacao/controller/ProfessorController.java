package br.com.xp.modulodeavaliacao.controller;

import br.com.xp.modulodeavaliacao.controller.response.Resposta;
import br.com.xp.modulodeavaliacao.model.Professor;
import br.com.xp.modulodeavaliacao.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professores")
@CrossOrigin
public class ProfessorController {
    private final ProfessorService professorService;
    @Autowired
    private ApplicationEventPublisher publisher;

    @Autowired
    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @GetMapping
    public List<Professor> todos() {
        return professorService.todos();
    }

    @GetMapping("/{id}")
    public Resposta<Professor> buscaPor(@PathVariable Integer id) {
        Professor professor = professorService.buscaPor(id);
        return Resposta.comDadosDe(professor);
    }
}
