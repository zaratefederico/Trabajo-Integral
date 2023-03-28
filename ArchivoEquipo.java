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

public class ArchivoEquipo{

    private   ArrayList<String> l_lista;  
      
    
    public ArrayList lista(){
    
        return l_lista; 
    }
    
   
    public  void leer_Arch(String pcamino){

     
        l_lista = new ArrayList<>(); 
        String renglon = null;
       
        try {
            FileInputStream  pfis   = new FileInputStream( pcamino );
            DataInputStream pDatos = new DataInputStream( pfis );
     
                        
            renglon = pDatos.readLine(); 
  
            boolean linea = true; 
            while ( renglon != null ) {  //  Es "null" si encuentra fin del archivo.
                if (linea) {
                    renglon = pDatos.readLine(); 
                    linea = false; 
                }
                else {
           
                    l_lista.add(renglon); 
                    renglon = pDatos.readLine();
                }    
                
            }
            pfis.close();
        }
    
        catch (FileNotFoundException e){
            System.out.println("Error de Archivo");
        }
        catch (IOException e){
            System.out.println( "Error de Archivo");    
        }
        
    }
    
}