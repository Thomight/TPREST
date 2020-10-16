package rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import domain.Tag;
import io.swagger.v3.oas.annotations.Parameter;

@Path("/tag")
@Produces({"application/json", "application/xml"})
public class TagResource {

  @GET
  @Path("/{tagId}")
  public Tag getTagById(@PathParam("tagId") Long tagId)  {
      return new Tag();
  }

  @POST
  @Consumes("application/json")
  public Response addTag(
      @Parameter(description = "Tag object that needs to be added to the store", required = true) Tag tag) {
    return Response.ok().entity("SUCCESS").build();
  }
}