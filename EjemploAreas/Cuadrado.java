package EjemploAreas;

public class Cuadrado extends Figura {
    double lado1;
    double lado2;

    public Cuadrado (double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;

    }

    @Override
    public double calcularArea() {
        return (lado1 * lado2);

    }
}
