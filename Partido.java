/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deporte;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class Partido {
   private int idpartido;
   private int idequipo1;
   private int idequipo2;
   private int golequipo1;
   private int golequipo2;
   
 
   public Partido (){
   
   } 
   
   public  Partido(int idpartido, int idequipo1, int idequipo2, int golequipo1, int golequipo2){

        this.idpartido= idpartido;
        this.idequipo1= idequipo1;
        this.idequipo2= idequipo2;
        this.golequipo1= golequipo1;
        this.golequipo2= golequipo2; 
    }    
    
    
    public int resultadoPartido(){
    
        int resultado=0;
       
        if (golequipo1 > golequipo2) resultado=1; // Gana Equipo 1
        if (golequipo1 < golequipo2) resultado=2; // Gana Equipo 2
        if ( golequipo1==golequipo2) resultado=0; // Equipos Empatan
        
        return resultado; 
    }

    public void mostrar_Partido(){
            System.out.println(idpartido);
            System.out.println(idequipo1);
            System.out.println(idequipo2); 
    }
    
   
  
}

