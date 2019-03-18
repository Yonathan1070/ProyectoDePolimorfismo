/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercico4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Juan Daniel Fetecua
 * @author Yonathan Camilo Bohorquez
 */
public class Try {
    
    static Integer i;
    static Persona key;
    static Persona keya;
    static boolean b=true;
    static HashMap<Integer,Persona>abuelos;
    static String nombre="";
    public static String rta="";

    
    public BufferedReader datos=new BufferedReader(new InputStreamReader (System.in));
    
    Persona h1=new Persona(1,"juan","fetecua");
    Persona h2=new Persona(2,"Jhonatan","Bohorquez");
    Persona h3=new Persona(3,"Victor","Pardo");
    Persona p1=new Persona(4,"Luis","Velandia");
    Persona p2=new Persona(5,"Carlos","Castaño");
    Persona p3=new Persona(6,"Roberto","Lopez");
    Persona a1=new Persona(7,"david","ordoñez");
    Persona a2=new Persona(8,"laura","torres");
    Persona a3=new Persona(9,"camila","rodriguez");
    
    public Try() throws IOException{
        
               
               
        p1.getFamilia().put(h1.getId(), h1);
        p2.getFamilia().put(h2.getId(), h2);
        p3.getFamilia().put(h3.getId(), h3);
        a1.getFamilia().put(p1.getId(), p1);
        a2.getFamilia().put(p2.getId(), p2);
        a3.getFamilia().put(p3.getId(), p3);
            
        abuelos=new HashMap();
        abuelos.put(a1.getId(), a1);
        abuelos.put(a2.getId(), a2);
        abuelos.put(a3.getId(), a3);     
        
        
        do{ 
            rta="";
            System.out.println("\n\n\nDigite la Cedula a Buscar: ");
            i =Integer.parseInt(datos.readLine());
            this.i=i;
            b=true;
            if(abuelos.containsKey(i)){
                System.out.println("Abuelo: "+abuelos.get(i).getNombre());
                recursiveExploreI(abuelos.get(i).getFamilia(), 2);
                //rta+=("Abuelo: "+abuelos.get(i).getNombre()+"\n");
                //rta+=(recursiveExploreI(abuelos.get(i).getFamilia(), 2)+"\n");
                //System.out.println(rta);
            }else{
                explore(abuelos);
                //rta=(explore(abuelos)+"\n");
                //System.out.println(rta);
            }
        //return rta;    
        }while(i!=0);      
    
}
    
    private static void recursiveExplore(HashMap<Integer, Persona> categories, int depth) {

        if (depth == 0) return; //rta;
        for (Persona c1 : categories.values()) {
            
            if(c1.getFamilia().containsKey(i)){
                if(b){
                    if(depth==1){
                        System.out.println("Abuelo: " + nombre);
                        System.out.println("Padre: "+c1.getNombre());
                        System.out.println("Hijo: "+c1.getFamilia().get(i).getNombre());
                        //rta+=("Abuelo: " + nombre+"\n");
                        //rta+=("Padre: "+c1.getNombre()+"\n");
                        //rta+=("Hijo: "+c1.getFamilia().get(i).getNombre()+"\n");
                    }
                    if(depth==2){
                        System.out.println("Abuelo: "+c1.getNombre());
                        System.out.println("Padre: "+c1.getFamilia().get(i).getNombre());
                        //rta+=("Abuelo: "+c1.getNombre()+"\n");
                        //rta+=("Padre: "+c1.getFamilia().get(i).getNombre()+"\n");
                    }                                       
                    
                    b=false;
                }
                if(depth>1){
                    recursiveExploreI(c1.getFamilia().get(i).getFamilia(),2);
                    //rta+=(recursiveExploreI(c1.getFamilia().get(i).getFamilia(),2)+"\n");
                    return; //rta;
                }                
                return; //rta;
            }
            //System.out.println("Abuelo2: " + c1.getNombre());
            nombre=c1.getNombre();
            recursiveExplore(c1.getFamilia(), depth - 1);
        }
        return;// rta;
    }
    
    private static void recursiveExploreI(HashMap<Integer, Persona> categories, int depth) {
        
        if (depth == 0) return; //rta;
        for (Persona c1 : categories.values()) {            
           
            if(depth==2){
            System.out.println("Hijo: "+c1.getNombre());
            //rta+=("Hijo: "+c1.getNombre()+"\n");
            }
            if(depth==1){
            System.out.println("Nieto: "+c1.getNombre());
            //rta+=("Nieto: "+c1.getNombre()+"\n");  
            }
            recursiveExploreI(c1.getFamilia(), depth - 1);
        }
        return; //rta;
    }
    
    public static void explore(HashMap<Integer,Persona> categories) {
        recursiveExplore(categories, 2);
        //rta+=(recursiveExplore(categories, 2)+"\n");
        //return rta;
    }
    
    public static String getRta() {
        return rta;
    }

    public static void setRta(String rta) {
        Try.rta = rta;
    }
}

