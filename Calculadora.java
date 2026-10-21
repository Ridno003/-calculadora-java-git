// Versión manipulada en la practica 7
// Versión manipulada en la practica 7

import java.util.Scanner;

public class Calculadora {
     // Corrección de bug de suma
    public int multiplicar(int a, int b) { 
        return a * b;
    } 

    public static void main(String[] args) {

        /* Se asegura de cerrar el Scanner de forma automática al terminar de usarlo  */
        try (Scanner scanner = new Scanner(System.in)) {
            double num1, num2 = 0, resultado;
            int operacion;
            System.out.println("=== CALCULADORA BÁSICA JAVA===");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz cuadrada");
            System.out.print("Elige una operación (1-6): ");
            operacion = scanner.nextInt();
            
			System.out.print("Ingresa el primer número: ");
            num1 = scanner.nextDouble();
			
            if (operacion != 6) {
                System.out.print("Ingresa el segundo número: ");
                num2 = scanner.nextDouble();
            }

            switch (operacion) {
                case 1: {
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
                    break;
                }
                case 2: {
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + num1 + " - " + num2 + " = " + resultado);
                    break;
                }
                case 3: {
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + num1 + " * " + num2 + " = " + resultado);
                    break;
                }
                case 4: {
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + num1 + " / " + num2 + " = " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;
                }
                case 5: {
                    resultado = Math.pow(num1, num2);
                    System.out.println("Resultado: " + num1 + " ^ " + num2 + " = " + resultado);
                    break;
                }
                case 6: {
                    resultado = Math.sqrt(num1);
                    System.out.println("Raíz cuadrada de " + num1 + " = " + resultado);
                    break;
                }
                default: System.out.println("Opción no válida.");
            }
        } // Aquí finaliza el bloque 'try' y el scanner se cierra solo, ya no hace falta "scanner.close()"
    }
}