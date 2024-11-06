package Projeto.Matricula.Matricula_aluno.repository;

import Projeto.Matricula.Matricula_aluno.form.AlunoAtualizarForm;
import Projeto.Matricula.Matricula_aluno.form.AlunoForm;
import Projeto.Matricula.Matricula_aluno.model.Aluno;
import Projeto.Matricula.Matricula_aluno.model.AvaliacaoFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {



}


