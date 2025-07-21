package ProgramaBasico;
import java.util.Scanner;
    public class NumeroEntreDosValores {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Número entre dos Valores");
            System.out.print("Escoge un número del 1 al 500: ");
            int numero1= input.nextInt();

            if (numero1>= 50 && numero1<=250) {
                System.out.println("El número que escogiste, si esta dentro del rango escogido, que era entre 50 y 250");
            }else {
                System.out.println("Lo sentimos, el número que escogiste no esta dentro del Rango, Vuelvelo a intentar");
            }


        }

    }