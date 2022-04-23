package Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsApp {
    private List<String> lista;
    private List<String> numeros;

    public StreamsApp(){
        lista = new ArrayList<>();
        lista.add("Clau");
        lista.add("Patricia");
        lista.add("Zorrilla");
        lista.add("Rojas");

        numeros = new ArrayList<>();
        numeros.add("1");
        numeros.add("2");
        numeros.add("3");
    }

    public void filtrar() {
        lista.stream().filter(x -> x.startsWith("C")).forEach(System.out::println);
    }
    public void ordenar() {
        //lista.stream().sorted().forEach(System.out::println);
        lista.stream().sorted((x, y)-> y.compareTo(x)).forEach(System.out::println);
    }
    public void transformar() {
        lista.stream().map(String::toUpperCase).forEach(System.out::println);
        numeros.stream().map(x -> Integer.parseInt(x)+1).forEach(System.out::println);
    }
    public void limitar() {
        lista.stream().limit(2).forEach(System.out::println);
    }
    public void contar() {
        long x = lista.stream().count();
        System.out.println(x);
    }

    public static void main(String[] args) {
        StreamsApp app = new StreamsApp();
        app.filtrar();
        app.ordenar();
        app.transformar();
    }


}
