/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridgeapplication;

/**
 *
 * @author juans
 */
public abstract class Client {
    private DataObject _data;
    protected String group;
    
    public Client(String group){
        this.group = group;
    };
    
     /**
     * @return the _data
     */
    public DataObject getData() {
        return _data;
    }

    /**
     * @param _data the _data to set
     */
    public void setData(DataObject data) {
        this._data = data;
    }
    
    public void showAll(){
        System.out.println("Group: " + this.group);
        this._data.showAll(); 
    }
    
    public void addUser(String user){
        this._data.appendUser(user);
    }
    
    public void deleteUser(String user){
        this._data.deleteUser(user);
    }

}
