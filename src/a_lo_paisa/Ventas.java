/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_lo_paisa;


public class Ventas {
   
    private Producto [ ] productoo;
    private String fecha;

    public Ventas(Producto[] productoo, String fecha) {
        this.productoo = productoo;
        this.fecha = fecha;
    }

    public Producto[] getProductoo() {
        return productoo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setProductoo(Producto[] productoo) {
        this.productoo = productoo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

        
            
    public double diario(){
    double diario=0;
    for(int i=0;i<this.productoo.length;i++){
        diario+=this.getProductoo()[0].getCantidadS();
    }
    return diario;
    } 
    //dentro de la venta
     
    
}
