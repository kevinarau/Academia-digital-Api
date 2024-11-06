package Projeto.Matricula.Matricula_aluno.infra.deser;

import Projeto.Matricula.Matricula_aluno.infra.util.JavaTimeUtils;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDateTime;

public class LocalDateTimeDeseralizar extends StdDeserializer<LocalDateTime> {

    private static final long serialVersionUID = -7209271947629593913L;

    public LocalDateTimeDeseralizar() {
        super(LocalDateTime.class);
    }

    @Override
    public LocalDateTime deserialize(final JsonParser parser, final DeserializationContext context) throws IOException {
        return LocalDateTime.parse(parser.readValueAs(String.class), JavaTimeUtils.LOCAL_DATE_TIME_FORMATTER);
    }
}
