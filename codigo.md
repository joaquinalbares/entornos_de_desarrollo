Código a estudiar

```java

import java.util.Scanner;

public class CalculadoraPrimos {

    public static int operacion(int a, int b, String operador) {

        int resultado = 0;
        
        switch (operador) {
            case "+":
                resultado = a + b;
                break;
            case "-":
                resultado = a - b;
                break;
            case "*":
                resultado = a * b;
                break;
            case "/":
                if (b != 0) {
                    resultado = a / b;
                } else {
                    throw new IllegalArgumentException("No se puede dividir por cero.");
                }
                break;
            default:
                throw new IllegalArgumentException("Operador no válido.");
        }
        return resultado;
    }
    

    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Introduce la operación (+, -, *, /): ");
        String operador = scanner.next();

        // Cálculo de la operación
        try {
            int resultado = operacion(num1, num2, operador);
            System.out.println("Resultado: " + resultado);
            
            // Comprobación de número primo
            if (esPrimo(resultado)) {
                System.out.println("El resultado es un número primo.");
            } else {
                System.out.println("El resultado NO es un número primo.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}

```
