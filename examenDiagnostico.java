import java.util.Scanner;

public class examenDiagnostico {

    static Scanner teclado = new Scanner(System.in);

    // Crear funci[on para incrementar la edad]
    public static void incrementAge() {
        System.out.println("Introduce tu edad");
        int edad = teclado.nextInt();

        int edadIncrementada = edad + 5;

        System.out.println("La edad incrementada es: " + edadIncrementada);
    }

    // Funcion numero positivo, negativo o cero
    public static void evaluateNumber() {
        System.out.println("Introduzca un numero");
        int num = teclado.nextInt();
        if (num > 0) {
            System.out.println("El numero es positivo");
        }
        if (num < 0) {
            System.out.println("El numero es negativo");
        }
        if (num == 0) {
            System.out.println("Tu numero es 0");
        }
    }

    // Funcion para imprimir un ciclo de numeros del 1-20
    public static void printNumbers() {
        int num[] = new int[20];
        for (int i = 0; i <= 19; i++) {
            int res = i + 1;
            System.out.println(res);

        }
    }

    public static void main(String ars[]) {

        // Llamar funcion para incrementar la edad
        incrementAge();

        // Llamar funcion para evaluar numero
        evaluateNumber();

        // Llamar funcion imprimir ciclo del 1-20
        printNumbers();
    }

}