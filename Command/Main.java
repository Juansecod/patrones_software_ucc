public class Main {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver();

        ConcreteCommand autoCommand = new ConcreteCommand(receiver, "ABC123", 5000.0, "automovil");
        ConcreteCommand camionetaCommand = new ConcreteCommand(receiver, "XYZ456", 8000.0, "camioneta");
        ConcreteCommand cargaCommand = new ConcreteCommand(receiver, "DEF789", 10000.0, "vehiculo carga");
        ConcreteCommand publicoCommand = new ConcreteCommand(receiver, "GHI012", 6000.0, "servicio publico");

        invoker.addCommand(autoCommand);
        invoker.addCommand(camionetaCommand);
        invoker.addCommand(cargaCommand);
        invoker.addCommand(publicoCommand);

        invoker.executeCommands();
    }
}