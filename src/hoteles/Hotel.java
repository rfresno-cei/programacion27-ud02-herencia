package hoteles;

public class Hotel extends Alojamiento {
    private int estrellas;
    private boolean desayunoIncluido;

    public Hotel(String nombre, double precioPorNoche, String ciudad, int estrellas, boolean desayunoIncluido) {
        super(nombre, precioPorNoche, ciudad);
        this.estrellas = estrellas;
        this.desayunoIncluido = desayunoIncluido;
    }

    public Hotel() {
    }

    public Hotel(String nombre, double precioPorNoche, String ciudad, int estrellas) {
        super(nombre, precioPorNoche, ciudad);
        this.estrellas = estrellas;
        this.desayunoIncluido = false;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public boolean isDesayunoIncluido() {
        return desayunoIncluido;
    }

    public void setDesayunoIncluido(boolean desayunoIncluido) {
        this.desayunoIncluido = desayunoIncluido;
    }

    public String toString() {
        return super.toString() + " (hotel de " + this.estrellas + " estrellas)";
    }
}
