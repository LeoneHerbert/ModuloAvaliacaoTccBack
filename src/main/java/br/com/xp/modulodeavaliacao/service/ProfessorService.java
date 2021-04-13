package br.com.xp.modulodeavaliacao.service;

import br.com.xp.modulodeavaliacao.model.Professor;
import br.com.xp.modulodeavaliacao.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {
    private final ProfessorRepository professorRepository;

    private final GenericService<Professor> genericService;

    @Autowired
    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
        this.genericService = new GenericService<Professor>(professorRepository);
    }

    @Transactional
    public Professor salva(Professor professor) {
        return this.genericService.salva(professor);
    }

    @Transactional(readOnly = true)
    public Professor buscaPor(Integer id) {
        return this.genericService.buscaPor(id);
    }

    @Transactional(readOnly = true)
    public Optional<Professor> buscaPor(String nome) {
        return Optional.ofNullable(professorRepository.findByNome(nome));
    }

    @Transactional(readOnly = true)
    public List<Professor> todos() {
        return genericService.todos();
    }

    @Transactional
    public Professor atualiza(Professor professor, Integer id) {
        return this.genericService.atualiza(professor, id);
    }

    @Transactional
    public void excluir(Integer id) {
        this.genericService.excluirPor(id);
    }
}
