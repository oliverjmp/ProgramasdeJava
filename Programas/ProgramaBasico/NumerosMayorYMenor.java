package ProgramaBasico;

import java.util.Scanner;
    public class NumerosMayorYMenor {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Selecciona 3 números te dijo cuale es el MAYOR y el MENOR");
            System.out.print("Introduce el Primer número: ");
            int number1= input.nextInt();
            System.out.print("Introduce el Segundo número: ");
            int number2= input.nextInt();
            System.out.print("Introduce el Tercer número: ");
            int number3= input.nextInt();

            int mayor=number1;
            int menor=number1;

            if (number2>mayor) {
                mayor = number2;
            }
            if (number3>mayor) {
                mayor = number3;
            }
            // Comparar para encontrar el menor
            if (number2 < menor) {
                menor = number2;
            }
            if (number3 < menor) {
                menor = number3;
            }
            // Resultados
            System.out.println("✅ El mayor de los tres es: " + mayor);
            System.out.println("✅ El menor de los tres es: " + menor);

            input.close();


        }
    }
