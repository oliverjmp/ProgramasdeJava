package ProgramaBasico;
import java.util.Scanner;
    public class VerificacióndeCaracteres {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Ingresa un carácter: ");
            char caracter = input.next().charAt(0);

            if (Character.isLetter(caracter)) {
                caracter = Character.toLowerCase(caracter);
                if ("aeiou".indexOf(caracter) != -1) {
                    System.out.println("Es una vocal.");
                } else {
                    System.out.println("Es una consonante.");
                }
            } else if (Character.isDigit(caracter)) {
                System.out.println("Es un número.");
            } else {
                System.out.println("Es un símbolo.");
            }

        }
    }

