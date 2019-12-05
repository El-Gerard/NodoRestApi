/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniminuto.cliente;

import com.uniminuto.core.Guardar;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;

/**
 * Jersey REST client generated for REST resource:Recurso [Nodo]<br>
 * USAGE:
 * <pre>
 *        Cliente client = new Cliente();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author Dario
 */
public class Cliente {

    private WebTarget webTarget;
    private Client client;
    //public String total;
    public int totalSuma;
    //private static final String BASE_URI = "http://localhost:8080/NodoRest/webresources";
    //private static String BASE_URI = "";   

    public Cliente(String BASE_URI) {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("Nodo");
    }

    public String consultarSuma() throws ClientErrorException {
        WebTarget resource = webTarget;
        resource = resource.path("Consultar");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(String.class);
    }

    public String getSuma(String numero) throws ClientErrorException {
        WebTarget resource = webTarget;
        if (numero != null) {
            resource = resource.queryParam("numero", numero);
        }
        resource = resource.path("Anumero");
        return resource.request(javax.ws.rs.core.MediaType.TEXT_PLAIN).get(String.class);
    }

    public String agregarNodo(String nodo) throws ClientErrorException {
        WebTarget resource = webTarget;
        if (nodo != null) {
            resource = resource.queryParam("nodo", nodo);
        }
        resource = resource.path("Anodo");
        return resource.request(javax.ws.rs.core.MediaType.APPLICATION_XML).get(String.class);
    }

    public void putXml(Object requestEntity) throws ClientErrorException {
        webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_XML).put(javax.ws.rs.client.Entity.entity(requestEntity, javax.ws.rs.core.MediaType.APPLICATION_XML));
    }

    public void close() {
        client.close();
    }

}
