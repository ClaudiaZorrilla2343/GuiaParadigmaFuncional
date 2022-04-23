package Streams;

import java.util.ArrayList;
import java.util.List;

public class PararelStream {

    private List<Integer> numeros;
    public void llenar() {
        numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numeros.add(i);
        }
    }

    public void probarStream() {
        numeros.stream().forEach(System.out::println);
    }

    public void probarParalelo() {
        numeros.parallelStream().forEach(System.out::println);
        //
    }

    public static void main(String[] args) throws InterruptedException{
        PararelStream app = new PararelStream();
        app.llenar();
        app.probarParalelo();
    }
}
