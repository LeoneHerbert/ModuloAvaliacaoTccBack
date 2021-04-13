package br.com.xp.modulodeavaliacao.service;

import br.com.xp.modulodeavaliacao.model.Titulacao;
import br.com.xp.modulodeavaliacao.repository.TitulacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TitulacaoService {
    private final TitulacaoRepository titulacaoRepository;

    private final GenericService<Titulacao> genericService;

    @Autowired
    public TitulacaoService(TitulacaoRepository titulacaoRepository) {
        this.titulacaoRepository = titulacaoRepository;
        this.genericService = new GenericService<Titulacao>(titulacaoRepository);
    }

    @Transactional
    public Titulacao salva(Titulacao titulacao) {
        return this.genericService.salva(titulacao);
    }

    @Transactional(readOnly = true)
    public Titulacao buscaPor(Integer id) {
        return this.genericService.buscaPor(id);
    }

    @Transactional(readOnly = true)
    public List<Titulacao> todos() {
        return genericService.todos();
    }

    @Transactional
    public Titulacao atualiza(Titulacao titulacao, Integer id) {
        return this.genericService.atualiza(titulacao, id);
    }

    @Transactional
    public void excluir(Integer id) {
        this.genericService.excluirPor(id);
    }
}
