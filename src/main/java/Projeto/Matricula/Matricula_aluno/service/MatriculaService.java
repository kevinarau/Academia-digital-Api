package Projeto.Matricula.Matricula_aluno.service;

import Projeto.Matricula.Matricula_aluno.form.MatriculaForm;
import Projeto.Matricula.Matricula_aluno.model.Matricula;
import Projeto.Matricula.Matricula_aluno.repository.MatriculaRespository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MatriculaService  {

    @Autowired
    private MatriculaRespository matriculaRespository;


    public Matricula CriaMatricula(MatriculaForm form) {
        return null;
    }

    public Matricula Buscar(Long id) {
        return null;
    }

    public List<Matricula> ListaMatricula(String bairro) {
        return List.of();
    }

    public void deletar(Long id) {

    }
}
