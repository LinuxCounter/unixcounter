package io.github.linuxcounter.repository.impl.jpa.pdo;

import io.github.linuxcounter.common.ulid.ULID;
import io.github.linuxcounter.repository.impl.jpa.converter.ULIDConverter;
import javax.persistence.Basic;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.immutables.builder.Builder;

@Entity
@Table(name = "REPORT_DATA_ANON")
public class AnonymousReportDataPdo {

  @Id
  @Basic
  @Convert(converter = ULIDConverter.class)
  private ULID id;

  public AnonymousReportDataPdo() {
  }

  @Builder.Constructor
  public AnonymousReportDataPdo(ULID id) {
    this.id = id;
  }

  public ULID getId() {
    return id;
  }

  public void setId(ULID id) {
    this.id = id;
  }
}
