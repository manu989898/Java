package actividades.Bucles;

import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        /*
         * Escribe un programa que lea desde teclado los tiempos (en segundos) que han
         * hecho los ocho jugadores de una carrera y devuelva la suma de estos tiempos y
         * el tiempo medio que han hecho. Usa un bucle for.
         */

        Scanner escaner = new Scanner(System.in);
        
        double tiempo;
        double total = 0;

        for (int i = 1; i <= 8; i++){
            System.out.println("ingresa el tiempo del jugador " + i );
            tiempo = escaner.nextDouble();
            total = total+tiempo;
        }

        System.out.println("El total de tiempo es: " + total);
        System.out.println("La media de tiempo es: " + (total/8));

        escaner.close();
        
    }
}
