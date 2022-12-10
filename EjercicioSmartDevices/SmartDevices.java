package POO.EjercicioSmartDevices;

public class SmartDevices {
    public static void main(String[] args) {

        SmartPhone iphone = new SmartPhone("Apple", "Black",  12.20, 3.40, 90.09, 16);
        System.out.println("La marca del smartphone es: " + iphone.marca);
        System.out.println("Y su memoria Ram es: " + iphone.memoriaRam);

        SmartWatch appleWatch = new SmartWatch("Apple", "Pink", 20.50, 8);
        System.out.println("La marca del apple watch es: " + appleWatch.marca);
        System.out.println("El peso del apple watch es: " + appleWatch.peso);
    }
}
