
package actividad_4;


public class Padre {
   private String nombre;
   private String apellido;
   private Casa casa;
   private Auto auto;

    public Padre(Auto auto) {
        this.nombre = "Papà";
        this.apellido = "Lòpez";
        this.construirCasa();
        this.comprarAuto(auto);
    }

    private void comprarAuto(Auto auto) {
        this.auto = auto;
    }

    private void construirCasa() {
        this.casa = new Casa("Centro",2);
    }
    public void cantar(){
        System.out.println("Asi canta tu padre, Don "+ apellido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
    

    
   
   
}
