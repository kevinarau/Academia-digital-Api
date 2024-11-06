package Projeto.Matricula.Matricula_aluno.service;

import Projeto.Matricula.Matricula_aluno.form.MatriculaForm;
import Projeto.Matricula.Matricula_aluno.model.Aluno;
import Projeto.Matricula.Matricula_aluno.model.AvaliacaoFisica;
import Projeto.Matricula.Matricula_aluno.model.Matricula;
import Projeto.Matricula.Matricula_aluno.repository.AlunoRepository;
import Projeto.Matricula.Matricula_aluno.repository.MatriculaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService  {

    @Autowired
    private MatriculaRespository matriculaRespository;


    @Autowired
    private AlunoRepository alunoRepository;

    public Matricula CriaMatricula(MatriculaForm form) {
        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
              matricula.setAluno(aluno);

              return matriculaRespository.save(matricula);
    }

    public Matricula Buscar(Long id) {
        return  matriculaRespository.findById(id).get();

    }


    public List<Matricula> ListaMatricula(String bairro) {
        if (bairro == null) {
            return matriculaRespository.findAll();
        } else {
            return matriculaRespository.findByAlunoBairro(bairro);
        }
    }

    public void deletar(Long id) {
        matriculaRespository.deleteById(id);

    }
}
