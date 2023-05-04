public class Receiver {
    public void calcularImpuesto(String placa, double valorComercial, String tipoVehiculo) {
        double impuesto;

        switch (tipoVehiculo.toLowerCase()) {
            case "automovil":
                impuesto = valorComercial * 0.1;
                break;
            case "camioneta":
                impuesto = valorComercial * 0.15;
                break;
            case "vehiculo carga":
                impuesto = valorComercial * 0.05;
                break;
            case "servicio publico":
                impuesto = valorComercial * 0.08;
                break;
            default:
                System.out.println("Tipo de vehículo no válido");
                return;
        }

        System.out.println("Para el vehículo con placa " + placa + " y valor comercial " + valorComercial + " el impuesto es: " + impuesto);
    }
}