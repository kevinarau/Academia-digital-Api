package Projeto.Matricula.Matricula_aluno.controller;

import Projeto.Matricula.Matricula_aluno.form.AvaliacaoAtualizarForm;
import Projeto.Matricula.Matricula_aluno.form.AvaliacaoFisicaForm;
import Projeto.Matricula.Matricula_aluno.model.AvaliacaoFisica;
import Projeto.Matricula.Matricula_aluno.repository.AvaliacaoFisicaRespository;
import Projeto.Matricula.Matricula_aluno.service.AvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacao")
public class AvaliacaoController {

    @Autowired
    private AvaliacaoFisicaService avaliacaoFisicaService;


    @PostMapping
    public AvaliacaoFisica CriarAvaliacao(@RequestBody AvaliacaoFisicaForm form) {
        return avaliacaoFisicaService.CriarAvaliacao(form);

    }

    @GetMapping("/buscarAvaliacao/{id}")
    public AvaliacaoFisica buscarAvaliacao(@PathVariable Long id) {
        return avaliacaoFisicaService.BuscarAvaliacao(id);
    }

    @GetMapping
    public List<AvaliacaoFisica> ListaAvaliacaoFisica() {
        return avaliacaoFisicaService.ListaAvaliacaoFisica();
    }
     @PutMapping("/{id}")
    public ResponseEntity<AvaliacaoAtualizarForm>  AtualizarAvaliacao(@PathVariable Long id, @RequestBody AvaliacaoAtualizarForm formularioAtualizar){
        avaliacaoFisicaService.AtualizarAvaliacao(id,formularioAtualizar);
        return ResponseEntity.ok(formularioAtualizar);
     }



}
