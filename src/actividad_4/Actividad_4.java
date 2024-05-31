
package actividad_4;

public class Actividad_4 {

   
    public static void main(String[] args) {
        //1 Crear un objeto Auto de nombre cascajo "123LATA ,"Renault 12". Luego otro: (Ford Focus, patente 999POWR). Crear un Celular.
        Auto casCajo = new Auto("Renault 12", "123LATA");
        Auto auto2 = new Auto("Ford Focus", "999Power");
        Celular miCelu = new Celular("Movistar", "2664466510", 100);
        
        //2 Crear un objeto, invocando al constructor de clase Padre.
        Padre papa = new Padre(auto2);
        
        //3 El padre muestra en consola: Papá me dejo esta casa en zona, y muestra la Zona (desde el padre)
        System.out.println("Papa me dejo esta casa en zona "+papa.getCasa().getZona()+" ,Piso "+papa.getCasa().getPiso());
        
        //4 Crear un objeto, invocando al constructor de clase Hijo, con Juan Carlos, el celular, y el auto cascajo
        Hijo juanCarlos = new Hijo("Juan Carlos", 1000, miCelu, casCajo);
        
        //5 El hijo muestra en consola: Papá me dejó este auto: y muestra el modelo del auto (desde el hijo h.getAuto.getModelo…)
        System.out.println("Papa me dejo este auto "+juanCarlos.getAuto().getMarca());
        
        //6 El hijo ejecuta conducirAuto(auto), muestra “conduciendo un auto de un amigo” (Ford Focus, patente 999POWR). Este es un método
        // propio con Dependencia hacia Auto, es otro auto del amigo. Auto ya creado desde el main
        juanCarlos.conducirAuto(auto2);
        
        //7 El hijo ejecuta jugarFutbol() y muestra “Se jugar futbol gracias a mi hermano” (del hermano)
        juanCarlos.jugarFutbol();
        
        //8 . El hijo ejecuta el método implementado de la mama bailar(), y muestra "Se bailar como mi madre ♪ ♫ ♪”
        juanCarlos.bailar();
        
        //9 El hijo muestra en consola "SALIO EL NUMERO DE LA SUERTE ", e invoca int jugarLoteria() retorna NROSUERTE de mamá. Además,
        //este método suma a la billetera de JuanCa, la constante FORTUNA de mamá, y dice: Heredaste la Fortuna de 50000.0 de tu madre la
        //ROSA!! Y muestra la billetera
        System.out.println("Salio el numero de la suerte "+juanCarlos.jugarLoteria());
        System.out.println("Billetera despues de heredar "+juanCarlos.getBilletera());
        
        //10 El hijo ejecuta su propio método cantar(), @override que invoca a cantar() de papa (super.cantar) y ejecuta un print con mensaje “Asi
        //canta tu padre, Don (apellido)”. Y luego un println “así canta JuanCarlos” (de su cantar)
        juanCarlos.cantar();
        
        //11 El hijo ejecuta heredarDinero(coloca un numero en dólares ej. 2000), que suma a la billetera el dinero recibido, y muestra: Tio Lucas te
        //regala estos dolaritos!.
        juanCarlos.heredarDinero(2000);
        System.out.println("Ahora tienes en la billetera "+juanCarlos.getBilletera());
        
        //12 El hijo muestra en consola: Jugando al Futbol, Hoy has hecho + invoca a hacerGoles() (del hermano)
        juanCarlos.hacerGoles();
    }
    
}
