package br.com.xp.modulodeavaliacao.service;

import br.com.xp.modulodeavaliacao.model.Defesa;
import br.com.xp.modulodeavaliacao.repository.DefesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DefesaService {
    private final DefesaRepository defesaRepository;

    private final GenericService<Defesa> genericService;

    @Autowired
    public DefesaService(DefesaRepository defesaRepository) {
        this.defesaRepository = defesaRepository;
        this.genericService = new GenericService<Defesa>(defesaRepository);
    }

    @Transactional
    public Defesa salva(Defesa defesa) {
        return this.genericService.salva(defesa);
    }

    @Transactional(readOnly = true)
    public Defesa buscaPor(Integer id) {
        return this.genericService.buscaPor(id);
    }

    @Transactional(readOnly = true)
    public List<Defesa> todos() {
        return genericService.todos();
    }

    @Transactional
    public Defesa atualiza(Defesa defesa, Integer id) {
        return this.genericService.atualiza(defesa, id);
    }

    @Transactional
    public void excluir(Integer id) {
        this.genericService.excluirPor(id);
    }
}
