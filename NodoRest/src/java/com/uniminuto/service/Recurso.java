/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniminuto.service;

import com.uniminuto.cliente.ActivarCliente;
import com.uniminuto.core.Guardar;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author Dario
 */
@Path("Nodo")
public class Recurso {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Recurso
     */
    public Recurso() {
    }

    /**
     * Retrieves representation of an instance of
     * com.uniminuto.proj.GenericResource
     *
     * @param nombre
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/Anumero")
    //@Produces(MediaType.APPLICATION_XML)
    @Produces("text/plain")
    public String getSuma(@QueryParam("numero") String num) {
        
        Guardar.resul(num);
        return Integer.toString(Guardar.sumaInterna);
    }   

    @GET
    @Path("/Anodo")
    //@Produces(MediaType.APPLICATION_XML)
    @Produces("text/plain")
    public String agregarNodo(@QueryParam("nodo") String nodo) {
        
        Guardar.ListaN(nodo);
        return Integer.toString(Guardar.listaNodos.size());
    }

    @GET
    @Path("/Consultar")
    //@Produces(MediaType.APPLICATION_XML)
    @Produces("text/plain")
    public String consultarSuma() {

        ActivarCliente act = new ActivarCliente();
        int sumGlobal = Integer.parseInt(act.Total());
        String total = Integer.toString(sumGlobal + Guardar.sumaInterna);
        return total;
    }
}