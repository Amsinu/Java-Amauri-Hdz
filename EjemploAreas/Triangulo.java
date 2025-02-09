package EjemploAreas;

public class Triangulo extends Figura {
    double base;
    double altura;

    public Triangulo(double base, double altura){
        this.altura = altura;
        this.base = base;

    }

    public double calcularArea(){
        return (base * altura ) / 2;
    }

}
