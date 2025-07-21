package ProgramaBasico;
import java.util.Scanner;
    public class DeterminarSiUnNumeroEsMultiploOtro {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Determinar si un número es multiplo de otro");
            System.out.print("Escribe un número: ");
            int numero1 = input.nextInt();
            System.out.print("Escribe el Multiplo que crees: ");
            int multiplo= input.nextInt();

            if (numero1 % multiplo==0){
                System.out.println("Seleccón correcta de Multiplo"+" "+multiplo+" "+"para el número"+" "+numero1);
            } else {
                System.out.println("ERROR escogiendo el Multiplo"+" "+multiplo+" "+"para el número"+" "+numero1);
                
            }
            float resultado=numero1 % multiplo;
            System.out.println("El Resto es igual "+" "+resultado);
        }
    }

