package io.github.marchev.jacksonissue.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/echo")
@Produces(APPLICATION_JSON)
@Consumes(APPLICATION_JSON)
public class EchoResource {

	@POST
	public Response echo(Message message) {
		return Response.ok(message).build();
	}
}