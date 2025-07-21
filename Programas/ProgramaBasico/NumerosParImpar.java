package ProgramaBasico;

import java.util.Scanner;
    public class NumerosParImpar {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Bienvenido al Número Par o Impar 🧠");
            System.out.print("Introduce el Número que quieres Saber: ");
            int ParoImpar = input.nextInt();

            if (ParoImpar % 2 ==0){
            System.out.println("El Número"+" "+ ParoImpar+",es PAR");
            } else {
            System.out.println("El Número"+" "+ ParoImpar+", es IMPAR");
        }
    }
}
