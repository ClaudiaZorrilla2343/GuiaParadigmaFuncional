package Package;

 public class DefaultMethod implements PersonaA, PersonaB{
    @Override
    public void Caminar() {
        System.out.println("hi");
    }

     @Override
     public void hablar() {
         //PersonaB.super.hablar();
         System.out.println("Sobreescritura de método");
     }

     public static void main(String[] args) {
        DefaultMethod app = new DefaultMethod();
        app.hablar();
    }
}
