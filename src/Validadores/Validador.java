package Validadores;

import Main.Menu;

import java.util.Scanner;

public abstract class Validador extends Menu {
    public void ejecutar() {
        final int aNioactual = 2025;
        final int mesactual = 10;
        final int diaactual = 15;

        Scanner leer = new Scanner(System.in);
        System.out.println("Cómo es tu nombre?");
        String name = leer.nextLine();

        System.out.println(name + " bienvenid@, hoy vas a saber qué caballero dorado eres");
        System.out.println(name + " ingresa tu día de nacimiento");
        int D = leer.nextInt();

        System.out.println(name + " ingresa tu mes de nacimiento");
        int M = leer.nextInt();

        System.out.println(name + " ingresa tu año de nacimiento");
        int A = leer.nextInt();

        if ((aNioactual-A >= 18) && diaactual <= D && mesactual <= M ) {
            System.out.println(name + " eres mayor de edad");
        } else {
            System.out.println(name + " eres menor de edad");
        }
    }

    public abstract void ejecutar(Scanner sc);
}