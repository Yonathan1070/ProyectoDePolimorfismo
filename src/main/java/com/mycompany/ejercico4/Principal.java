/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercico4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Juan Daniel Fetecua
 * @author Yonathan Camilo Bohorquez
 */
public class Principal {
    
    public BufferedReader datos=new BufferedReader(new InputStreamReader (System.in));
    HashMap<Integer,Persona>abuelos;
    Integer i;
    
    Persona h1=new Persona(1,"juan","fetecua");
    Persona h2=new Persona(2,"Jhonatan","Bohorquez");
    Persona h3=new Persona(3,"Victor","Pardo");
    Persona p1=new Persona(4,"Luis","Velandia");
    Persona p2=new Persona(5,"Carlos","Castaño");
    Persona p3=new Persona(6,"Roberto","Lopez");
    Persona a1=new Persona(7,"david","ordoñez");
    Persona a2=new Persona(8,"laura","torres");
    Persona a3=new Persona(9,"camila","rodriguez");
    
    public Principal() throws IOException{
        
               
        p1.getFamilia().put(h1.getId(), h1);
        p2.getFamilia().put(h2.getId(), h2);
        p3.getFamilia().put(h3.getId(), h3);
        a1.getFamilia().put(p1.getId(), p1);
        a2.getFamilia().put(p2.getId(), p2);
        a3.getFamilia().put(p3.getId(), p3);
        a3.getFamilia().put(p2.getId(), p2);
        a3.getFamilia().put(p1.getId(), p1);
            
        abuelos=new HashMap();
        abuelos.put(a1.getId(), a1);
        abuelos.put(a2.getId(), a2);
        abuelos.put(a3.getId(), a3);

        
                    
        //do{ 
        //    System.out.println("\n\n\nDigite la Cedula a Buscar: ");
        //    i =Integer.parseInt(datos.readLine());
        //               
        //    String a=buscar(i);
        //    System.out.println(a);
            
        //}while(i!=0);                
    }
    public String buscar(Integer i){
        String res="";
        if(abuelos.containsKey(i)){                
                //System.out.println("Es la cedula del abuelo: " + abuelos.get(i).getNombre());
                res+=("Es la cedula del abuelo: " + abuelos.get(i).getNombre()+"\n");
                int llavePadre = Integer.parseInt(abuelos.get(i).getFamilia().keySet().toArray()[0].toString());
                //System.out.println("Su hijo es: "+abuelos.get(i).getFamilia().get(llavePadre).getNombre());
                res+=("Su hijo es: "+abuelos.get(i).getFamilia().get(llavePadre).getNombre()+"\n");
                int llaveNieto = Integer.parseInt(abuelos.get(i).getFamilia().get(llavePadre).getFamilia().keySet().toArray()[0].toString());
                //System.out.println("Su nieto es: "+abuelos.get(i).getFamilia().get(llavePadre).getFamilia().get(llaveNieto).getNombre());
                res+=("Su nieto es: "+abuelos.get(i).getFamilia().get(llavePadre).getFamilia().get(llaveNieto).getNombre()+"\n");
            }
            
            for (Persona p:abuelos.values()){                
                if(p.getFamilia().containsKey(i)){                    
                    //System.out.println("Es la cedula del Padre: " + p.getFamilia().get(i).getNombre());
                    res+=("Es la cedula del Padre: " + p.getFamilia().get(i).getNombre()+"\n");
                    //System.out.println("Su padre es: " + p.getNombre());
                    res+=("Su padre es: " + p.getNombre()+"\n");
                    int llaveHijo = Integer.parseInt(p.getFamilia().get(i).getFamilia().keySet().toArray()[0].toString());
                    //System.out.println("Su hijo es: "+ p.getFamilia().get(i).getFamilia().get(llaveHijo).getNombre());
                    res+=("Su hijo es: "+ p.getFamilia().get(i).getFamilia().get(llaveHijo).getNombre()+"\n");
                }               
                
                for (Persona pa : p.getFamilia().values()) {
                    if(pa.getFamilia().containsKey(i)){
                        //System.out.println("Es la cedula del Hijo: " + pa.getFamilia().get(i).getNombre());
                        res+=("Es la cedula del Hijo: " + pa.getFamilia().get(i).getNombre()+"\n");
                        //System.out.println("Su padre es: " + pa.getNombre());
                        res+=("Su padre es: " + pa.getNombre()+"\n");
                        //System.out.println("Su abuelo es: " + p.getNombre());
                        res+=("Su abuelo es: " + p.getNombre()+"\n");
                    }
                }
            }
            return res;
    }
}
    

