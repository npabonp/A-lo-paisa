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
public class OtrosGastos {
    private double arriendo;
    private double impuestos;
    private double servicios;

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

       public double diario() {
        double total=this.getArriendo()+this.getImpuestos()+this.getServicios();
        return total;
    }
    
       public double mensual() {
        double totalmes= diario()*30 ;
        return totalmes;
    }
       public double anual() {
        double totalanual=diario()*365;
        return totalanual;
    }
    
    }
