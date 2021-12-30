module linuxcounter.web.rest.v1 {

  requires linuxcounter.common.value;
  requires linuxcounter.services.api;

  requires java.ws.rs;
  requires java.servlet;
  requires javax.inject;
  requires jakarta.enterprise.cdi.api;
  requires java.json.bind;
  requires microprofile.openapi.api;

  requires shiro.core;
  requires shiro.jaxrs;
  requires shiro.web;
}
