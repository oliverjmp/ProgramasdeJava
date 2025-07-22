package ProgramaBasico;
import java.util.Scanner;
    public class CalculadoraPorcentaje {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Calcula el porcentaje de Cualquier Número");
            System.out.print("Introduce el Número al que quieres aplicar el porcentaje: ");
            float amount = input.nextFloat();
            System.out.print("¿Que PORCENTAJE quieres aplicar?: ");
            float percentage= input.nextFloat();

            float resultado= ((amount*percentage)/100);

            System.out.println("El"+percentage+"% de "+amount+" "+"es igual a: "+resultado+"%");

        }
    }
