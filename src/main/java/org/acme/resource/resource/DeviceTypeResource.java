package org.acme.resource.resource;


import org.acme.resource.service.DeviceTypeService;
import org.acme.resource.service.dto.DeviceTypeDto;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/deviceType")
public class DeviceTypeResource {

    @Inject
    private DeviceTypeService deviceTypeService;

    @Path("/add")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(@RequestBody DeviceTypeDto deviceTypeDto) {

        deviceTypeService.add(deviceTypeDto);
        return Response.ok().build();

    }

    @Path("/all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() {

        return Response.ok(deviceTypeService.findAll()).build();

    }
}
