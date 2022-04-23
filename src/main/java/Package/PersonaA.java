package Package;

public interface PersonaA {

    public void Caminar();

    default public void hablar() {
        System.out.println("Saludos");
    }
}
