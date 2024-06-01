/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_4;

/**
 *
 * @author munoz
 */
public class Auto {
    private String marca;
    private String patente;
    private double combustible;

    public Auto(String marca,  String patente) {
        this.marca = marca;
        
        this.patente = patente;
        this.combustible = 50;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }
    
    
    
    
}
