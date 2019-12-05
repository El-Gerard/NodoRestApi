package com.uniminuto.cliente;
import com.uniminuto.core.Guardar;

public class ActivarCliente {
    
    public int totalSuma;
    
     public String Total() {

        for (int i = 0; i < Guardar.listaNodos.size(); i++) {
           
            String BASE_URI = Guardar.listaNodos.get(i);
            Cliente cli = new Cliente(BASE_URI);
            totalSuma = totalSuma+Integer.parseInt(cli.getSuma("0"));            
        }
        
        return Integer.toString(totalSuma);
    }
    
    
}
