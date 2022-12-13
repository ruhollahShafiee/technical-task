package org.acme.resource;


import org.acme.service.OperationTypeService;
import org.acme.service.dto.OperationTypeDto;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/operationType")
public class OperationTypeResource {

    @Inject
    private OperationTypeService operationTypeService;

    @Path("/add")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(@RequestBody OperationTypeDto operationTypeDto) {

        operationTypeService.add(operationTypeDto);
        return Response.ok().build();

    }

    @Path("/all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() {

        return Response.ok(operationTypeService.findAll()).build();

    }
}
