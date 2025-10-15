package Validadores;

import Main.Menu;
import java.util.Scanner;

public class ValidadordeNumeroPerfecto extends Menu {

    @Override
    public void main() {

    }

    @Override
    public void ejecutar() {
        int suma = 0;

        System.out.println("Escribe un número que quieras comprobar si es perfecto:");
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();

        for (int i = 1; i < S; i++) {
            if (S % i == 0) {
                suma += i;
            }
        }

        if (suma == S) {
            System.out.println(S + " es un número perfecto ");
        } else {
            System.out.println(S + " no es un número perfecto ");
        }


    }
} //hola