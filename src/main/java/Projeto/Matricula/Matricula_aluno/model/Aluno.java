package Projeto.Matricula.Matricula_aluno.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_aluno")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String cpf;

    private String bairro;

    private LocalDate dataNascimento;

    @OneToMany(mappedBy = "aluno", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<AvaliacaoFisica> avaliacaoFisica = new ArrayList<>();
}
