package io.github.linuxcounter.web.rest.v1.err;

import java.util.Map;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
@Produces(MediaType.APPLICATION_JSON)
public class UnsupportedOperationExceptionMapper implements ExceptionMapper<UnsupportedOperationException> {

  @Override
  public Response toResponse(UnsupportedOperationException exception) {
    Map<String, Object> responseEntity = Map.of(
        "message", exception.getMessage()
    );

    return Response.status(Status.NOT_IMPLEMENTED)
        .entity(responseEntity)
        .build();
  }
}
