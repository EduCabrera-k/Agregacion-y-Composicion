public class Libreria {

    private Libro libro;

    public Libreria() {
        this.libro = new Libro();
    }

    public void leer() {
        libro.abrir();
        System.out.println("La persona está leyendo el libro.");
    }

    private class Libro {
        public void abrir() {
            System.out.println("El libro se ha abierto.");
        }
    }