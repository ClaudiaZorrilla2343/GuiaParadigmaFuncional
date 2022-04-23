package FuncionesDeALtoOrden;

import java.util.Locale;
import java.util.function.Function;


public class HigApp {
    private Function<String, String> convertirMayusculas = x -> x.toUpperCase();
    private Function<String, String> convertirMinusculas = x -> x.toLowerCase();

    public void imprimir(Function<String, String> function, String valor) {
        System.out.println(function.apply(valor));
    }

    public Function<String, String> mostrar (String mensaje) {
        return (String x) -> mensaje + x;
    }

    public static void main(String[] args) {
        HigApp app = new HigApp();
        app.imprimir(app.convertirMayusculas, "Clau");
        app.imprimir(app.convertirMinusculas, "CLAU");

        String rpta = app.mostrar("Hi").apply("MitoCode");
        System.out.println(rpta);
    }

}
