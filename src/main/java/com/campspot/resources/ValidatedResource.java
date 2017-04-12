package com.campspot.resources;

import com.campspot.api.Bar;
import com.campspot.api.Foo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/validated")
public class ValidatedResource {
    private final Logger logger = LoggerFactory.getLogger(ValidatedResource.class);

    @GET
    @Path("/foo")
    @Valid
    public Foo getFoo() {
        logger.info("######################### GET FOO");
        return new Foo("bloop");
    }

    @GET
    @Path("/bar")
    public Bar getBar() {
        logger.info("######################### GET BAR");
        return new Bar(27);
    }
}
