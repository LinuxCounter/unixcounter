package io.github.linuxcounter.repository.impl.jpa.mapper;

import io.github.linuxcounter.common.ulid.ULID;
import io.github.linuxcounter.common.value.AnonymousReportData;
import io.github.linuxcounter.repository.impl.jpa.pdo.AnonymousReportDataPdo;
import io.github.linuxcounter.repository.impl.jpa.pdo.AnonymousReportDataPdoBuilder;

public class AnonymousReportDataMapper {

  public static AnonymousReportDataPdo toPdo(AnonymousReportData reportData) {
    return new AnonymousReportDataPdoBuilder()
        .id(ULID.randomULID())
        .build();
  }
}
