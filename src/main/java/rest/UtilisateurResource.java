package rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import dao.DAOUtilisateur;
import domain.Utilisateur;
import io.swagger.v3.oas.annotations.Parameter;

@Path("/utilisateur")
@Produces({"application/json", "application/xml"})
public class UtilisateurResource {

  @GET
  @Path("/{utilisateurId}")
  public Utilisateur getUtilisateurById(@PathParam("utilisateurId") Long utilisateurId)  {
    DAOUtilisateur daoUtilisateur = new DAOUtilisateur();
    return daoUtilisateur.findOne(utilisateurId);
      // return new Utilisateur();
  }

  @POST
  @Consumes("application/json")
  public Response addUtilisateur(
      @Parameter(description = "Utilisateur object that needs to be added to the store", required = true) Utilisateur utilisateur) {
    return Response.ok().entity("SUCCESS").build();
  }
}