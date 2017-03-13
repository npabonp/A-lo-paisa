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
public class PagosEmp {
    private double salario;
    private double prima;
    private double ARL;
    private double pension;
    private double aux_tte;

    public PagosEmp(double salario, double prima, double ARL, double pension, double aux_tte) {
        this.salario = salario;
        this.prima = prima;
        this.ARL = ARL;
        this.pension = pension;
        this.aux_tte = aux_tte;
    }

    public double getSalario() {
        return salario;
    }

    public double getPrima() {
        return prima;
    }

    public double getARL() {
        return ARL;
    }

    public double getPension() {
        return pension;
    }

    public double getAux_tte() {
        return aux_tte;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setPrima(double prima) {
        this.prima = prima;
    }

    public void setARL(double ARL) {
        this.ARL = ARL;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

    public void setAux_tte(double aux_tte) {
        this.aux_tte = aux_tte;
    }

   public double diario(){
   double diario= mensual()/30;
   return diario;
      }
    
    public double mensual(){
    double mensual=this.getSalario()+this.getPrima()+this.getARL()+this.getAux_tte()+this.getPension();
    return mensual;
    }
     
    public double anual(){
    double anual= diario()*365;
    return anual;
      }
    
    
    
    
    
    
    
}
