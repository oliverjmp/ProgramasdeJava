package ProgramaBasico;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
    public class CalculadoraDeEdadFechaNacimiento {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Dime tu fecha de Nacimiento y te dijo cuantos años tienes");
            System.out.print("Fecha de Nacimiento (formato: YYYY-MM-DD) : ");
            String fechaTexto = input.nextLine();

            LocalDate fechaNacimiento = LocalDate.parse(fechaTexto);
            LocalDate hoy = LocalDate.now();

            Period edad = Period.between(fechaNacimiento, hoy);

            System.out.println("Tienes " + edad.getYears() + " años, " +
                    edad.getMonths() + " meses y " +
                    edad.getDays() + " días.");

        }
    }