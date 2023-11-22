public class ObjCompu {

    private Teclado teclado;

    public ObjCompu () {
        this.teclado = new Teclado();
    }

    public void escribir() {
        teclado.pulsarTecla();
        System.out.println("La persona está escribiendo en el teclado.");
    }

    private class Teclado {
        public void pulsarTecla() {
            System.out.println("Tecla pulsada en el teclado.");
        }
    }