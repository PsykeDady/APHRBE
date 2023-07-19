package co.psyke.serializers;

import java.io.IOException;
import java.time.LocalDateTime;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class LocalDateTimeSerializer extends StdSerializer<LocalDateTime> {
	
	public LocalDateTimeSerializer() {
		this(null);
	}

	public LocalDateTimeSerializer(Class<LocalDateTime> clazz) {
		super(clazz);
	}

	@Override
	public void serialize(LocalDateTime arg0, JsonGenerator gen, SerializerProvider arg2) throws IOException {
		gen.writeStartObject();
		gen.writeObject(arg0);
		gen.writeEndObject();
		
	}
}
