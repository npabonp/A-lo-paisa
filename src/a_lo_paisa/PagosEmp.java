/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_lo_paisa;

/**
 *La clase PagosEmp permite concer cuanto dinero se le pagara a cada empleado diariamente, mensualmente y anualmente.
 *Los get de la clase permiten obtener la informacion y los set permiten modificar los datos en caso de ser necesario.
 */
public class PagosEmp {
    private double salario;
    private double prima;
    private double ARL;
    private double pension;
    private double aux_tte;
/**
 *El constructor permite crear una instancia de tipo pagosEmp en la que ingresaran  el salario,la prima, el ARL,la pension y el aux_tte que se le paga a un empleado.
 *@param salario permite ingresar el valor del salario pagado a un empleado.
 *@param prima permite ingresar el valor de la prima pagada a un empleado.
 *@param ARL permite ingresar el valor del ARL pagado a un empleado.
 *@param pension permite ingresar el valor de la pension pagada a un empleado.
 *@param aux_tte permite ingresar el valor del aux_tte  pagado a un empleado.
 */
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

     /**
     *El metodo diario, permitira conecer cuanto dinero se le paga al empleado diariamente.
     *  @return Retona el pago diario del empleado.
     */  
   public double diario(){
   double diario= mensual()/30;
   return diario;
      }
    /**
     *El metodo mensual, permitira conecer cuanto dinero se le paga al empleado mensualmente.
     *  @return Retona el pago mensual del empleado.
     */  
    public double mensual(){
    double mensual=this.getSalario()+this.getPrima()+this.getARL()+this.getAux_tte()+this.getPension();
    return mensual;
    }
     /**
     *El metodo mensual, permitira conecer cuanto dinero se le paga al empleado anualmente.
     *  @return Retona el pago anual del empleado.
     */  
    public double anual(){
    double anual= diario()*365;
    return anual;
      }    
  
}
