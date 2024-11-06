package Projeto.Matricula.Matricula_aluno.infra.config.serea;

import Projeto.Matricula.Matricula_aluno.infra.util.JavaTimeUtils;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeSerealizar  extends StdSerializer<LocalDateTime> {


    private static final long serialVersionUID = -6347158617481757931L;

    public LocalDateTimeSerealizar() {
        super(LocalDateTime.class);
    }


    @Override
    public void serialize(final LocalDateTime value, final JsonGenerator generator, final SerializerProvider provider) throws IOException {
        generator.writeString(value.format(JavaTimeUtils.LOCAL_DATE_TIME_FORMATTER));
    }
}
