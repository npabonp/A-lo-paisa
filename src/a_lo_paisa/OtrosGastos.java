/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_lo_paisa;

/**
 * La clase OtrosGastos, permitira conocer la totalidad de los gastos en arriendo, impuestos y servicios.
 * Los get de la clase permiten obtener la informacion y los set permiten modificar los datos en caso de ser necesario.
 */

public class OtrosGastos {
    private double arriendo;
    private double impuestos;
    private double servicios;

/**
 * El constructor permitira crear una instancia con el valor de los gastos que se generan en el restaurante.
 * @param arriendo permite introducir el valor que se paga por el arriendo.
 * @param impuestos permite introducir el valor que se paga por el arriendo.
 * @param servicios permite introducir el valor que se paga por el arriendo.
 */   
    public OtrosGastos(double arriendo, double impuestos, double servicios) {
        this.arriendo = arriendo;
        this.impuestos = impuestos;
        this.servicios = servicios;
    }

    public double getArriendo() {
        return arriendo;
    }

    public double getImpuestos() {
        return impuestos;
    }

    public double getServicios() {
        return servicios;
    }

    public void setArriendo(double arriendo) {
        this.arriendo = arriendo;
    }

    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }

    public void setServicios(double servicios) {
        this.servicios = servicios;
    }
    
    /**
     *El metodo diario, permite conecer cuanto dinero se gasta el restaurante diariamente.
     * @return Retona el gasto diario del restaurante.
     */
       public double diario() {
        double total=mensual()/30;
        return total;
    }
    
      /**
     *El metodo mensual, permite conecer cuanto dinero se gasta el restaurante mensualmente.
     * @return Retona el gasto mensual del restaurante.
     */   
       public double mensual() {
        double totalmes= this.getArriendo()+this.getImpuestos()+this.getServicios();
        return totalmes;
    }
         /**
     *El metodo anual, permite conecer cuanto dinero se gasta el restaurante anualmente.
     * @return Retona el gasto anual del restaurante.
     */
       public double anual() {
        double totalanual=diario()*365;
        return totalanual;
    }
    
    }
