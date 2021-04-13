package br.com.xp.modulodeavaliacao.controller;

import br.com.xp.modulodeavaliacao.controller.event.HeaderLocationEvent;
import br.com.xp.modulodeavaliacao.controller.response.Erro;
import br.com.xp.modulodeavaliacao.controller.response.Resposta;
import br.com.xp.modulodeavaliacao.controller.validation.Validacao;
import br.com.xp.modulodeavaliacao.model.AvaliacaoDaApresentacao;
import br.com.xp.modulodeavaliacao.service.AvaliacaoDaApresentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/avaliacoes-das-apresentacoes")
@CrossOrigin
public class AvaliacaoDaApresentacaoController {
    @Autowired
    private ApplicationEventPublisher publisher;

    private final AvaliacaoDaApresentacaoService avaliacaoDaApresentacaoService;

    @Autowired
    public AvaliacaoDaApresentacaoController(AvaliacaoDaApresentacaoService avaliacaoDaApresentacaoService) {
        this.avaliacaoDaApresentacaoService = avaliacaoDaApresentacaoService;
    }

    @PostMapping
    public ResponseEntity<AvaliacaoDaApresentacao> cria(@Validated @RequestBody AvaliacaoDaApresentacao avaliacaoDaApresentacao, HttpServletResponse response) {
        AvaliacaoDaApresentacao avaliacaoDaApresentacaoSalvo = avaliacaoDaApresentacaoService.salva(avaliacaoDaApresentacao);

        publisher.publishEvent(new HeaderLocationEvent(this, response, avaliacaoDaApresentacaoSalvo.getId()));

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(avaliacaoDaApresentacaoSalvo);
    }

    @GetMapping
    public List<AvaliacaoDaApresentacao> todos() {
        return avaliacaoDaApresentacaoService.todos();
    }

    @GetMapping("/{id}")
    public Resposta<AvaliacaoDaApresentacao> buscaPor(@PathVariable Integer id) {
        AvaliacaoDaApresentacao avaliacaoDaApresentacao = avaliacaoDaApresentacaoService.buscaPor(id);
        return Resposta.comDadosDe(avaliacaoDaApresentacao);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Resposta<AvaliacaoDaApresentacao>> atualiza(@PathVariable Integer id, @Validated @RequestBody AvaliacaoDaApresentacao avaliacaoDaApresentacao) {

        List<Erro> erros = this.getErros(avaliacaoDaApresentacaoService.buscaPor(id));
        if (existe(erros)) {
            return ResponseEntity.badRequest().body(Resposta.com(erros));
        }

        AvaliacaoDaApresentacao avaliacaoDaApresentacaoAtualizado = avaliacaoDaApresentacaoService.atualiza(avaliacaoDaApresentacao, id);
        return ResponseEntity.ok(Resposta.comDadosDe(avaliacaoDaApresentacaoAtualizado));
    }

    private boolean existe(List<Erro> erros) {
        return Objects.nonNull(erros) && !erros.isEmpty();
    }

    private List<Erro> getErros(AvaliacaoDaApresentacao avaliacaoDaApresentacao) {
        Validacao<AvaliacaoDaApresentacao> validacao = new Validacao<>();
        return validacao.valida(avaliacaoDaApresentacao);
    }
}
