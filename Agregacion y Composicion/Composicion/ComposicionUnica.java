public class ComposicionUnica {

    private Motor motor;

    public ComposicionUnica() {
        this.motor = new Motor();
    }

    public void arrancar() {
        motor.encender();
        System.out.println("El objeto está en movimiento.");
    }

    private class Motor {
        public void encender() {
            System.out.println("El motor se ha encendido.");
        }
    }