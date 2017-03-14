/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_lo_paisa;

/**
*La clase Ventas permite conocer cuanto se vende en el restaurante diariamente, mensualmente, y anualmente, teniendo en cuenta los productos de salida del inventario.
*Los get de la clase permiten obtener la informacion y los set permiten modificar los datos en caso de ser necesario.
 */  
public class Ventas {
 
    private Producto [ ] productoo;
    private Fecha fecha;
    
/**
 *El constructor Ventas permite recibir la cantidad de productos salientes y la fecha en que se realizo la venta.
 * @param productoo recibe un arreglo con todos los productos salientes.
 * @param fecha permite conocer la fecha en que se vendio el producto.
 */
    public Ventas(Producto[] productoo, Fecha fecha) {
        this.productoo = productoo;
        this.fecha = fecha;
    }

    public Producto[] getProductoo() {
        return productoo;
    }

    public Fecha getFecha() {
        return fecha;
    }

    
    public void setProductoo(Producto[] productoo) {
        this.productoo = productoo;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

     /**
     *El metodo diario, permitira conecer cuantos productos se venden diariamente en el restaurante. 
     *  @return Retona la venta total diaria del restaurante.
     */        
            
    public double diario(){
    double diario=0;
    for(int j=0; j==this.getFecha().getDia();j++){
        for (Producto productoo1 : this.productoo) {
            diario+=this.getProductoo()[0].getCantidadS();
        }
}
    return diario;
    } 
    
     /**
     *El metodo mensual, permitira conecer cuantos productos se venden mensualmente en el restaurante. 
     *  @return Retona la venta total mensual del restaurante.
     */   
    public double mensual(){
    double mensual=0;
    for(int j=0; j==this.getFecha().getMes();j++){
        for (Producto productoo1 : this.productoo) {
            mensual+=this.getProductoo()[0].getCantidadS();
        }
}
    return mensual;
    } 
    /**
     *El metodo anual, permitira conecer cuantos productos se venden anualmente en el restaurante. 
     *  @return Retona la venta total anual del restaurante.
     */   
    
     public double anual(){
    double anual=0;
    for(int j=0; j==this.getFecha().getAño();j++){
        for (Producto productoo1 : this.productoo) {
            anual+=this.getProductoo()[0].getCantidadS();
        }
}
    return anual;
    } 
    
}
