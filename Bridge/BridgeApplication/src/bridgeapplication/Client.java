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
    protected DataObjectImplementor dataObjectImplementor;
    protected String group;

    public Client(String group, DataObjectImplementor dataObjectImplementor) {
        this.group = group;
        this.dataObjectImplementor = dataObjectImplementor;
    }

    public void showAll() {
        System.out.println("Group: " + this.group);
        this.dataObjectImplementor.showAll();
    }

    public void addUser(String user) {
        this.dataObjectImplementor.appendUser(user);
    }

    public void deleteUser(String user) {
        this.dataObjectImplementor.deleteUser(user);
    }
}