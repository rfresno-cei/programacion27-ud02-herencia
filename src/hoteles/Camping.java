package hoteles;

public class Camping extends Alojamiento {
    private int numCaravanas;
    private int capacidadCaravanas;
    private boolean tienePiscina;

    public Camping(String nombre, double precioPorNoche, String ciudad, int numCaravanas, int capacidadCaravanas, boolean tienePiscina) {
        super(nombre, precioPorNoche, ciudad);
        this.numCaravanas = numCaravanas;
        this.capacidadCaravanas = capacidadCaravanas;
        this.tienePiscina = tienePiscina;
    }

    public Camping() {
    }

    public int getNumCaravanas() {
        return numCaravanas;
    }

    public void setNumCaravanas(int numCaravanas) {
        this.numCaravanas = numCaravanas;
    }

    public int getCapacidadCaravanas() {
        return capacidadCaravanas;
    }

    public void setCapacidadCaravanas(int capacidadCaravanas) {
        this.capacidadCaravanas = capacidadCaravanas;
    }

    public boolean isTienePiscina() {
        return tienePiscina;
    }

    public void setTienePiscina(boolean tienePiscina) {
        this.tienePiscina = tienePiscina;
    }

    public int getCapacidadRestante() {
        return this.capacidadCaravanas - this.numCaravanas;
    }

    public String toString() {
        return super.toString() + " (camping con capacidad para " +
                this.capacidadCaravanas + " caravanas)";
    }
}
