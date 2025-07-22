package ProgramaBasico;
import java.util.Scanner;
    public class CalculodeAreayPerimetro {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("📐 Selecciona la figura:");
            System.out.println("1. Cuadrado");
            System.out.println("2. Círculo");
            System.out.println("3. Triángulo");
            System.out.println("4. Rectángulo");
            System.out.print("👉 Opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("🔢 Ingresa el lado del cuadrado (cm): ");
                    double lado = scanner.nextDouble();
                    System.out.println("📏 Área: " + (lado * lado));
                    System.out.println("📏 Perímetro: " + (4 * lado));
                    break;

                case 2:
                    System.out.print("🔢 Ingresa el radio del círculo (cm): ");
                    double radio = scanner.nextDouble();
                    System.out.println("📏 Área: " + (Math.PI * radio * radio));
                    System.out.println("📏 Perímetro: " + (2 * Math.PI * radio));
                    break;

                case 3:
                    System.out.print("🔢 Ingresa la base del triángulo (cm): ");
                    double base = scanner.nextDouble();
                    System.out.print("🔢 Ingresa la altura del triángulo (cm): ");
                    double altura = scanner.nextDouble();
                    System.out.print("🔢 Ingresa los otros dos lados (cm): ");
                    double lado1 = scanner.nextDouble();
                    double lado2 = scanner.nextDouble();
                    System.out.println("📏 Área: " + ((base * altura) / 2));
                    System.out.println("📏 Perímetro: " + (base + lado1 + lado2));
                    break;

                case 4:
                    System.out.print("🔢 Ingresa la base del rectángulo (cm): ");
                    double baseR = scanner.nextDouble();
                    System.out.print("🔢 Ingresa la altura del rectángulo (cm): ");
                    double alturaR = scanner.nextDouble();
                    System.out.println("📏 Área: " + (baseR * alturaR));
                    System.out.println("📏 Perímetro: " + (2 * (baseR + alturaR)));
                    break;

                default:
                    System.out.println("❌ Opción inválida.");

            }
            }
        }


