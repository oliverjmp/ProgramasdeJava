package ProgramaBasico;

import java.util.Scanner;
    public class Calculator {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Bienvenido a la calculadora 🧠");
            System.out.print("Introduce el primer número: ");
            int numero1 = input.nextInt();
            System.out.print("Introduce el segundo número: ");
            int numero2= input.nextInt();
            System.out.println("¿ Que Operación matematica quieres hacer?: ");
            System.out.println("1.-Sumar (+) ");
            System.out.println("2.-Resta (-) ");
            System.out.println("3.-Multiplicación (*) ");
            System.out.println("4.-División (/) ");
            System.out.print("Selecciona la opción de 1 al 4: ");
            int opcion = input.nextInt();
            double resultado = 0;

            switch (opcion) {
                case 1:
                    resultado = numero1 + numero2;
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    break;
                case 4:
                    if (numero2 != 0) {
                        resultado = (double) numero1 / numero2;
                    } else {
                        System.out.println("⚠️ No se puede dividir por cero.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Opción inválida.");
                    return;

            }
            System.out.println("El resultado es: "+ resultado);
        }
    }

