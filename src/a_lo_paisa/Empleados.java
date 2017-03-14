/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_lo_paisa;

/**
 * La clase Empleados permite conocer identificar a cada empleado del restaurante, los pagos que se le realizan y  su registro de entrda y salida.
 */
public class Empleados {
    private String nombre;
    private double identificacion;
    private RegistroHora registro;
    private PagosEmp pagos;

    /**
 * El constructor Empleados permitira crear un objeto de tipo Empleados si es necesario.
 * @param nombre permitira introducir el nombre del empleado.
 * @param identificacion permitira introducir la identificacion del empleado.
 * @param registro permitira introducir el registro de entrada y salida del empleado.
 * @param pagos permitira introducir los pagos que se realizan al empleado.
 */
    public Empleados(String nombre, double identificacion, RegistroHora registro, PagosEmp pagos) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.registro = registro;
        this.pagos = pagos;
    }
/**
     *El metodo getNombre, permitira obtener el nombre del empleado.
     * @return Retona el nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }
/**
     *El metodo getIdentificacion, permitira obtener la identificacion del empleado.
     * @return Retona el nombre del empleado.
     */
    public double getIdentificacion() {
        return identificacion;
    }
/**
     *El metodo getRegistro ,permitira obtener la identificacion del empleado.
     * @return Retona el registro de la hora de entrada y salida del empleado.
     */
    public RegistroHora getRegistro() {
        return registro;
    }
/**
     *El metodo getRegistro ,permitira obtener la identificacion del empleado.
     * @return Retona el registro de la hora de entrada y salida del empleado.
     */
    
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
