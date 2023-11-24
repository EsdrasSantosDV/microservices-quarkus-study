package org.esdras.quarkus.microservices.book;

import jakarta.json.bind.annotation.JsonbProperty;

//CLASSE QUE VAI RECEBER O JSON DO OUTRO MICROSERVIÇO
//E VAI SER USADA PARA CONVERTER O JSON EM UM OBJETO
public class IsbnThirteen {

    @JsonbProperty("isbn_13")
    public String isbn13;
}
