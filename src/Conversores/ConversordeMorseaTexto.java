package Conversores;
import Main.Menu;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class ConversordeMorseaTexto extends Menu {
    @Override
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);


        System.out.println("Escribe una palabra en Morse (letras separadas por espacios, palabras por ' / '):");
        String morse = sc.nextLine();

        Map<String, String> morseToText = new HashMap<>();
        morseToText.put(".-", "A");
        morseToText.put("-...", "B");
        morseToText.put("-.-.", "C");
        morseToText.put("-..", "D");
        morseToText.put(".", "E");
        morseToText.put("..-.", "F");
        morseToText.put("--.", "G");
        morseToText.put("....", "H");
        morseToText.put("..", "I");
        morseToText.put(".---", "J");
        morseToText.put("-.-", "K");
        morseToText.put(".-..", "L");
        morseToText.put("--", "M");
        morseToText.put("-.", "N");
        morseToText.put("---", "O");
        morseToText.put(".--.", "P");
        morseToText.put("--.-", "Q");
        morseToText.put(".-.", "R");
        morseToText.put("...", "S");
        morseToText.put("-", "T");
        morseToText.put("..-", "U");
        morseToText.put("...-", "V");
        morseToText.put(".--", "W");
        morseToText.put("-..-", "X");
        morseToText.put("-.--", "Y");
        morseToText.put("--..", "Z");
        morseToText.put("-----", "0");
        morseToText.put(".----", "1");
        morseToText.put("..---", "2");
        morseToText.put("...--", "3");
        morseToText.put("....-", "4");
        morseToText.put(".....", "5");
        morseToText.put("-....", "6");
        morseToText.put("--...", "7");
        morseToText.put("---..", "8");
        morseToText.put("----.", "9");

        String[] palabras = morse.trim().split(" / ");
        StringBuilder resultado = new StringBuilder();

        for (String palabra : palabras) {
            String[] letras = palabra.split(" ");
            for (String letra : letras) {
                String caracter = morseToText.get(letra);
                if (caracter != null) {
                    resultado.append(caracter);
                } else {
                    System.out.println("Código Morse inválido detectado: " + letra);
                    return;
                }
            }
            resultado.append(" ");
        }

        System.out.println("Texto traducido: " + resultado.toString().trim());
    }
}




