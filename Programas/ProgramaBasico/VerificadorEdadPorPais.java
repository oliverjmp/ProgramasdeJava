package ProgramaBasico;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
    public class VerificadorEdadPorPais {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Edad mínima legal según país
            Map<String, Integer> edadMinimaPorPais = new HashMap<>();
            edadMinimaPorPais.put("España", 18);
            edadMinimaPorPais.put("Estados Unidos", 21);
            edadMinimaPorPais.put("México", 18);
            edadMinimaPorPais.put("Japón", 20);
            edadMinimaPorPais.put("Brasil", 18);
            edadMinimaPorPais.put("Venezuela",18);

            System.out.print("Ingresa el país: ");
            String pais = scanner.nextLine().trim();

            System.out.print("Ingresa la edad: ");
            int edad = scanner.nextInt();

            if (edadMinimaPorPais.containsKey(pais)) {
                int edadMinima = edadMinimaPorPais.get(pais);
                if (edad >= edadMinima) {
                    System.out.println("✅ Es mayor de edad en " + pais + ".");
                } else {
                    System.out.println("❌ Es menor de edad en " + pais + ".");
                }
            } else {
                System.out.println("⚠️ País no registrado. Agrega la edad mínima manualmente.");
            }
        }
    }

