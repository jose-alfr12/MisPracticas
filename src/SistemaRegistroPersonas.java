package Ejercicios;

import java.util.Scanner;

public class SistemaRegistroPersonas {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        String[] nombres = new String[10];
        int[] edades = new int[10];
        char[] generos = new char[10];

        int edad;
        char genero;
        int opcion;
        int i;

        do {
            System.out.println("----SISTEMA DE REGISTRO DE PERSONAS----");
            System.out.println("[1] Ingresar personas.");
            System.out.println("[2] Buscar personas por edad");
            System.out.println("[3] Buscar personas por genero (M/F)");
            System.out.println("[4] Mostrar persona registradas");
            System.out.println("[5] Salir del programa");
            System.out.println("---------------------------------------");
            System.out.println();
            System.out.print("¿Que desea hacer? : ");
            opcion = consola.nextInt();
            consola.nextLine();


            switch (opcion) {
                case 1:
                    System.out.println("(Número maximo de personas = 10)");
                    for (i = 0; i < 10; i++) {
                        System.out.print("Ingrese el nombre de la persona " + " (" + (i + 1) + "): ");
                        nombres[i] = consola.nextLine();

                        System.out.print("Ingrese la edad de la persona: ");
                        edades[i] = consola.nextInt();

                        System.out.print("Ingrese el el genero de la persona: ");
                        generos[i] = consola.next().charAt(0);

                        System.out.println("---------------------------------------");
                    }
                    break;

                case 2:
                    System.out.println("Ingrese la edad:");
                    edad = consola.nextInt();
                    System.out.println("--Personas con la edad de " + edad + "--");

                    boolean encontrado = false;

                    for (i = 0; i < edades.length; i++) {
                        if (edades[i] == edad) {
                            System.out.println(nombres[i] + ": " + "de genero " + generos[i]);
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No hay personas registradas con esa edad.");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Ingrese el genero:");
                    genero = consola.next().charAt(0);
                    System.out.println("--Personas de genero " + genero + "--");
                    
                    encontrado = false;

                    for (i = 0; i < generos.length; i++){
                        if (generos[i] == genero){
                            System.out.println(nombres[i] + ": " + edades[i] + " años");
                            encontrado = true;
                        }
                    }
                    if (!encontrado){
                        System.out.println("No hay personas de genero " + genero);
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("---Personas registradas---");
                    System.out.println("NOMBRE : EDAD : GENERO");
                    System.out.println();
                    for (i = 0; i < 10; i++) {
                        System.out.println(nombres[i] + " : " + edades[i] + " : " + generos[i]);
                    }
                    System.out.println();
                    System.out.println("---Fin del registro---");
                    System.out.println();
                    break;
                default:
                    System.out.println("OPCIÓN NO REGISTRADA EN EL PROGRAMA");
                    break;
            }
        } while (opcion != 5);
        System.out.println("----FIN DEL PROGRAMA----");
        System.out.println("Gracias por usarlo. Creador: Jose Alfredo Gonzalez Zurita");
        consola.close();
    }
}
