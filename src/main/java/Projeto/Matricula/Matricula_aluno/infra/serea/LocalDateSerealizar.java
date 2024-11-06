package Projeto.Matricula.Matricula_aluno.infra.serea;

import Projeto.Matricula.Matricula_aluno.infra.util.JavaTimeUtils;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.time.LocalDate;

public class LocalDateSerealizar  extends StdSerializer<LocalDate> {

    private static final long serialVersionUID = -7209271947629593913L;

    public LocalDateSerealizar() {
        super(LocalDate.class);
    }

    @Override
    public void serialize(final LocalDate value, final JsonGenerator generator, final SerializerProvider provider) throws IOException {
        generator.writeString(value.format(JavaTimeUtils.LOCAL_DATE_FORMATTER));

    }
}
