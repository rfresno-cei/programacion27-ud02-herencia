import envios.EnvioInternacional;
import envios.EnvioNacional;
import envios.EnvioUrgente;
import hoteles.Camping;
import hoteles.Hotel;

public class Main {
    public static void main(String[] args) {
        /*EnvioNacional en = new EnvioNacional("543", "Segovia", 2.5, 15);
        System.out.println(en);
        System.out.println(en.getCosteTotal());
        EnvioInternacional ei = new EnvioInternacional("456", "São Paulo", 5, 21, 40, "Brasil");
        System.out.println(ei);
        System.out.println(ei.getCosteTotal());
        EnvioUrgente eu = new EnvioUrgente("856", "Málaga", 9, 13, 5);
        System.out.println(eu);
        System.out.println(eu.getCosteTotal());*/
        Hotel h = new Hotel("Barceló", 200, "Sevilla", 5, true);
        System.out.println(h);
        System.out.println(h.calcularPrecio(4));
        Camping c = new Camping("Camping CEI", 15, "Huelva", 50, 75, true);
        System.out.println(c);
        System.out.println(c.getCapacidadRestante());
    }
}