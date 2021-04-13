package br.com.xp.modulodeavaliacao.service;

import br.com.xp.modulodeavaliacao.model.Curso;
import br.com.xp.modulodeavaliacao.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CursoService {
    private final CursoRepository cursoRepository;

    private final GenericService<Curso> genericService;

    @Autowired
    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
        this.genericService = new GenericService<Curso>(cursoRepository);
    }

    @Transactional
    public Curso salva(Curso curso) {
        return this.genericService.salva(curso);
    }

    @Transactional(readOnly = true)
    public Curso buscaPor(Integer id) {
        return this.genericService.buscaPor(id);
    }

    @Transactional(readOnly = true)
    public List<Curso> todos() {
        return genericService.todos();
    }

    @Transactional
    public Curso atualiza(Curso curso, Integer id) {
        return this.genericService.atualiza(curso, id);
    }

    @Transactional
    public void excluir(Integer id) {
        this.genericService.excluirPor(id);
    }
}
