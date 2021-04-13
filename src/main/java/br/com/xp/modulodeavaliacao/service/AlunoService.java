package br.com.xp.modulodeavaliacao.service;

import br.com.xp.modulodeavaliacao.model.Aluno;
import br.com.xp.modulodeavaliacao.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {
    private final AlunoRepository alunoRepository;

    private final GenericService<Aluno> genericService;

    @Autowired
    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
        this.genericService = new GenericService<Aluno>(alunoRepository);
    }

    @Transactional
    public Aluno salva(Aluno aluno ) {
        return this.genericService.salva(aluno);
    }

    @Transactional(readOnly = true)
    public Aluno buscaPor(Integer id) {
        return this.genericService.buscaPor(id);
    }

    @Transactional(readOnly = true)
    public Optional<Aluno> buscaPor(String nome) {
        return Optional.ofNullable(alunoRepository.findByNome(nome));
    }

    @Transactional(readOnly = true)
    public List<Aluno> todos() {
        return genericService.todos();
    }

    @Transactional
    public Aluno atualiza(Aluno aluno, Integer id) {
        return this.genericService.atualiza(aluno, id);
    }

    @Transactional
    public void excluir(Integer id) {
        this.genericService.excluirPor(id );
    }
}
