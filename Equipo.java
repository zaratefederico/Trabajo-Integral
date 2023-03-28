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
public class Equipo {
    
    private int idequipo;
    private String nombreequipo;
    private String descripcion;
    
    
    private ArrayList<Equipo> ll_equipo = new ArrayList<>();
    
    
    public Equipo(){
    
    }
    
    public Equipo(int idequipo, String nombreequipo, String descripcion){
    
        this.idequipo = idequipo;
        this.nombreequipo = nombreequipo;
        this.descripcion = descripcion; 
    
    }     
    
    
    public void mostrar_Equipo(){
            System.out.println(idequipo);
            System.out.println(nombreequipo);
            System.out.println(descripcion); 
    }


}
