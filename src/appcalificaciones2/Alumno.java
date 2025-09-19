/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcalificaciones2;

/**
 *
 * @author Mina
 */
public class Alumno {
    
public static final int MATERIAS = 5;

    private String nombre;
    private int[] calificaciones; // 5 valores

    public Alumno(String nombre, int[] calificaciones) {
        if (calificaciones == null || calificaciones.length != MATERIAS) {
            throw new IllegalArgumentException("Las calificaciones deben tener 5 elementos");
        }
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public String getNombre() { return nombre; }
    public int[] getCalificaciones() { return calificaciones; }

    // a) promedio de las cinco calificaciones
    public double calcularPromedio(int[] arr) {
        int suma = 0;
        for (int c : arr) suma += c;
        return (double) suma / MATERIAS;
    }

    // b) letra final según la tabla
    public char letraDe(double promedio) {
        if (promedio <= 50) return 'F';
        else if (promedio <= 60) return 'E';
        else if (promedio <= 70) return 'D';
        else if (promedio <= 80) return 'C';
        else if (promedio <= 90) return 'B';
        else return 'A'; // 91–100
    }

    // c) imprime resultados
    public void imprimirResultado(String nombre, int[] arr, double promedio, char letra) {
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < MATERIAS; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + arr[i]);
        }
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("Calificación: " + letra);
    }
}
