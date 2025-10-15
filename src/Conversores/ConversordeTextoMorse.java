package Conversores;
import Main.Menu;
import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

public abstract class ConversordeTextoMorse extends Menu {
    @Override
    public void ejecutar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el texto que quieres convertir a código Morse:");
        String texto = sc.nextLine().toUpperCase();


        Map<Character, String> morseMap = new HashMap<>();
        morseMap.put('A', ".-");
        morseMap.put('B', "-...");
        morseMap.put('C', "-.-.");
        morseMap.put('D', "-..");
        morseMap.put('E', ".");
        morseMap.put('F', "..-.");
        morseMap.put('G', "--.");
        morseMap.put('H', "....");
        morseMap.put('I', "..");
        morseMap.put('J', ".---");
        morseMap.put('K', "-.-");
        morseMap.put('L', ".-..");
        morseMap.put('M', "--");
        morseMap.put('N', "-.");
        morseMap.put('O', "---");
        morseMap.put('P', ".--.");
        morseMap.put('Q', "--.-");
        morseMap.put('R', ".-.");
        morseMap.put('S', "...");
        morseMap.put('T', "-");
        morseMap.put('U', "..-");
        morseMap.put('V', "...-");
        morseMap.put('W', ".--");
        morseMap.put('X', "-..-");
        morseMap.put('Y', "-.--");
        morseMap.put('Z', "--..");
        morseMap.put('0', "-----");
        morseMap.put('1', ".----");
        morseMap.put('2', "..---");
        morseMap.put('3', "...--");
        morseMap.put('4', "....-");
        morseMap.put('5', ".....");
        morseMap.put('6', "-....");
        morseMap.put('7', "--...");
        morseMap.put('8', "---..");
        morseMap.put('9', "----.");
        morseMap.put(' ', "/");


        StringBuilder morseResult = new StringBuilder();
        for (char c : texto.toCharArray()) {
            if (morseMap.containsKey(c)) {
                morseResult.append(morseMap.get(c)).append(" ");
            } else {
                morseResult.append("? ");
            }
        }

        System.out.println("Texto en Morse:");
        System.out.println(morseResult.toString().trim());


    }
}


