public class Ventanilla {

    private Ventana ventana;

    public Ventanilla() {
        this.ventana = new Ventana();
    }

    public void abrirVentana() {
        ventana.abrir();
        System.out.println("La persona está abriendo la ventana.");
    }

    private class Ventana {
        public void abrir() {
            System.out.println("La ventana se ha abierto.");
        }
    }