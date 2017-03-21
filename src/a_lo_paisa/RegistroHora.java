/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_lo_paisa;

/**
 *La clase RegistroHora permite conocer la hora de entrada y salida de un empleado.
 */
public class RegistroHora {
    private String entrada;
    private String salida;
/**
 *El constructor RegistroHora permite registrar hora de entrada y salida del empleado.
 *@param entrada recibe la hora de entrada del empleado.
 *@param salida recibe la hora de salida del empleado.
 */
        public RegistroHora(String entrada, String salida) {
        this.entrada = entrada;
        this.salida = salida;
    }

    public String getEntrada() {
        return entrada;
    }

    public String getSalida() {
        return salida;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }
    
    }
