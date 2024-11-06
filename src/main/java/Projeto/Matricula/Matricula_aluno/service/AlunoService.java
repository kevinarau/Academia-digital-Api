package Projeto.Matricula.Matricula_aluno.service;


import Projeto.Matricula.Matricula_aluno.form.AlunoAtualizarForm;
import Projeto.Matricula.Matricula_aluno.form.AlunoForm;
import Projeto.Matricula.Matricula_aluno.model.Aluno;
import Projeto.Matricula.Matricula_aluno.model.AvaliacaoFisica;
import Projeto.Matricula.Matricula_aluno.repository.AlunoRepository;
import Projeto.Matricula.Matricula_aluno.repository.AvaliacaoFisicaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
            aluno.setDataNascimento(alunoForm.getDataDeNascimento());

        return alunoRepository.save(aluno);
    }


    public Aluno BuscarAluno(Long id) {
        return alunoRepository.findById(id).get();
    }

    public List<Aluno> ListaAluno() {
        return alunoRepository.findAll();
    }

    public Aluno AtualizarFormulario(Long id, AlunoAtualizarForm formularioAtualizar) {
        return null;
    }


    public void delete(Long id) {
        alunoRepository.deleteById(id);

    }


    public List<AvaliacaoFisica> BuscarAvaliacaoFisicaId(Long id) {
        return List.of();
    }

    public List<AvaliacaoFisica> ListaAvalicao(Long id) {
        Aluno aluno = alunoRepository.findById(id).get();
        return aluno.getAvaliacaoFisica();
    }
}
