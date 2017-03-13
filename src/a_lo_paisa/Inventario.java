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
public class Inventario {
    private Producto [ ] product;

    public Inventario(Producto []product) {
        this.product = product ;
    }

    public Producto [] getProduct() {
        return product;
    }

    public void setProduct(Producto [] product) {
        this.product = product;
    }
    
    public int totalproductos(){
    for(int i=0;i<this.product.length;i++){
    int totalproductos=this.getProduct()[i].totalproducto();
      }
      return 0;
              }
}
