public class Sedan extends Carro{
    int Kilometraje;
    public Sedan(String color, int Kilometraje){
        super(color);
        this.Kilometraje = Kilometraje;
    }

    public String toString() {
        return "Color: " + color +
                "\nKilometraje: " + Kilometraje;
    }
}
