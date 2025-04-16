package Ejercicios;

import java.util.*;

public class bandera2 {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del array: ");
        int t = consola.nextInt();
        consola.nextLine();

        String[] nombres = new String[t];

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese el nombre " + (i + 1));
            nombres[i] = consola.nextLine();
        }

        System.out.println("Verificacion de nombre: ");
        String nombre = consola.nextLine();

        boolean encontrado = false;

        for (String encontrar : nombres) {
            if (encontrar.equalsIgnoreCase(nombre)) {
                System.out.println("El nombre " + nombre + " esta en la lista");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("El nombre " + nombre + " no esta en la lista");
        }
        consola.close();
    }
}
