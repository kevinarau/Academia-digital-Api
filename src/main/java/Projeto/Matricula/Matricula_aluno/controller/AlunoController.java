package Projeto.Matricula.Matricula_aluno.controller;

import Projeto.Matricula.Matricula_aluno.form.AlunoAtualizarForm;
import Projeto.Matricula.Matricula_aluno.form.AlunoForm;
import Projeto.Matricula.Matricula_aluno.model.Aluno;
import Projeto.Matricula.Matricula_aluno.model.AvaliacaoFisica;
import Projeto.Matricula.Matricula_aluno.service.AlunoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;


    @GetMapping
    public List<Aluno> ListaAluno(@RequestParam(value = "dataDeNascimento", required = false) String DataDeNascimento) {
        return alunoService.ListaAluno(DataDeNascimento);
    }


    @PostMapping
    public Aluno CriarAluno(@RequestBody AlunoForm form) {
        return alunoService.CriarAluno(form);
    }

    @GetMapping("/list/{id}")
    public List<AvaliacaoFisica> ListaAvaliacao(@PathVariable Long id) {
        return alunoService.ListaAvalicao(id);
    }

    @GetMapping("/{id}")
    public Aluno buscarAluno(@PathVariable Long id ){
        return alunoService.BuscarAluno(id);
    }

    @GetMapping("/buscar/{id}")
    public List<AvaliacaoFisica> buscarAvaliacao(@PathVariable Long id){
        return  alunoService.BuscarAvaliacaoFisicaId(id);


    }

    @PutMapping("/{id}")
    public ResponseEntity<AlunoAtualizarForm> AtualizarFormulario(@PathVariable Long id , @RequestBody AlunoAtualizarForm formularioAtualizar){
            alunoService.AtualizarFormulario(id, formularioAtualizar);
          return  ResponseEntity.ok(formularioAtualizar);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> deleta(@PathVariable Long id) {
        alunoService.delete(id);
        return ResponseEntity.ok(id);
    }

}


  

