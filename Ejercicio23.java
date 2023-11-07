package actividades.Bucles;

public class Ejercicio23 {
    public static void main(String[] args) {

        /*
         * Escribe una aplicación que solicite cinco notas. Si el usuario escribe una
         * nota que no está entre
         * 0 y 10 se le informará del error y se le volverá a pedir el dato.
         */

        int nota;
        int contador = 0;

        do {
            System.out.print("Introduce una nota: ");
            nota = Integer.parseInt(System.console().readLine());

            if (nota < 0 || nota > 10) {
                System.out.println("Error, la nota debe estar entre 0 y 10.");
            } else {
                contador++;
            }
        } while (contador < 5);

        System.out.println("Todas las notas han sido introducidas correctamente.");

    }
}
