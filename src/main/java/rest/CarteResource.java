package rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import domain.Carte;
import io.swagger.v3.oas.annotations.Parameter;

@Path("/carte")
@Produces({"application/json", "application/xml"})
public class CarteResource {

  @GET
  @Path("/{carteId}")
  public Carte getCarteById(@PathParam("carte") Long carteId)  {
    return new Carte();
  }
  
  @POST
  @Consumes("application/json")
  public Response addCarte(
      @Parameter(description = "Carte object that needs to be added to the store", required = true) Carte carte) {
    return Response.ok().entity("SUCCESS").build();
  }
}