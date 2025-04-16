public class Objetos {
    String modelo;
    String marca;
    int year;

    public void arrancar(){
        System.out.println("El auto " + modelo + " de la marca " + marca + " ha arrancado.");
    }

    public static void main(String[] args) {
        Objetos auto1 = new Objetos();
        auto1.modelo = "Civic";
        auto1.marca = "Honda";
        auto1.year = 2020;

        auto1.arrancar();

        Objetos auto2 = new Objetos();
        auto2.modelo = "Corolla";
        auto2.marca = "Toyota";
        auto2.year = 2021;

        auto2.arrancar();
    }
}
