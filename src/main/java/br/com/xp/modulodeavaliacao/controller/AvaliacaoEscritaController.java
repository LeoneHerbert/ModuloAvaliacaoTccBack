package br.com.xp.modulodeavaliacao.controller;

import br.com.xp.modulodeavaliacao.controller.event.HeaderLocationEvent;
import br.com.xp.modulodeavaliacao.controller.response.Erro;
import br.com.xp.modulodeavaliacao.controller.response.Resposta;
import br.com.xp.modulodeavaliacao.controller.validation.Validacao;
import br.com.xp.modulodeavaliacao.model.AvaliacaoEscrita;
import br.com.xp.modulodeavaliacao.service.AvaliacaoEscritaService;
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
@RequestMapping("/avaliacoes-escritas")
@CrossOrigin
public class AvaliacaoEscritaController {
    @Autowired
    private ApplicationEventPublisher publisher;

    private final AvaliacaoEscritaService avaliacaoEscritaService;

    @Autowired
    public AvaliacaoEscritaController(AvaliacaoEscritaService avaliacaoEscritaService) {
        this.avaliacaoEscritaService = avaliacaoEscritaService;
    }

    @PostMapping
    public ResponseEntity<AvaliacaoEscrita> cria(@Validated @RequestBody AvaliacaoEscrita avaliacaoEscrita, HttpServletResponse response) {
        AvaliacaoEscrita avaliacaoEscritaSalvo = avaliacaoEscritaService.salva(avaliacaoEscrita);

        publisher.publishEvent(new HeaderLocationEvent(this, response, avaliacaoEscritaSalvo.getId()));

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(avaliacaoEscritaSalvo);
    }

    @GetMapping
    public List<AvaliacaoEscrita> todos() {
        return avaliacaoEscritaService.todos();
    }

    @GetMapping("/{id}")
    public Resposta<AvaliacaoEscrita> buscaPor(@PathVariable Integer id) {
        AvaliacaoEscrita avaliacaoEscrita = avaliacaoEscritaService.buscaPor(id);
        return Resposta.comDadosDe(avaliacaoEscrita);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Resposta<AvaliacaoEscrita>> atualiza(@PathVariable Integer id, @Validated @RequestBody AvaliacaoEscrita avaliacaoEscrita) {
        List<Erro> erros = this.getErros(avaliacaoEscritaService.buscaPor(id));
        if (existe(erros)) {
            return ResponseEntity.badRequest().body(Resposta.com(erros));
        }

        AvaliacaoEscrita avaliacaoEscritaAtualizado = avaliacaoEscritaService.atualiza(avaliacaoEscrita, id);
        return ResponseEntity.ok(Resposta.comDadosDe(avaliacaoEscritaAtualizado));
    }

    private boolean existe(List<Erro> erros) {
        return Objects.nonNull(erros) && !erros.isEmpty();
    }

    private List<Erro> getErros(AvaliacaoEscrita avaliacaoEscrita) {
        Validacao<AvaliacaoEscrita> validacao = new Validacao<>();
        return validacao.valida(avaliacaoEscrita);
    }
}
