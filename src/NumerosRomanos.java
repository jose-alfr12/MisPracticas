package Ejercicios;
import java.util.Scanner;

public class NumerosRomanos {

    public static String convertirNumero(int numero) {
        String[] miles = {"", "M", "MM", "MMM"};
        String[] centenas = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] decenas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] unidades = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return miles[numero / 1000] +
               centenas[(numero % 1000) / 100] +
               decenas[(numero % 100) / 10] +
               unidades[numero % 10];
    }

    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.print("Ingresa un número entre 1 y 3999: ");
        int numero = entrada.nextInt();

        if (numero < 1 || numero > 3999) {
            System.out.println("Número fuera de rango. Debe estar entre 1 y 3999.");
        } else {
            System.out.println("Número en romano: " + convertirNumero(numero));
        }

        entrada.close();
    }
}