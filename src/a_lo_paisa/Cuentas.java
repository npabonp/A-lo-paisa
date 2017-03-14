/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_lo_paisa;

/**
 * La clase Cuentas permite calcular la utilidad del restaurante, dando el valores diarios, mensuales y anuales.
 */
public class Cuentas {
    private Ventas venta;
    private GastoTotal gastot;
 /**
     *El metodo getVenta, permitira obtener la informacion de la ventas realizadas.
     * @return Retona las ventas.
     */
    public Ventas getVenta() {
        return venta;
    }
/**
     *El metodo getGastot, permitira obtener la informacion de los gastos totales del restaurante.
     * @return Retona los gastos del restaurante.
     */
    public GastoTotal getGastot() {
        return gastot;
    }

    /**
     *El metodo setVenta, permitira modificar la informacion de los gastos totales del restaurante, en caso de ser necesario.
     *  @param venta hace referencia a los datos de tipo GVentas que podrian ser modificados.
     */
    public void setVenta(Ventas venta) {
        this.venta = venta;
    }
/**
     *El metodo setGastot, permitira modificar la informacion de los gastos totales del restaurante, en caso de ser necesario.
     * @param gastot hace referencia a los datos de tipo GastoTotal que podrian ser modificados.
     */
    public void setGastot(GastoTotal gastot) {
        this.gastot = gastot;
    }
    
    /**
     *El metodo utilidaddiaria, permitira conecer cuanto dinero gana el restaurante diariamente.
     *  @return Retona la utilidad diaria del restaurante.
     */
    public double utilidaddiaria(){
    double utilidaddiaria=this.getVenta().diario()-this.getGastot().gastototaldiario();
    return utilidaddiaria;
    }
    
    /**
     *El metodo utilidadmensual, permitira conecer cuanto dinero gana el restaurante mensualmente.
     *  @return Retona la utilidad mensual del restaurante.
     */
     public double utilidadmensual(){
    double utilidadmensual=this.getVenta().mensual()-this.getGastot().gastototalmensual();
    return utilidadmensual;
    }
     /**
     *El metodo utilidadanual , permitira conecer cuanto dinero gana el restaurante anualmente.
     * @return Retona la utilidad anual del restaurante.
     */
      public double utilidadanual(){
    double utilidadanual=this.getVenta().anual()-this.getGastot().gastototalanual();
    return utilidadanual;
    }
}
