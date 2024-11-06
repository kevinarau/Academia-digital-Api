package Projeto.Matricula.Matricula_aluno.infra.config;


import Projeto.Matricula.Matricula_aluno.infra.config.deser.LocalDateDeseralizar;
import Projeto.Matricula.Matricula_aluno.infra.config.deser.LocalDateTimeDeseralizar;
import Projeto.Matricula.Matricula_aluno.infra.config.serea.LocalDateSerealizar;
import Projeto.Matricula.Matricula_aluno.infra.config.serea.LocalDateTimeSerealizar;
import com.fasterxml.jackson.databind.SerializationFeature;

import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Configuration
public class ObjectMapperConfig implements Jackson2ObjectMapperBuilderCustomizer {

    @Override
    public void customize(Jackson2ObjectMapperBuilder jacksonObjectMapperBuilder) {
        jacksonObjectMapperBuilder.featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
                .serializerByType(LocalDate.class, new LocalDateSerealizar())
                .serializerByType(LocalDateTime.class, new LocalDateTimeSerealizar())
                .deserializerByType(LocalDate.class, new LocalDateDeseralizar())
                .deserializerByType(LocalDateTime.class, new LocalDateTimeDeseralizar());
    }
}
