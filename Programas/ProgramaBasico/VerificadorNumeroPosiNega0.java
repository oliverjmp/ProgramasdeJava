package ProgramaBasico;
import java.util.Scanner;
    public class VerificadorNumeroPosiNega0 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Verificador Número Positivo, Negativo o Cero");
            System.out.print("Introduce el Número que quieras, puede ser POSITIVO, NEGATIVO,CERO: ");
            Float number1= input.nextFloat();

            if (number1>0) {
                System.out.println("El número que escogiste es positivo"+" "+",es el "+number1);
            } else if (number1<0) {
                System.out.println("El número que escogiste es negativo"+" "+",es el "+number1);
            } else if (number1==0) {
                System.out.println("El número que escogiste es el "+number1);
            }


        }
    }