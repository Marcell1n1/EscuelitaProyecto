package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Estudiante e1 = new Estudiante("Luis Pérez", 8);

        double[] notas = {18, 15, 12, 20, 17, 14.5, 19};
        for (int i = 0; i < notas.length; i++) {
            e1.agregarCalificacion(i, notas[i]);
        }

        e1.mostrarCalificaciones();
        double promedio = e1.calcularPromedio();
        System.out.printf("Promedio de " + e1.getNombre()+ ": " + promedio);
        /*
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Manzana");
        hashSet.add("Pera");
        hashSet.add("Manzana");
        System.out.println("HashSet: " + hashSet);

        Set<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(1);
        hashSet2.add(2);
        hashSet2.add(6);
        hashSet2.add(4);
        System.out.println("HashSet2: " + hashSet2);
        hashSet2.remove(6);
        System.out.println("HashSet2: " + hashSet2);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Manzana");
        treeSet.add("Pera");
        treeSet.add("Banana");
        treeSet.add("Melocoton");
        System.out.println("TreeSet: " + treeSet);

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Banana");
        linkedHashSet.add("Manzana");
        linkedHashSet.add("Pera");
        linkedHashSet.add("Pera");

        System.out.println("LinkedHashSet: " + linkedHashSet);
        *//*
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Pedro",971868080);
        hashMap.put("Ana", 999999999);
        System.out.println("Contactos: ");
        for (String nombre : hashMap.keySet()) {
            System.out.println(nombre + " → " + hashMap.get(nombre));
        }

        hashMap.remove("Pedro");
        System.out.println("Contactos: ");
        for (String nombre : hashMap.keySet()) {
            System.out.println(nombre + " → " + hashMap.get(nombre));
        }
        System.out.println("Número de Luis: " + hashMap.get("Pedro"));

        try {
            Integer numero = hashMap.get("Pedro");

            if (numero == null) {
                throw new NoSuchElementException("El contacto 'Luis' no existe en la agenda.");
            }

            System.out.println("Número de Luis: " + numero);

        } catch (NoSuchElementException e) {
            System.out.println("Excepción atrapada: " + e.getMessage());
        } finally {
            System.out.println("Búsqueda de contacto finalizada.");
        }
        */
    }

}