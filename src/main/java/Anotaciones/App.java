package Anotaciones;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Tener operaciones de manipulación
 * Anotaciones costumisables
 */
public class App {

    @Retention(RetentionPolicy.RUNTIME)
    public @interface Lenguajes {
        Lenguaje[] value() default {};
    }

    @Repeatable(value = Lenguajes.class)
    public @interface Lenguaje {
        String value();
        String nombreUsuario() default "Claudia";
    }
    @Lenguaje("Java")
    @Lenguaje("Python")
    public interface LenguajeProgramacion {

    }

    public static void main(String[] args) {
        Lenguaje[] lenguajeArray = LenguajeProgramacion.class.getAnnotationsByType(Lenguaje.class);
        System.out.println("Se tiene "+lenguajeArray.length +" anotaciones");

        Lenguajes len = LenguajeProgramacion.class.getAnnotation(Lenguajes.class);
        for(Lenguaje elemento : len.value()){
            System.out.println(elemento.value());
        }
    }
}
