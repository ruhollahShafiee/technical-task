package org.acme.resource;

import org.acme.service.SmartModelService;
import org.acme.service.dto.SmartModelDto;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/smartObject")
public class SmartObjectResource {

    private SmartModelService smartModelService;

    @Inject
    public SmartObjectResource(SmartModelService smartModelService) {

        this.smartModelService = smartModelService;

    }

    @Path("/add")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(@RequestBody SmartModelDto smartModelDto) {

        smartModelService.add(smartModelDto);
        return Response.ok().build();

    }

    @Path("/all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() {

        return Response.ok(smartModelService.findAll()).build();

    }

    @Path("/all/sort")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll(@QueryParam("property") String property, @QueryParam("sortOp") String sortOp) {

        return Response.ok(smartModelService.findAll(property, sortOp)).build();

    }
}