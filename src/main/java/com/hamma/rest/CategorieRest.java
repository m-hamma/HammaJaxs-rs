package com.hamma.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/categories")
public class CategorieRest {
	@GET
	// @Produces(MediaType.APPLICATION_JSON)
	public Response lister() {
		return Response.status(200).entity("Bonjour").build();
	}
}
