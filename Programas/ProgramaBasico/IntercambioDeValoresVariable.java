package ProgramaBasico;
import java.util.Scanner;
    public class IntercambioDeValoresVariable {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Intercambio de valores entre dos variables sin usar tercera\t\uD83D\uDD04");
            System.out.print("Ingresa la Variable A: ");
            float a= input.nextFloat();
            System.out.print("Ingresa la Variable B: ");
            float b= input.nextFloat();

            a=a+b;
            b=a-b;
            a=a-b;

            System.out.println("La Variable A es: "+a);
            System.out.println("La Variable B es: "+b);

        }
    }

