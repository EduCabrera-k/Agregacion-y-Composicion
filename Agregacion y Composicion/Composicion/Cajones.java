public class Cajones {

    private Cajonera cajonera;

    public Cajones() {
        this.cajonera = new Cajonera();
    }

    public void abrirCajon() {
        cajonera.abrir();
        System.out.println("La persona está abriendo un cajón.");
    }

    private class Cajonera {
        public void abrir() {
            System.out.println("La cajonera se ha abierto.");
        }
    }