/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_lo_paisa;

/**
 *La clase GastoTotal permitira calcular cuanto se ha gastado diarimente, mensualmente y anualmente en el restaurante.
  * Los get de la clase permiten obtener la informacion y los set permiten modificar los datos en caso de ser necesario.
 */
public class GastoTotal {
    private OtrosGastos otros; 
    private PagosEmp pagose;

    public OtrosGastos getOtros() {
        return otros;
    }

    public PagosEmp getPagose() {
        return pagose;
    }

    public void setOtros(OtrosGastos otros) {
        this.otros = otros;
    }

    public void setPagose(PagosEmp pagose) {
        this.pagose = pagose;
    }
    
    /**
     *El metodo gastototaldiario, permitira conecer cuanto dinero se gasta en el restaurante diariamente, teniendo en cuenta los gastos fijos, y los pagos a los empleados.
     *  @return Retona el gasto total diario del restaurante.
     */    
    public double gastototaldiario(){
    double gastototaldiario=this.getPagose().diario()+this.getOtros().diario();
    return gastototaldiario;
    }
    /**
     *El metodo gastototalmensual, permitira conecer cuanto dinero se gasta en el restaurante mensualmente, teniendo en cuenta los gastos fijos, y los pagos a los empleados.
     *  @return Retona el gasto total mensual del restaurante.
     */  
    
     public double gastototalmensual(){
    double gastototalmensual=this.getPagose().mensual()+this.getOtros().mensual();
    return gastototalmensual;
    }
    /**
     *El metodo gastototalanual, permitira conecer cuanto dinero se gasta en el restaurante anualmente, teniendo en cuenta los gastos fijos, y los pagos a los empleados.
     *  @return Retona el gasto total anual del restaurante.
     */  
    public double gastototalanual(){
    double gastototalanual=this.getPagose().anual()+this.getOtros().anual();
    return gastototalanual;
    }
        
}
