import java.util.Scanner;
public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pin = 1234;
        int numeroCuenta = 123;
        int pinIngresado;
        int cuentaIngresada;
        int intentos = 0;
        int intentosMax = 3;
        int opcion;
        int saldoIncial = 1000;
        int saldoRetiro;
        int saldoDeposito;

        System.out.println("----Bienvenido Colpatria----");

        while (intentos < intentosMax) {
            System.out.println("Ingrese el número de cuenta:");
            cuentaIngresada = sc.nextInt();
            System.out.println("Ingrese el pin de la cuenta:");
            pinIngresado = sc.nextInt();

            if (cuentaIngresada == numeroCuenta && pinIngresado == pin) {
                System.out.println("----Sesión iniciada con exito----");

                do {
                    System.out.println("""
                            ----¿Que desea realizar el dia de hoy?:----
                            1. Consultar saldo
                            2. Depositar nuevo saldo
                            3. Retirar saldo de la cuenta
                            4. Salir del cajero""");
                    opcion = sc.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("Saldo actual = " + saldoIncial);
                            break;
                        case 2:
                            System.out.println("---¿Cuanto va a depositar?:---");
                            saldoDeposito = sc.nextInt();

                            if (saldoDeposito <= 0) {
                                System.out.println("El deposito tiene que ser mayor que 0");
                            } else {
                                saldoIncial +=saldoDeposito;
                                System.out.println("Saldo actual = " + saldoIncial);
                            }
                            break;
                        case 3:
                            System.out.println("---¿Cuanto va a retirar?--");
                            saldoRetiro = sc.nextInt();

                            if (saldoRetiro <= 0) {
                                System.out.println("---El saldo a retirar tiene que ser mayor que 0---");
                            } else if (saldoRetiro > saldoIncial) {
                                System.out.println("---No tienes tanta plata---");
                            } else {
                                saldoIncial -=saldoRetiro;
                                System.out.println("Saldo actual = " + saldoIncial);
                            }
                            break;
                        case 4:
                            System.out.println("----Usted ha cerrado sesión----");
                            break;
                        default:
                            System.out.println("---Escoja una de las opciones establecidas---");
                            break;
                    }
                } while (opcion != 4);
                    break;
            }else
                intentos++;
            if (intentos < intentosMax)
            {
                System.out.println("Número de cuenta o pin incorrecto. Intentos restantes: " + (intentosMax - intentos));
            }
            else {
                System.out.println("Ha superado el número de intentos maximos. Su cuenta ha sido bloqueada");
                }
            }
            
            sc.close(); }    
    }              
                   

