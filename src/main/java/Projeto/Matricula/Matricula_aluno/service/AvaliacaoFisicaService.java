package Projeto.Matricula.Matricula_aluno.service;

import Projeto.Matricula.Matricula_aluno.form.AvaliacaoAtualizarForm;
import Projeto.Matricula.Matricula_aluno.form.AvaliacaoFisicaForm;
import Projeto.Matricula.Matricula_aluno.model.Aluno;
import Projeto.Matricula.Matricula_aluno.model.AvaliacaoFisica;
import Projeto.Matricula.Matricula_aluno.repository.AlunoRepository;
import Projeto.Matricula.Matricula_aluno.repository.AvaliacaoFisicaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRespository avaliacaoFisica;

    @Autowired
    private AlunoRepository alunoRepository;

    public AvaliacaoFisica CriarAvaliacao (AvaliacaoFisicaForm  form) {

        AvaliacaoFisica avaliacao = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

             avaliacao.setAluno(aluno);
            avaliacao.setPeso(form.getPeso());
            avaliacao.setAltura(form.getAltura());

           return avaliacaoFisica.save(avaliacao);
        }




    public AvaliacaoFisica BuscarAvaliacao(Long id) {
        return null;
    }

    public List<AvaliacaoFisica> ListaAvaliacaoFisica() {
        return List.of();
    }

    public AvaliacaoFisica AtualizarAvaliacao(Long id, AvaliacaoAtualizarForm formularioAtualizar) {
        return null;
    }

    public void delete(Long id) {

    }
}
