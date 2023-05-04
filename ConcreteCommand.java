public class ConcreteCommand implements Command {
    private Receiver receiver;
    private String placa;
    private double valorComercial;
    private String tipoVehiculo;

    public ConcreteCommand(Receiver receiver, String placa, double valorComercial, String tipoVehiculo) {
        this.receiver = receiver;
        this.placa = placa;
        this.valorComercial = valorComercial;
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public void execute() {
        receiver.calcularImpuesto(placa, valorComercial, tipoVehiculo);
    }
}