/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.deporte;

/**
 *
 * @author pc
 */

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList; 
import java.io.*;
import javax.swing.*;

public class Deporte {

  private static  ArrayList<Equipo> list_equipo; 
  private static  ArrayList<Partido> list_partido;
  private static ArrayList<Pronostico> list_pronostico;
 
  private static ArrayList<String> l_equipo;
  private static ArrayList<String> l_partido;
  private static ArrayList<String> l_pronostico;
    
  public static void main(String[] args) {
        
    l_equipo  = new ArrayList<>();
    l_partido = new ArrayList<>(); 
    l_pronostico = new ArrayList<>(); 
    
    list_equipo= new ArrayList<>(); 
    list_partido= new ArrayList<>();
    list_pronostico= new ArrayList<>(); 
   
   
    
    ArchivoEquipo archivoe = new ArchivoEquipo(); 
   
    archivoe.leer_Arch("C:/Equipos.csv"); 
    l_equipo=archivoe.lista();
        String renglon1=null; 
        for (int i=0; i<l_equipo.size(); i++){
                renglon1 = l_equipo.get(i); 
                String x[] = renglon1.split(";"); 
            Equipo seleccion = new Equipo (Integer.parseInt(x[0]), x[1], x[2]); 
            list_equipo.add(seleccion); 
        }    
    
    archivoe.leer_Arch("C:/Partidos.csv");
    l_partido=archivoe.lista();
        String renglon2=null; 
        for (int i=0; i<(l_partido.size()-1); i++){
                renglon2 = l_partido.get(i); 
                String x[] = renglon2.split(";"); 
        Partido partido1 = new Partido(Integer.parseInt(x[0]), Integer.parseInt(x[1]), Integer.parseInt(x[2]), Integer.parseInt(x[3]), Integer.parseInt(x[4]) ); 
        list_partido.add(partido1); 
        }    
        
    archivoe.leer_Arch("C:/Pronosticos.csv"); 
    l_pronostico=archivoe.lista();
        String renglon3=null; 
        for (int i=0; i<l_pronostico.size(); i++){
                renglon3 = l_pronostico.get(i); 
                String x[] = renglon3.split(";"); 
            
        Pronostico pronostico1 = new Pronostico(Integer.parseInt(x[0]), Integer.parseInt(x[1])); 
        list_pronostico.add(pronostico1); 
        }    


    int puntos=0; 
   
    for (int i=0; i<list_partido.size();i++){
    
        if (list_partido.get(i).resultadoPartido()== list_pronostico.get(i).devuelveApuesta()){
            puntos++;
        }
    }
    System.out.println("Pronosticos Acertados: "+puntos); 
    
  
  }
}
