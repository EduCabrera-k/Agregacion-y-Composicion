public class Pelota {
    private String material;

    public Pelota(String material) {
        this.material = material;
    }

    public void rebotar() {
        System.out.println("La pelota de " + material + " está rebotando.");
    }
}