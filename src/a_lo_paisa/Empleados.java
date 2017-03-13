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
public class Empleados {
    private String nombre;
    private double identificacion;
    private RegistroHora registro;
    private PagosEmp pagos;

    public Empleados(String nombre, double identificacion, RegistroHora registro, PagosEmp pagos) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.registro = registro;
        this.pagos = pagos;
    }

    public String getNombre() {
        return nombre;
    }

    public double getIdentificacion() {
        return identificacion;
    }

    public RegistroHora getRegistro() {
        return registro;
    }

    public PagosEmp getPagos() {
        return pagos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdentificacion(double identificacion) {
        this.identificacion = identificacion;
    }

    public void setRegistro(RegistroHora registro) {
        this.registro = registro;
    }

    public void setPagos(PagosEmp pagos) {
        this.pagos = pagos;
    }
    
    
}
