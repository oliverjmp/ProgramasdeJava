package ProgramaBasico;
import java.util.Scanner;
    public class CoversorTempreratura {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Conversor de Temperatura");
            System.out.println("Selecciona la Conversión que quieres hacer: ");
            System.out.println("1.- Cº a Fº");
            System.out.println("2.- Fº a Cº");
            int opcion= input.nextInt();
            System.out.println("Coloca la Temperatura de Origen");
            int tempOrigen= input.nextInt();
            double resultado = 0;


            switch (opcion){
                case (1):
                    resultado =(tempOrigen* 9/5)+32;
                   System.out.println("La temperatura "+" "+tempOrigen+"Cº"+",es igual a: "+resultado+"Fº");
                   break;
                case (2):
                     resultado=(tempOrigen-32)*5/9;
                    System.out.println("La temperatura "+" "+tempOrigen+" Fº"+",es igual a: "+resultado+" Cº");
                    break;

            }
        }
    }