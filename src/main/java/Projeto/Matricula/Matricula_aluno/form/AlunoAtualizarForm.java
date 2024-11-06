package Projeto.Matricula.Matricula_aluno.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoAtualizarForm {
    private String nome;

    private String bairro;

    private LocalDate DataDeNascimento = LocalDate.now();
}
