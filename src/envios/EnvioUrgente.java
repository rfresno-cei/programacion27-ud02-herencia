package envios;

public class EnvioUrgente extends Envio {
    private double recargo;

    public EnvioUrgente(String codigo, String destino, double peso, double costeBase, double recargo) {
        super(codigo, destino, peso, costeBase);
        this.recargo = recargo;
    }

    public EnvioUrgente() {
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }

    public double getCosteTotal() {
        return this.getCosteBase() + this.recargo;
    }

    public String toString() {
        return "Envío urgente " + this.getCodigo() + " con destino " + this.getDestino();
    }
}
