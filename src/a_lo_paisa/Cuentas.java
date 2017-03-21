/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_lo_paisa;

/**
 * La clase Cuentas permite calcular la utilidad del restaurante, dando el valores diarios, mensuales y anuales.
 * Los get de la clase permiten obtener la informacion y los set permiten modificar los datos en caso de ser necesario.
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
