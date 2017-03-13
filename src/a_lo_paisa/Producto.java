/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_lo_paisa;

/**
 *
 * @author GONZALES
 */
public class Producto {
  private String nombre;
  private int cantidad;
  private int  cantidadE;
  private int cantidadS;

   

 
   public Producto(String nombre, int cantidad, int cantidadE, int cantidadS) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.cantidadE = cantidadE;
        this.cantidadS = cantidadS;
        
    
}

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getCantidadE() {
        return cantidadE;
    }

    public int getCantidadS() {
        return cantidadS;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCantidadE(int cantidadE) {
        this.cantidadE = cantidadE;
    }

    public void setCantidadS(int cantidadS) {
        this.cantidadS = cantidadS;
    }

   public int totalproducto(){
   int totalproducto=this.getCantidad()-this.getCantidadS()+this.getCantidadE();
       return totalproducto;
   }
   }

    
  

