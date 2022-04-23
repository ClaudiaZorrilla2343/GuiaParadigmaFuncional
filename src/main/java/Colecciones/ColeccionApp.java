package Colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ColeccionApp {
    private List<String> lista;

    public void llenarLista() {
        lista = new ArrayList<>();
            lista.add("Claudia");
            lista.add("Zorrilla");
            lista.add("Rojas");
    }

    public void usarForEach() {
        /*for(String elemento : lista) {
            System.out.println(elemento);
        }*/

        //lista.forEach(x -> System.out.println(x));

        lista.forEach(System.out::println);
    }

    public void usarRemoveIf() {
        /*Iterator<String> it = lista.iterator();
        while(it.hasNext()) {
            if (it.next().equalsIgnoreCase("Claudia")){
                it.remove();
            }
        }*/

        lista.removeIf(x -> x.equalsIgnoreCase("Claudia"));
    }

    public void usarSort() {
        lista.sort((x, y) -> x.compareTo(y));
    }

    public static void main(String[] args) {
        ColeccionApp app = new ColeccionApp();
        app.llenarLista();
        //app.usarRemoveIf();
        app.usarSort();
        app.usarForEach();
    }
}