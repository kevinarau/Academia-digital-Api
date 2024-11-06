package Projeto.Matricula.Matricula_aluno.service;


import Projeto.Matricula.Matricula_aluno.form.AlunoAtualizarForm;
import Projeto.Matricula.Matricula_aluno.form.AlunoForm;
import Projeto.Matricula.Matricula_aluno.infra.util.JavaTimeUtils;
import Projeto.Matricula.Matricula_aluno.model.Aluno;
import Projeto.Matricula.Matricula_aluno.model.AvaliacaoFisica;
import Projeto.Matricula.Matricula_aluno.repository.AlunoRepository;
import Projeto.Matricula.Matricula_aluno.repository.AvaliacaoFisicaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {



    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private AvaliacaoFisicaRespository avaliacaoFisica;


    public Aluno CriarAluno(AlunoForm alunoForm) {
        Aluno aluno =  new Aluno();
            aluno.setNome(alunoForm.getNome());
            aluno.setCpf(alunoForm.getCpf());
            aluno.setBairro(alunoForm.getBairro());
            aluno.setDataDeNascimento(alunoForm.getDataDeNascimento());

        return alunoRepository.save(aluno);
    }


    public Aluno BuscarAluno(Long id) {
        return alunoRepository.findById(id).get();
    }

    public List<Aluno> ListaAluno(String DataDeNascimento) {
        if (DataDeNascimento ==  null){
            return alunoRepository.findAll();
        }
        LocalDate localDate = LocalDate.parse(DataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
        return alunoRepository.findBydataDeNascimento(localDate);
    }



    public void AtualizarFormulario(Long id, AlunoAtualizarForm formularioAtualizar) {
        Optional<Aluno> alunos = alunoRepository.findById(id);
        if (alunos.isPresent() ){
            Aluno aluno = alunos.get();
            aluno.setNome(formularioAtualizar.getNome());
            aluno.setBairro(formularioAtualizar.getBairro());
            aluno.setDataDeNascimento(formularioAtualizar.getDataDeNascimento());

             alunoRepository.save(aluno);
        }

    }


    public void delete(Long id) {
        alunoRepository.deleteById(id);

    }


    public List<AvaliacaoFisica> BuscarAvaliacaoFisicaId(Long id) {
        Aluno aluno = alunoRepository.findById(id).get();
        return aluno.getAvaliacaoFisica();
    }

    public List<AvaliacaoFisica> ListaAvalicao(Long id) {
        Aluno aluno = alunoRepository.findById(id).get();
        return aluno.getAvaliacaoFisica();
    }
}
