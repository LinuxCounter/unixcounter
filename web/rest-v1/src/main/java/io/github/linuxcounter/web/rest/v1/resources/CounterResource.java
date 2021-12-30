package io.github.linuxcounter.web.rest.v1.resources;

import io.github.linuxcounter.common.value.ReportData;
import io.github.linuxcounter.services.api.CounterService;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import org.apache.shiro.authz.annotation.RequiresUser;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path("/count")
@RequestScoped
@Tag(name = "counter")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class CounterResource {

  @Inject
  private CounterService counterService;

  @POST
  @RequiresUser
  public Response postCount(
      @RequestBody(
          required = true,
          content = @Content(
              mediaType = "application/json",
              schema = @Schema(required = true, ref = "#/components/schemas/ReportData")
          )
      )
          ReportData reportData) {
    return Response.status(Status.NOT_IMPLEMENTED)
        .build();
  }

  @POST
  @Path("/anon")
  public Response postCountAnonymous(
      @RequestBody(
          required = true,
          content = @Content(
              mediaType = "application/json",
              schema = @Schema(required = true, ref = "#/components/schemas/ReportData")
          )
      )
          ReportData reportData) {

    counterService.countAnonymous(reportData);

    return Response.status(Status.NOT_IMPLEMENTED)
        .build();
  }

  public CounterService getCounterService() {
    return counterService;
  }

  public void setCounterService(CounterService counterService) {
    this.counterService = counterService;
  }
}
