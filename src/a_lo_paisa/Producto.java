/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_lo_paisa;

/**
 * La clase Producto permite conocer el nombre del producto, la cantidad que hay en bodega, la cantidad saliente, la cantidad entrante y la cantidad total.
 * Los get de la clase permiten obtener la informacion y los set permiten modificar los datos en caso de ser necesario.
 */
public class Producto {
  private String nombre;
  private int cantidad;
  private int  cantidadE;
  private int cantidadS;
/**
*El constructor Producto permite crear una instancia de tipo producto, en la que se conosca el nombre, la cantidad en bodega, la cantidad entrante y la cantidad saliente de dicho producto.
     * @param nombre recibira el nombre del producto.
     * @param cantidad recibira la cantidad en bodega del producto.
     * @param cantidadE recibira la cantidad entrante del producto.
     * @param cantidadS recibira la cantidad saliente del producto.
 */
   
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

 /**
*El metodo totalproducto permite conocer la cantidad total del producto.
     * @return retorna la cantidad total del producto.
*/
    
   public int totalproducto(){
   int totalproducto=this.getCantidad()-this.getCantidadS()+this.getCantidadE();
       return totalproducto;
   }
   }

    
  

