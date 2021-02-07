package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import io.smallrye.mutiny.Uni;

@Path("/fruits")
public class Fruits {

    @GET
    public Uni<String> hello() {
        return Uni.createFrom().item("Hello RESTEasy Reactive");
    }
}
