module linuxcounter.repository.impl.jpa {
  exports io.github.linuxcounter.repository.impl.jpa;

  requires jakarta.enterprise.cdi.api;
  requires linuxcounter.common.value;
  requires linuxcounter.repository.api;
  requires java.persistence;
  requires linuxcounter.common.ulid;
  requires org.immutables.builder;
  requires org.immutables.value.annotations;
}
