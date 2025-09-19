/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appcalificaciones2;

/**
 *
 * @author Mina
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
// Pedir el nombre
        System.out.print("Nombre del estudiante: ");
        String nombre = sc.nextLine();

           // Pedir 5 calificaciones
        int[] califs = new int[Alumno.MATERIAS];
        for (int i = 0; i < Alumno.MATERIAS; i++) {
            System.out.print("Calificación " + (i + 1) + " (0-100): ");
            califs[i] = sc.nextInt();
            // Validación simple
            while (califs[i] < 0 || califs[i] > 100) {
                System.out.print("Valor inválido. Ingresa de 0 a 100: ");
                califs[i] = sc.nextInt();
            }
        }

        sc.close();
// Crear objeto Alumno
        Alumno alumno = new Alumno(nombre, califs);
        
        // Calcular promedio y letra
        double promedio = alumno.calcularPromedio(alumno.getCalificaciones());
        char letra = alumno.letraDe(promedio);
        
        // Imprimir resultado
        alumno.imprimirResultado(alumno.getNombre(), alumno.getCalificaciones(), promedio, letra);
    }
}