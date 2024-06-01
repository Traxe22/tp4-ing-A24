/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad_4;

/**
 *
 * @author munoz
 */
public class Hijo extends Padre implements Madre, Tio, Hermano{
    private String nombre;
    private double billetera;
    private Celular celular;

    public Hijo(String nombre, double billetera, Celular celular, Auto auto) {
        super(auto);
        this.nombre = nombre;
        this.billetera = billetera;
        this.celular = celular;
    }

    @Override
    public void cantar() {
        super.cantar();
        System.out.println("y Asi canta "+nombre);
    }
    
    
    public void conducirAuto(Auto auto){
        System.out.println(nombre+" Esta conduciendo un "+auto.getMarca()+" "+auto.getPatente());
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBilletera() {
        return billetera;
    }

    public void setBilletera(double billetera) {
        this.billetera = billetera;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void bailar() {
        System.out.println("Se be bailar como mamà ");
    }

    @Override
    public int jugarLoteria() {
        this.billetera+= fortuna;
        System.out.println("Heredaste la fortuna de "+fortuna+" de tu madre");
        return nroSuerte;
    }

    @Override
    public void heredarDinero(double dinero) {
        this.billetera+=dinero;
        System.out.println("Tio lucas te regala estos dolares "+dinero);
    }

    @Override
    public void jugarFutbol() {
        System.out.println("Se Jugar al futbol gracias a mi hno");
    }

    @Override
    public int hacerGoles() {
        int goles = 3;
        System.out.println("Hoy hice "+goles+" Goles!");
        return goles;
    }
    
}
