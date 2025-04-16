public class Carro {
    String modelo;
    String marca;
    int year;

    public void arrancar(){
        System.out.println("El auto " + modelo + " de la marca " + marca + " y del año " + year + " ha arrancado.");
    }

    public static void main(String[] args) {
        Carro auto1 = new Carro();
        auto1.modelo = "Civic";
        auto1.marca = "Honda";
        auto1.year = 2020;

        auto1.arrancar();

        Carro auto2 = new Carro();
        auto2.modelo = "Corolla";
        auto2.marca = "Toyota";
        auto2.year = 2021;

        auto2.arrancar();

        Carro auto3 = new Carro();
        auto3.modelo = "Mustang";
        auto3.marca = "Ford";
        auto3.year = 2022;

        auto3.arrancar();
    }
}
