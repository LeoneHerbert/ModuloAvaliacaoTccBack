package br.com.xp.modulodeavaliacao.service;

import br.com.xp.modulodeavaliacao.model.Banca;
import br.com.xp.modulodeavaliacao.repository.BancaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BancaService {
    private final BancaRepository bancaRepository;

    private final GenericService<Banca> genericService;

    @Autowired
    public BancaService(BancaRepository bancaRepository) {
        this.bancaRepository = bancaRepository;
        this.genericService = new GenericService<Banca>(bancaRepository);
    }

    @Transactional
    public Banca salva(Banca banca) {
        return this.genericService.salva(banca);
    }

    @Transactional(readOnly = true)
    public Banca buscaPor(Integer id) {
        return this.genericService.buscaPor(id);
    }

    @Transactional(readOnly = true)
    public List<Banca> todos() {
        return genericService.todos();
    }

    @Transactional
    public Banca atualiza(Banca banca, Integer id) {
        return this.genericService.atualiza(banca, id);
    }

    @Transactional
    public void excluir(Integer id) {
        this.genericService.excluirPor(id);
    }
}
