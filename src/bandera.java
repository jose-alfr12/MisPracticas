package Ejercicios;
import java.util.*;
public class bandera {
public static void main(String[] args) {
    var consola = new Scanner(System.in);

    System.out.println("Ingrese el tamaño del array: ");
    int t = consola.nextInt();

    int[] array = new int[t];

    for (int i = 0; i < array.length; i++){
        System.out.println("Ingrese un numero: ");
        array[i] = consola.nextInt();
    }
    boolean par = false;

    for (int j : array) {

        if (j % 2 == 0) {
            System.out.println("Los pares son: " + j);
            par = true;
        }
    }
        if (!par){
            System.out.println("No hay pares");
        }
        consola.close();
}
}
