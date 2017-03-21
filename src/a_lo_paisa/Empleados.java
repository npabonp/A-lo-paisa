/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_lo_paisa;

/**
 * La clase Empleados permite conocer identificar a cada empleado del restaurante, los pagos que se le realizan y  su registro de entrda y salida.
 * Los get de la clase permiten obtener la informacion y los set permiten modificar los datos en caso de ser necesario.
 */
public class Empleados {
    private String nombre;
    private double identificacion;
    private RegistroHora [ ] registro;
    private PagosEmp pagos;

    /**
 * El constructor Empleados permitira crear un objeto de tipo Empleados si es necesario.
 * @param nombre permitira introducir el nombre del empleado.
 * @param identificacion permitira introducir la identificacion del empleado.
 * @param registro permitira introducir el registro de entrada y salida del empleado.
 * @param pagos permitira introducir los pagos que se realizan al empleado.
 */
    public Empleados(String nombre, double identificacion, RegistroHora [ ]  registro, PagosEmp pagos) {
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

    public RegistroHora [ ]  getRegistro() {
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

    public void setRegistro (RegistroHora [ ]  registro) {
        this.registro = registro;
    }

    public void setPagos(PagosEmp pagos) {
        this.pagos = pagos;
    }
    
    
}
