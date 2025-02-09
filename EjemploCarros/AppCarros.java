package EjemploCarros;

public class AppCarros {
    public static void main(String[] args) {

        Sedan sedan1 = new Sedan("rojo", 2000);
        SUV suv1 = new SUV(true, "azul");
        System.out.println(sedan1.toString());
        System.out.println(suv1.toString());

    }


}
