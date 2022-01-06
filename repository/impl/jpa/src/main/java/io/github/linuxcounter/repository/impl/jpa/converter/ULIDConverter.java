package io.github.linuxcounter.repository.impl.jpa.converter;

import io.github.linuxcounter.common.ulid.ULID;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ULIDConverter implements AttributeConverter<ULID, String> {

  @Override
  public String convertToDatabaseColumn(ULID attribute) {
    return attribute.toString();
  }

  @Override
  public ULID convertToEntityAttribute(String dbData) {
    return ULID.fromString(dbData);
  }
}
