package POO.EjercicioSmartDevices;

public class SmartPhone {

    String marca;
    String color;
    double largo;
    double ancho;
    double peso;
    int memoriaRam;

    public SmartPhone(){}

    public SmartPhone(String marca, String color, double largo, double ancho, double peso, int memoriaRam) {
        this.marca = marca;
        this.color = color;
        this.largo = largo;
        this.ancho = ancho;
        this.peso = peso;
        this.memoriaRam = memoriaRam;
    }
}
