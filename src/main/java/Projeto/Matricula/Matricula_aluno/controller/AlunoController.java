package Projeto.Matricula.Matricula_aluno.controller;

import Projeto.Matricula.Matricula_aluno.form.AlunoForm;
import Projeto.Matricula.Matricula_aluno.model.Aluno;
import Projeto.Matricula.Matricula_aluno.model.AvaliacaoFisica;
import Projeto.Matricula.Matricula_aluno.service.AlunoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

  @Autowired
  private AlunoService alunoService;


  @GetMapping
  public List<Aluno> ListaAluno() {
    return alunoService.ListaAluno();
  }


  @PostMapping
  public Aluno CriarAluno(@RequestBody AlunoForm form) {
    return alunoService.CriarAluno(form);
  }

  @GetMapping("/avaliacao_list/{id}")
  public List<AvaliacaoFisica> ListaAvaliacao(@PathVariable Long id){
    return alunoService.ListaAvalicao(id);
  }

}


  

