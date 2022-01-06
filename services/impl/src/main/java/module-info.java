module linuxcounter.services.impl {
  exports io.github.linuxcounter.services.impl;

  requires linuxcounter.common.value;
  requires linuxcounter.services.api;

  requires jakarta.enterprise.cdi.api;
  requires java.transaction;
  requires linuxcounter.repository.api;
  requires javax.inject;
}
