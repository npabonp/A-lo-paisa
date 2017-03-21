/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_lo_paisa;

/**
 *
 * La clase Inventario, permitira conocer la totalidad de productos que hay en bodega.
 * Los get de la clase permiten obtener la informacion y los set permiten modificar los datos en caso de ser necesario.
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
    
    /**
     *El metodo totalproductos , permitira conecer la totalidad de productos que hay en el restaurante.
     * @return Retona la totalidad de productos que tiene el restaurante.
     */
    
    public int totalproductos(){
    int totalproductos=0;
    for(int i=0;i<this.product.length;i++){
    totalproductos =this.getProduct()[i].totalproducto();
      }
      return totalproductos;
              }
}
