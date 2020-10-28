package org.acme.commandmode.rest;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.acme.commandmode.dao.TodoDao;

@Path("todo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TodoRest {
    
    @GET
    @Path("/{nome}")
    public Response adicionarLista(@PathParam("nome") String nome) {
        return Response.status(Status.ACCEPTED).build();
    }

    @GET
    @Path("/")
    public Response obterLista() {
        return Response.status(Status.OK).entity(null).build();
    }
}
