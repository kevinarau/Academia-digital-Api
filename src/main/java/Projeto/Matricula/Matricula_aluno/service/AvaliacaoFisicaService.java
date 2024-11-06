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
        return avaliacaoFisica.findById(id).get();

    }

    public List<AvaliacaoFisica> ListaAvaliacaoFisica() {
        return avaliacaoFisica.findAll();
    }

    public void AtualizarAvaliacao(Long id, AvaliacaoAtualizarForm formularioAtualizar) {
        Optional<AvaliacaoFisica> avaliacao = avaliacaoFisica.findById(id);
     if (avaliacao.isPresent()) {
         AvaliacaoFisica avaliacaoFisica1= avaliacao.get();

         avaliacaoFisica1.setAluno(avaliacaoFisica1.getAluno());
         avaliacaoFisica1.setPeso(formularioAtualizar.getPeso());
         avaliacaoFisica1.setAltura(formularioAtualizar.getAltura());

          avaliacaoFisica.save(avaliacaoFisica1);
     }

     }


}
