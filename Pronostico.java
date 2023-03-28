/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deporte;

/**
 *
 * @author pc
 */
public class Pronostico {
  
  private int idpartido;
  private int apuesta;

  public Pronostico(){
  
  }
  public Pronostico(int idpartido, int apuesta){
  
      this.idpartido=idpartido; // con este idpartido puedo recuperar de los 2 equipos que juegan el partido
      this.apuesta=apuesta; // 0 si es empate, 1 si gana el equipo 1 y 2 si gana el equipo 2
  } 

  public int devuelveApuesta(){
  
      return(apuesta);   

  }

}
