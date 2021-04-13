package br.com.xp.modulodeavaliacao.service;

import br.com.xp.modulodeavaliacao.model.AvaliacaoDaApresentacao;
import br.com.xp.modulodeavaliacao.repository.AvaliacaoDaApresentacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AvaliacaoDaApresentacaoService {
    private final AvaliacaoDaApresentacaoRepository avaliacaoDaApresentacaoRepository;

    private final GenericService<AvaliacaoDaApresentacao> genericService;

    @Autowired
    public AvaliacaoDaApresentacaoService(AvaliacaoDaApresentacaoRepository avaliacaoDaApresentacaoRepository) {
        this.avaliacaoDaApresentacaoRepository = avaliacaoDaApresentacaoRepository;
        this.genericService = new GenericService<AvaliacaoDaApresentacao>(avaliacaoDaApresentacaoRepository);
    }

    @Transactional
    public AvaliacaoDaApresentacao salva(AvaliacaoDaApresentacao avaliacaoDaApresentacao) {
        return this.genericService.salva(avaliacaoDaApresentacao);
    }

    @Transactional(readOnly = true)
    public AvaliacaoDaApresentacao buscaPor(Integer id) {
        return this.genericService.buscaPor(id);
    }

    @Transactional(readOnly = true)
    public List<AvaliacaoDaApresentacao> todos() {
        return genericService.todos();
    }

    @Transactional
    public AvaliacaoDaApresentacao atualiza(AvaliacaoDaApresentacao avaliacaoDaApresentacao, Integer id) {
        return this.genericService.atualiza(avaliacaoDaApresentacao, id);
    }

    @Transactional
    public void excluir(Integer id) {
        this.genericService.excluirPor(id);
    }
}
