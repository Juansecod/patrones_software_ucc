/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bridgeapplication;

/**
 *
 * @author juans
 */
public class BridgeApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Client sura = new SuraClient("Sura");

        sura.showAll();
        sura.addUser("Henry Velasquez");
        sura.addUser("Juan Rios");
        sura.addUser("Esteban Suarez");
        sura.addUser("Jaime Valencia");
        sura.showAll();
      

        Client ecopetrol = new EcopetrolClient("Ecopetrol");

        ecopetrol.showAll();
        ecopetrol.addUser("Ferney Gonzales");
        ecopetrol.addUser("Santiago Rivera");
        ecopetrol.addUser("Diego Ospina");
        ecopetrol.addUser("Nelson Lopera");
        ecopetrol.showAll();
    }
    
}
