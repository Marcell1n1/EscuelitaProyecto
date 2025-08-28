package org.example;

public class Estudiante {
    private String nombre;
    private double [] calificaciones;

    public double[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante(String nombre, int calificacionesNum){
        this.calificaciones = new double[calificacionesNum];
        this.nombre = nombre;
    }
    public void agregarCalificacion(int index, double calificacion) {
        if (index < 0 || index >= calificaciones.length) {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("Índice fuera de rango");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
            return;
        }
        if (calificacion < 0 || calificacion > 20) {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("Calificación inválida: "+ calificacion);
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!");
            return;
        }
        this.calificaciones[index] = calificacion;
    }
    public double calcularPromedio() {
        double suma = 0;
        int count = 0;
        for (double c : calificaciones) {
                suma += c;
                if(c!=0){
                    count++;
                }
        }
        return suma / count;
    }
    public void mostrarCalificaciones() {
        System.out.println("Calificaciones de " + nombre + ":");
        for (int i = 0; i < calificaciones.length; i++) {
            String valor = calificaciones[i] < 0 ? "-" : String.valueOf(calificaciones[i]);
            System.out.println("  [" + i + "] = " + valor);
        }
    }
}
