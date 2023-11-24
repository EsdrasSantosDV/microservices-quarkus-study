package org.esdras.quarkus.microservices.number;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@ApplicationPath("/")
@OpenAPIDefinition(
        info = @Info(title = "Number API",
                description = "Generates ISBN book numbers",
                version = "1.0",
                contact = @Contact(name = "@esdras", url = "https://twitter.com/agoncal")),
        externalDocs = @ExternalDocumentation(url = "https://github.com/EsdrasSantosDV/microservices-quarkus-study", description = "All the Microservice course code")

)
public class NumberMicroservice extends Application {
}
