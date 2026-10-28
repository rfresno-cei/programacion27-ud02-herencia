package envios;

public class EnvioInternacional extends Envio {
    private double tasaAduanas;
    private String paisDestino;

    public EnvioInternacional(String codigo, String destino, double peso, double costeBase, double tasaAduanas, String paisDestino) {
        super(codigo, destino, peso, costeBase);
        this.tasaAduanas = tasaAduanas;
        this.paisDestino = paisDestino;
    }

    public EnvioInternacional() {
    }

    public double getTasaAduanas() {
        return tasaAduanas;
    }

    public void setTasaAduanas(double tasaAduanas) {
        this.tasaAduanas = tasaAduanas;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public double getCosteTotal() {
        return this.getCosteBase() + (this.getCosteBase() * this.tasaAduanas / 100);
    }

    public String toString() {
        return "Envío internacional " + this.getCodigo() + " con destino " + this.getDestino() + " (" + this.paisDestino + ")";
    }
}
