package ProgramaBasico;
import java.util.Scanner;
    public class ConvertidorHoraAMinutosSegundos {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Convertidor de HORA a MINUTOS y SEGUNDOS");
            System.out.print("Introduce las Cantidad de Horas: ");
            int hours= input.nextInt();

            int minute=hours*60;
            int seconds=minute*60;

            System.out.println("En"+" "+hours+" "+"horas"+" "+"existen"+" "+minute+" "+"minutos y "+" "+seconds+" "+"segundos");

        }
    }