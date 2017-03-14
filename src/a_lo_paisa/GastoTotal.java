/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_lo_paisa;

/**
 *La clase GastoTotal permitira calcular cuanto se ha gastado diarimente, mensualmente y anualmente en el restaurante.
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
    
        
    public double gastototaldiario(){
    double gastototaldiario=this.getPagose().diario()+this.getOtros().diario();
    return gastototaldiario;
    }
    
     public double gastototalmensual(){
    double gastototalmensual=this.getPagose().mensual()+this.getOtros().mensual();
    return gastototalmensual;
    }
    
    public double gastototalanual(){
    double gastototalanual=this.getPagose().anual()+this.getOtros().anual();
    return gastototalanual;
    }
        
}
