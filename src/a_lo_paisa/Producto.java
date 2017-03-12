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
  private ProductoEnt productoe;
  private ProductoSal productos;

    public Producto(String nombre, int cantidad, ProductoEnt productoe, ProductoSal productos) {
        this.nombre = nombre;
        this.cantidad = cantidad+productoe-productos;
           }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public ProductoEnt getProductoe() {
        return productoe;
    }

    public ProductoSal getProductos() {
        return productos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setProductoe(ProductoEnt productoe) {
        this.productoe = productoe;
    }

    public void setProductos(ProductoSal productos) {
        this.productos = productos;
    }
    
    
    
 public int totalProducto(){
  int totalproducto= (this.getCantidad() +this.getProductoe());
  return totalproducto;
 }
 
  
}
