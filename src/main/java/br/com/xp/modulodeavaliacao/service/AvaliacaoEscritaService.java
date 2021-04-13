package br.com.xp.modulodeavaliacao.service;

import br.com.xp.modulodeavaliacao.model.AvaliacaoEscrita;
import br.com.xp.modulodeavaliacao.repository.AvaliacaoEscritaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AvaliacaoEscritaService {
    private final AvaliacaoEscritaRepository avaliacaoEscritaRepository;

    private final GenericService<AvaliacaoEscrita> genericoService;

    @Autowired
    public AvaliacaoEscritaService(AvaliacaoEscritaRepository avaliacaoEscritaRepository) {
        this.avaliacaoEscritaRepository = avaliacaoEscritaRepository;
        this.genericoService = new GenericService<AvaliacaoEscrita>(avaliacaoEscritaRepository);
    }

    @Transactional
    public AvaliacaoEscrita salva(AvaliacaoEscrita avaliacaoEscrita) {
        return this.genericoService.salva(avaliacaoEscrita);
    }

    @Transactional(readOnly = true)
    public AvaliacaoEscrita buscaPor(Integer id) {
        return this.genericoService.buscaPor(id);
    }

    @Transactional(readOnly = true)
    public List<AvaliacaoEscrita> todos() {
        return genericoService.todos();
    }

    @Transactional
    public AvaliacaoEscrita atualiza(AvaliacaoEscrita avaliacaoEscrita, Integer id) {
        return this.genericoService.atualiza(avaliacaoEscrita, id);
    }

    @Transactional
    public void excluir(Integer id) {
        this.genericoService.excluirPor(id);
    }
}
