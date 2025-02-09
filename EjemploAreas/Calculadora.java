package EjemploAreas;

public class Calculadora {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(20);
        Triangulo triangulo1 = new Triangulo(20, 10);
        Cuadrado cuadrado1 = new Cuadrado(20, 10);
        Rectangulo rectangulo1 = new Rectangulo(20, 10);

        System.out.println("El area del circulo es:" + circulo1.calcularArea());
        System.out.println("El area del cuadrado es: " + cuadrado1.calcularArea());
        System.out.println("El area del triagunlo es: " + triangulo1.calcularArea());
        System.out.println("El area del rectangulo es:" + rectangulo1.calcularArea() );

    }
}
