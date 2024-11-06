package Projeto.Matricula.Matricula_aluno.controller;

import Projeto.Matricula.Matricula_aluno.form.AvaliacaoAtualizarForm;
import Projeto.Matricula.Matricula_aluno.form.AvaliacaoFisicaForm;
import Projeto.Matricula.Matricula_aluno.model.AvaliacaoFisica;
import Projeto.Matricula.Matricula_aluno.repository.AvaliacaoFisicaRespository;
import Projeto.Matricula.Matricula_aluno.service.AvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Avaliacao")
public class AvaliacaoController {

    @Autowired
    private AvaliacaoFisicaService avaliacaoFisicaService;


    @PostMapping
    public AvaliacaoFisica CriarAvaliacao(@RequestBody AvaliacaoFisicaForm form){
        return avaliacaoFisicaService.CriarAvaliacao(form);

    }


}
