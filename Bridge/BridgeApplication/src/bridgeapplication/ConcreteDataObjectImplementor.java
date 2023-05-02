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
public class ConcreteDataObjectImplementor implements DataObjectImplementor{
     private final ArrayList<String> _defaultUsers = new ArrayList<String>();
    
    @Override
    public void showAll() {
        System.out.println(this._defaultUsers);
        System.out.println();
    }

    @Override
    public void appendUser(String user) {
        this._defaultUsers.add(user);
    }

    @Override
    public void deleteUser(String user) {
        int indexUser = _defaultUsers.indexOf(user);
        if(indexUser != -1) {
            _defaultUsers.remove(indexUser);
         }
    }

}

