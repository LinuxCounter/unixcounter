package io.github.linuxcounter.web.rest.v1.resources;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import org.apache.shiro.authz.annotation.RequiresUser;

@Path("/count")
@RequestScoped
public class CounterResource {

  @POST
  @RequiresUser
  public Response postCount() {
    return Response.status(Status.NOT_IMPLEMENTED)
        .build();
  }

  @POST
  @Path("/anon")
  public Response postCountAnonymous() {
    return Response.status(Status.NOT_IMPLEMENTED)
        .build();
  }
}
