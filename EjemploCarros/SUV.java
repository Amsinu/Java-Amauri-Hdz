package EjemploCarros;

public class SUV  extends Carro {
    boolean cuatroRuedas;


    public SUV(boolean cuatroRuedas, String color){
        super(color);
        this.cuatroRuedas = cuatroRuedas;


    }

    @Override
    public String toString() {
        return "Color: " + color +
                "\nCuatro Ruedas: " + cuatroRuedas;
    }
}
