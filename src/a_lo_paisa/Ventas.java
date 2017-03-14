/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_lo_paisa;


public class Ventas {
   
    private Producto [ ] productoo;
    private Fecha fecha;

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

        
            
    public double diario(){
    double diario=0;
    for(int j=0; j==this.getFecha().getDia();j++){
    for(int i=0;i<this.productoo.length;i++){
        diario+=this.getProductoo()[0].getCantidadS();
    }}
    return diario;
    } 
    
    public double mensual(){
    double mensual=0;
    for(int j=0; j==this.getFecha().getMes();j++){
    for(int i=0;i<this.productoo.length;i++){
        mensual+=this.getProductoo()[0].getCantidadS();
    }}
    return mensual;
    } 
    
     public double anual(){
    double anual=0;
    for(int j=0; j==this.getFecha().getAño();j++){
    for(int i=0;i<this.productoo.length;i++){
        anual+=this.getProductoo()[0].getCantidadS();
    }}
    return anual;
    } 
    
}
