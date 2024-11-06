package Projeto.Matricula.Matricula_aluno.repository;

import Projeto.Matricula.Matricula_aluno.form.MatriculaForm;
import Projeto.Matricula.Matricula_aluno.model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatriculaRespository extends JpaRepository<Matricula,Long> {


     List<Matricula> findByAlunoBairro(String bairro);
}
