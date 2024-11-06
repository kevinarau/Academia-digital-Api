package Projeto.Matricula.Matricula_aluno.infra.deser;

import Projeto.Matricula.Matricula_aluno.infra.util.JavaTimeUtils;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDate;

public class LocalDateDeseralizar extends StdDeserializer<LocalDate> {

    private static final long serialVersionUID = -4589164298310392227L;

    public LocalDateDeseralizar() {
        super(LocalDate.class);
    }

    @Override
    public LocalDate deserialize(final JsonParser parser, final DeserializationContext context) throws IOException {
        return LocalDate.parse(parser.readValueAs(String.class), JavaTimeUtils.LOCAL_DATE_FORMATTER);
    }
}
