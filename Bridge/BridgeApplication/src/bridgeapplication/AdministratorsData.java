/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridgeapplication;
import java.util.ArrayList;
/**
 *
 * @author juans
 */
public class AdministratorsData extends UsersData {
    private final ArrayList<String> _administrators = new ArrayList<String>();

     public AdministratorsData(){
        this._administrators.add("root");
    }
    
    @Override
    public void showAll() {
        for(String user:_administrators){
            System.out.println(user);
        }
    }

    @Override
    public void appendUser(String user) {
        this._administrators.add(user);
    }

    @Override
    public void deleteUser(String user) {
        int indexUser = _administrators.indexOf(user);
        if(indexUser != -1) {
            _administrators.remove(indexUser);
         }
    }
}
