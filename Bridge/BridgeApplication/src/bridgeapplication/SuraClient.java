/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridgeapplication;

/**
 *
 * @author juans
 */
public class SuraClient extends Client {
    
    public SuraClient(String group) {
        super(group);
    }
    
    @Override
    public void showAll(){
        System.out.println("-------------------------------------------------------------");
        System.out.println("Administrators Users");
        super.showAll(); 
        System.out.println("-------------------------------------------------------------");
        System.out.println();
    }
}
