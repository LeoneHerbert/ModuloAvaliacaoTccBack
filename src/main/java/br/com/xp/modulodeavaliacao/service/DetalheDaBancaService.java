package br.com.xp.modulodeavaliacao.service;

import br.com.xp.modulodeavaliacao.model.DetalheDaBanca;
import br.com.xp.modulodeavaliacao.repository.DetalheDaBancaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DetalheDaBancaService {
    private final DetalheDaBancaRepository detalheDaDetalheDaBancaRepository;

    private final GenericService<DetalheDaBanca> genericService;

    @Autowired
    public DetalheDaBancaService(DetalheDaBancaRepository detalheDaDetalheDaBancaRepository) {
        this.detalheDaDetalheDaBancaRepository = detalheDaDetalheDaBancaRepository;
        this.genericService = new GenericService<DetalheDaBanca>(detalheDaDetalheDaBancaRepository);
    }

    @Transactional
    public DetalheDaBanca salva(DetalheDaBanca detalheDaDetalheDaBanca) {
        return this.genericService.salva(detalheDaDetalheDaBanca);
    }

    @Transactional(readOnly = true)
    public DetalheDaBanca buscaPor(Integer id) {
        return this.genericService.buscaPor(id);
    }

    @Transactional(readOnly = true)
    public List<DetalheDaBanca> todos() {
        return genericService.todos();
    }

    @Transactional
    public DetalheDaBanca atualiza(DetalheDaBanca detalheDaDetalheDaBanca, Integer id) {
        return this.genericService.atualiza(detalheDaDetalheDaBanca, id);
    }

    @Transactional
    public void excluir(Integer id) {
        this.genericService.excluirPor(id);
    }
}
