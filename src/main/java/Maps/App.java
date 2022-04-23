package Maps;

import java.security.KeyStore;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class App {

    private Map<Integer, String> map;

    public void poblar() {
        map = new HashMap<>();
        map.put(1, "Clau");
        map.put(2, "Hi");
        map.put(3, "Rojas");
    }

    public void imprimir_v7() {
        for(Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println("Llave: "+ e.getKey() +" Valor: "+ e.getValue());
        }
    }
    public void imprimir_v8() {
        // map.forEach((k, v) -> System.out.println("Llave: "+ k +" Valor: "+ v));
        map.entrySet().stream().forEach(System.out::println);
    }

    public void recolectar() {
        Map<Integer, String> mapaRacolectado = map.entrySet().stream()
                .filter(e -> e.getValue().contains("Hi"))
                .collect(Collectors.toMap(p-> p.getKey(), p-> p.getValue()));
        mapaRacolectado.forEach((k,v)-> System.out.println("Llave: "+k+" Valor: "+v));
    }

    public void insertarSiAusente() {
        map.putIfAbsent(4, "Zorrilla");
    }

    public void operarSiPresente() {
        map.computeIfPresent(3,(k, v) -> k + v);
        System.out.println(map.get(3));
    }

    public void obtenerOrPredeterminado() {
        String valor = map.getOrDefault(5,"valor por defecto");
        System.out.println(valor);
    }

    public static void main(String[] args) {
        App app = new App();
        app.poblar();
        app.imprimir_v7();
        app.imprimir_v8();
    }
}
