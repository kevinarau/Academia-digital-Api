package Projeto.Matricula.Matricula_aluno.controller;

import Projeto.Matricula.Matricula_aluno.form.MatriculaForm;
import Projeto.Matricula.Matricula_aluno.model.AvaliacaoFisica;
import Projeto.Matricula.Matricula_aluno.model.Matricula;
import Projeto.Matricula.Matricula_aluno.service.MatriculaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matricula")
public class matriculaController {


    @Autowired
    private MatriculaService Service;


    @PostMapping
    public Matricula CriarMatricula(@RequestBody MatriculaForm form) {
        return Service.CriaMatricula(form);

    }

    @GetMapping("/buscar/{id}")
    public Matricula buscar(@PathVariable Long id) {
        return Service.Buscar(id);
    }

    @GetMapping
    public List<Matricula> ListaMatricula(@RequestParam(value = "bairro", required = false) String bairro) {
        return Service.ListaMatricula(bairro);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Long> deleta(@PathVariable Long id) {
        Service.deletar(id);
        return ResponseEntity.ok(id);

    }

}