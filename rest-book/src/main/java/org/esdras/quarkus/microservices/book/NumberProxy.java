package org.esdras.quarkus.microservices.book;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

//SE CRIA UM MEIO DE COMUNICAÇÃO COM O OUTRO MICROSERVIÇO
//PARA ISSO SE USA O MICROPROFILE REST CLIENT
@RegisterRestClient(configKey = "number.proxy")
@Path("/api/numbers")
public interface NumberProxy {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    IsbnThirteen generateIsbnNumbers();
}
