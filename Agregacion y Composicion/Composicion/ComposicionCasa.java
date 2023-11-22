public class ComposicionCasa {

    private Casa casa;

    public ComposicionCasa() {
        this.casa = new Casa();
    }

    public void vivir() {
        casa.habitar();
        System.out.println("La persona está viviendo en la casa.");
    }

    private class Casa {
        public void habitar() {
            System.out.println("La casa está habitada.");
        }
    }