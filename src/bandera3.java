import java.util.*;
public class bandera3 {
public static void main(String[] args) {
    var consola = new Scanner(System.in);

    System.out.println("Tamaño del array: ");
    int t = consola.nextInt();

    double[] notas_estudiantes = new double[t];

    for (int i = 0; i < notas_estudiantes.length; i++){
        System.out.println("Ingrese la nota: ");
        notas_estudiantes[i] = consola.nextDouble();
    }

    boolean aprobados = false;
    double nota = 3.0;
    int aprobadoN = 0;

    for (int i = 0; i < notas_estudiantes.length; i++){
        if (notas_estudiantes[i] >= nota){
            System.out.println("Aprobados: " + notas_estudiantes[i]);
            aprobados = true;
            
            aprobadoN = aprobadoN + 1;
        }
    }
    System.out.println("Numero de aprobados: " + aprobadoN);
    if (!aprobados){
        System.out.println("No hay aprobados");
    }
    consola.close();
}
}
