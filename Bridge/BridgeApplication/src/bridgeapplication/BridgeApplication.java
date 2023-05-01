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
        
        // Supongamos que Sura nos pide un sistema que permita administrar los usuarios que tienen un perfil de administradores
        Client sura = new SuraClient("Sura");
        DataObject administratorsSura = new AdministratorsData();
        sura.setData(administratorsSura);

        sura.showAll();
        sura.addUser("Henry Velasquez");
        sura.addUser("Juan Rios");
        sura.addUser("Esteban Suarez");
        sura.addUser("Jaime Valencia");
        sura.showAll();
      
        // Supongamos que Ecopetrol nos pide un sistema que permita administrar los usuarios que tienen
        Client ecopetrol = new EcopetrolClient("Ecopetrol");
        DataObject usersEcopetrol = new UsersData();
        ecopetrol.setData(usersEcopetrol);

        ecopetrol.showAll();
        ecopetrol.addUser("Henry Velasquez");
        ecopetrol.addUser("Juan Rios");
        ecopetrol.addUser("Esteban Suarez");
        ecopetrol.addUser("Jaime Valencia");
        ecopetrol.showAll();
    }
    
}
