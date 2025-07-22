package ProgramaBasico;
import java.util.Scanner;
    public class ContadordeDigitos {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Contar Digitos de un Número");
            System.out.print("Ingresa un número: ");
            String numero = input.next();

            int cantidadDigitos = numero.replace("-", "").replace(".", "").length();

            System.out.println("El número ingresado tiene " + cantidadDigitos + " dígitos.");

        }
    }

