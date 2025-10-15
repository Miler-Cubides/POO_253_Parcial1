package Validadores;
import Main.Menu;

import java.util.Scanner;

public abstract class ValidadordeCapicua extends Menu {
    @Override
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número:");
        int numero = sc.nextInt();


        String numeroTexto = String.valueOf(numero);
        String invertido = "";


        for (int i = numeroTexto.length() - 1; i >= 0; i--) {
            invertido += numeroTexto.charAt(i);
        }


        if (numeroTexto.equals(invertido)) {
            System.out.println(numero + " es un número capicúa");
        } else {
            System.out.println(numero + " no es un número capicúa");
        }


    }

}