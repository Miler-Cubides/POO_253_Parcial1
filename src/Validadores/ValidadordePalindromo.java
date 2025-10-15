package Validadores;

import Main.Menu;

import java.util.Scanner;

public abstract class ValidadordePalindromo extends Menu {
    @Override
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una palabra:");
        String palabra = sc.nextLine();




        StringBuilder palabraInvertida = new StringBuilder();
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida.append(palabra.charAt(i));
        }


        if (palabra.equals(palabraInvertida.toString())) {
            System.out.println(palabra + " es un palíndromo");
        } else {
            System.out.println(palabra + " no es un palíndromo");
        }

    }
}