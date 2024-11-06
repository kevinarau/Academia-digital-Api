package Projeto.Matricula.Matricula_aluno.repository;

import Projeto.Matricula.Matricula_aluno.form.AvaliacaoAtualizarForm;
import Projeto.Matricula.Matricula_aluno.form.AvaliacaoFisicaForm;
import Projeto.Matricula.Matricula_aluno.model.AvaliacaoFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AvaliacaoFisicaRespository extends JpaRepository<AvaliacaoFisica,Long> {

}


