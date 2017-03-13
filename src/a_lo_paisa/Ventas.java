/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_lo_paisa;


public class Ventas {
   
    private Producto [ ] productoo;

    public Ventas(Producto [ ]  productoo) {
        this.productoo  = productoo ;
    }

    public Producto [ ]  getProductoo() {
        return productoo;
    }

    public void setProductoo(Producto [ ]  productoo) {
        this.productoo = productoo;
    }
    
            
    public double diario(){
    for(int i=0;i<this.productoo.length;i++){
        double diario=this.getProductoo()[0].getCantidadS();
    return diario;}
    return 0;
    } 
    
     public double mensual(){
    double mensual=;
    return mensual;
    }
    
     public double anual(){
    double anual=;
    return anual;
    }   
    
}
