package MetodosReferencia;

import java.util.Arrays;
import java.util.Comparator;

public class MeRefApp {

    public static void referenciarMetodoStatic() {
        System.out.println("Metodo referido static");
    }

    public void referenciarMetodoInstanciaObjetoArbitrario() {
        String[] nombres = {"Claudia", "Zorrilla", "Rojas"};

        /*Arrays.sort(nombres, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });*/
        //Con una lambda
        //Arrays.sort(nombres, (s1, s2) -> s1.compareToIgnoreCase(s2));
        //System.out.println(Arrays.toString(nombres));
        //Con referencias a metodos
        Arrays.sort(nombres, String :: compareToIgnoreCase);
        System.out.println(Arrays.toString(nombres));
    }

    public void referenciarMetodoInstanciaObjetoParticular() {
        System.out.println("Metodo referido instancia de clase de objeto en particular");
    }

    public void referenciarConstructor() {
        IPersona iper = new IPersona(){

            @Override
            public Persona crear(int id, String nombre) {
                return new Persona(id, nombre);
            }
        };
        iper.crear(1, "Claudia");

        /*IPersona iper2 = (x, y) ->(new Persona(x, y));
        Persona per = iper2.crear(1, "Claudia");
        System.out.println(per.getId()+ " - "+per.getNombre());*/

        IPersona iper3 = Persona::new;
        Persona per = iper.crear(2, "Luz");
        System.out.println(per.getId()+ " - "+per.getNombre());
    }

    public void operar() {
        Operacion op = () -> MeRefApp.referenciarMetodoStatic();
        op.saludar();
    }

    public static void main(String[] args) {
        MeRefApp app = new MeRefApp();
        app.operar();
        app.referenciarMetodoInstanciaObjetoArbitrario();

        Operacion op = app::referenciarMetodoInstanciaObjetoParticular;
        op.saludar();
    }
}
