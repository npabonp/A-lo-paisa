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
public class Cuentas {
    private Ventas venta;
    private GastoTotal gastot;

    public Ventas getVenta() {
        return venta;
    }

    public GastoTotal getGastot() {
        return gastot;
    }

    public void setVenta(Ventas venta) {
        this.venta = venta;
    }

    public void setGastot(GastoTotal gastot) {
        this.gastot = gastot;
    }
    
    public double utilidaddiaria(){
    double utilidaddiaria=this.getVenta().diario()-this.getGastot().gastototaldiario();
    return utilidaddiaria;
    }
    
     public double utilidadmensual(){
    double utilidadmensual=this.getVenta().mensual()-this.getGastot().gastototalmensual();
    return utilidadmensual;
    }
      public double utilidadanual(){
    double utilidadanual=this.getVenta().anual()-this.getGastot().gastototalanual();
    return utilidadanual;
    }
}
