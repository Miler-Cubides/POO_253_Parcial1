package Validadores;

import Main.Menu;

import java.util.Scanner;

public abstract class Validador extends Menu {

    @Override
    public void ejecutar() {

        int aNioactual = 2025;
        int mesactual  = 10;
        int diaactual = 15;

        Scanner leer = new Scanner(System.in);

        System.out.println("¿Cómo es tu nombre?");
        String nombre = leer.nextLine();

        System.out.println(nombre + ", bienvenid@. Vamos a saber si eres mayor de edad o no.");
        System.out.println("Ingresa tu día de nacimiento:");
        int D = leer.nextInt();

        System.out.println("Ingresa tu mes de nacimiento:");
        int M = leer.nextInt();

        System.out.println("Ingresa tu año de nacimiento:");
        int A = leer.nextInt();

        int edad = aNioactual - A;


        if (edad > 18) {
            System.out.println(nombre + ", eres mayor de edad (" + edad);


        } else if (edad == 18) {
            if (A < mesactual  || (M == mesactual  && D <= diaactual)) {
                System.out.println(nombre + ", ya cumpliste 18 años. Eres mayor de edad.");
            } else {
                System.out.println(nombre + ", aún no has cumplido los 18 años.");
            }


        } else {
            System.out.println(nombre + ", eres menor de edad "+ edad);
        }
    }

    public abstract void ejecutar(Scanner sc);
}