package com.uniminuto.core;

import java.util.ArrayList;

public class Guardar {
    
    public static int sumaInterna = 0;
    public static ArrayList<String> listaNodos = new ArrayList();
    
    public static String resul(String num){
        
        int nNum = Integer.valueOf(num);
        sumaInterna = sumaInterna + nNum;
        return sumaInterna+":v";
    }
    
    public static void ListaN(String nodo){
        
        listaNodos.add(nodo);        
        //return "Nodos guardados: "+ listaNodos.size();
    }
    
}
