package ProgramaBasico;
import java.util.Scanner;
    public class ComparacionEdad {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Bienvenido a la Diferencia de Edad");
            System.out.print("Introduce el Nombre de la Primera Persona: ");
            String name1 = input.nextLine();
            System.out.print("Introduce la Edad de la Primera Persona: ");
            int age1 = input.nextInt();
            input.nextLine();
            System.out.print("Introduce el Nombre de la Segunda Persona: ");
            String name2 = input.nextLine();
            System.out.print("Introduce la Edad de la Segunda Persona: ");
            int age2 = input.nextInt();

            if (age1>age2) {
                System.out.println("La persona Mayor es " + " " + name1);
            } else if (age1<age2) {
                System.out.println("La persona Mayor es " + " " + name2);
            } else if (age1==age2) { System.out.println("Las personas tiene la misma EDAD"+" "+age1);
            }
            int difference=Math.abs(age1-age2);
            System.out.println("La diferencia en entre"+" "+name1+" "+"y"+" "+name2+", es de"+" "+difference+" "+"años");
        }

    }

