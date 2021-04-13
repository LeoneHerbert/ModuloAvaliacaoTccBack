package br.com.xp.modulodeavaliacao.service;

import br.com.xp.modulodeavaliacao.model.Tcc;
import br.com.xp.modulodeavaliacao.repository.TccRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TccService {
    private final TccRepository tccRepository;

    private final GenericService<Tcc> genericService;

    @Autowired
    public TccService(TccRepository tccRepository) {
        this.tccRepository = tccRepository;
        this.genericService = new GenericService<Tcc>(tccRepository);
    }

    @Transactional
    public Tcc salva(Tcc tcc) {
        return this.genericService.salva(tcc);
    }

    @Transactional(readOnly = true)
    public Tcc buscaPor(Integer id) {
        return this.genericService.buscaPor(id);
    }

    @Transactional(readOnly = true)
    public List<Tcc> todos() {
        return genericService.todos();
    }

    @Transactional
    public Tcc atualiza(Tcc tcc, Integer id) {
        return this.genericService.atualiza(tcc, id);
    }

    @Transactional
    public void excluir(Integer id) {
        this.genericService.excluirPor(id);
    }
}
