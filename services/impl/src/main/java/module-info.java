module linuxcounter.services.impl {
  exports io.github.linuxcounter.services.impl;

  requires linuxcounter.common.value;
  requires linuxcounter.services.api;

  requires jakarta.enterprise.cdi.api;
}
