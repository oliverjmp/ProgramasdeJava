package ProgramaBasico;
import java.util.Scanner;
import java.util.Random;
    public class NumeroAleatorioRango {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            System.out.print("Ingresa el valor mínimo: ");
            int minimo = scanner.nextInt();

            System.out.print("Ingresa el valor máximo: ");
            int maximo = scanner.nextInt();

            if (minimo > maximo) {
                System.out.println("⚠️ El valor mínimo no puede ser mayor que el máximo.");
            } else {
                int numeroAleatorio = random.nextInt(maximo - minimo + 1) + minimo;
                System.out.println("🎰 Número aleatorio generado: " + numeroAleatorio);
            }
        }

    }
