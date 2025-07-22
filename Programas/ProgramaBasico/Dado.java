package ProgramaBasico;
import java.util.Random;
import java.util.Scanner;
    public class Dado {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int numeroUsuario;
            do {
                System.out.print("🔢 Introduce un número entre 1 y 12 antes de lanzar los dados: ");
                while (!scanner.hasNextInt()) {
                    System.out.print("❌ Entrada inválida. Introduce un número válido entre 1 y 12: ");
                    scanner.next();
                }

                numeroUsuario = scanner.nextInt();

                if (numeroUsuario < 1 || numeroUsuario > 12) {
                    System.out.println("⚠️ El número debe estar entre 1 y 12.");
                }
            } while (numeroUsuario < 1 || numeroUsuario > 12);

            scanner.nextLine(); // Limpia el buffer
            System.out.println("🎲 Pulsa ENTER para lanzar los dados...");
            scanner.nextLine();

            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            int sumaDados = dado1 + dado2;

            System.out.println("🎯 Resultado del dado UNO: " + dado1);
            System.out.println("🎯 Resultado del dado DOS: " + dado2);
            System.out.println("🎯 La suma de los dos dados es: " + sumaDados);
            System.out.println("✅ Número introducido por el usuario: " + numeroUsuario);

            // Comparación opcional
            if (numeroUsuario > sumaDados) {
                System.out.println("🎉 ¡CASI LO LOGRAS! Tu número es mayor con la suma de los dados.");

            } else if (numeroUsuario==sumaDados){
                System.out.println("🎉 GANASTE,Tu selección es igual a la suma.");
            }else {
                System.out.println("😄 Lo siento PERDISTE, pero buena tirada.");

            }
        }
    }

