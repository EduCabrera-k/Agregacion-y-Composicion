public class MiMoto {

    private Motor motor;

    public MiMoto() {
        this.motor = new Motor();
    }

    public void arrancar() {
        motor.iniciar();
        System.out.println("El vehículo está en movimiento.");
    }

    private class Motor {
        public void iniciar() {
            System.out.println("El motor del vehículo se ha iniciado.");
        }
    }