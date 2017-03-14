/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_lo_paisa;

/**
 *La clase Fecha permitira saber el dia,mes y año en que se realiza un proceso.
 * 
 */
public class Fecha {
    private int dia;
    private int mes;
    private int año;

    /**
 *El construcor Fecha permitira introducir el dia,mes y año en que se realiza un proceso.
 * @param dia indica el dia de la compra.
 * @param mes indica el mes de la compra.
 * @param año indica el año de la compra.
 */
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }
        
}
