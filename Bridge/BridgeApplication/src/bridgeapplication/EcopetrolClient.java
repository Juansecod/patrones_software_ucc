/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridgeapplication;

/**
 *
 * @author juans
 */
public class EcopetrolClient extends Client {
    public EcopetrolClient(String group) {
        super(group);
    }
    
    @Override
    public void showAll(){
        System.out.println("Default Users");
        super.showAll(); 
        System.out.println();
    }
}
