package org.acme.resource;


import org.acme.service.DeviceTypeService;
import org.acme.service.dto.DeviceTypeDto;
import org.bson.types.ObjectId;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/deviceType")
public class DeviceTypeResource {

    private DeviceTypeService deviceTypeService;

    @Inject
    public DeviceTypeResource(DeviceTypeService deviceTypeService) {

        this.deviceTypeService = deviceTypeService;

    }

    @Path("/add")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response add(@RequestBody DeviceTypeDto deviceTypeDto) {

        deviceTypeService.add(deviceTypeDto);
        return Response.ok().build();

    }

    @Path("/find/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findById(@PathParam("id") ObjectId id) {

        deviceTypeService.findById(id);
        return Response.ok().build();

    }

    @Path("/all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() {

        return Response.ok(deviceTypeService.findAll()).build();

    }
}
