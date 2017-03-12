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
public class ProductoEnt {
    private String nombreE;
    private int cantidadE;

    public ProductoEnt(String nombreE, int cantidadE) {
        this.nombreE = nombreE;
        this.cantidadE = cantidadE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public int getCantidadE() {
        return cantidadE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public void setCantidadE(int cantidadE) {
        this.cantidadE = cantidadE;
    }

   }
