package EjemploAreas;

public class Rectangulo extends Figura{
    double base;
    double altura;

    public Rectangulo (double base, double altura){
        this.altura = altura;
        this.base = base;

    }

    @Override
    public double calcularArea() {
        return (base * altura);
    }
}
