package com.hamma.rest;

import com.hamma.services.CategorieService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.inject.*;
import jakarta.ws.rs.core.Response;

@Path("/categories")
public class CategorieRest {
	@Inject
	CategorieService categorieService;
	@GET
	// @Produces(MediaType.APPLICATION_JSON)
	public Response lister() {
		return Response.status(200).entity(categorieService.lister()).build();
	}
}
