package Projeto.Matricula.Matricula_aluno.form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaForm {
    @NotNull(message = "Preencha o campo corretamente.")
   @Positive(message = "O Id do aluno precisa ser positivo.")
    private Long alunoId;

    private LocalDateTime dataMatricula = LocalDateTime.now();
}
