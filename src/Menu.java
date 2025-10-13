
import java.util.Scanner;

public class Menu{
    public static void Menu(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;

        int opcion = 0;
        do {
            System.out.println(" MENU PRINCIPAL ");
            System.out.println(" 1. Zodiaco por fecha de nacimiento");
            System.out.println(" 2. Validador de mayoria de edad ");
            System.out.println(" 3. Validador numero perfecto ");
            System.out.println(" 4. Validador de palindromo ");
            System.out.println(" 5. Validador de capicua ");
            System.out.println(" 6. Conversor de morse a texto ");
            System.out.println(" 7. Conversor de texto a morse ");
            System.out.println(" 8. Gestor de caballeros del zodiaco");
            System.out.println(" 9. Juego");
            System.out.println(" elige una opcion");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print(" opcion 1. Zodiaco por fecha de nacimiento");
                    ZodiacoPorFechadeNacimiento();
                    break;
                case 2:
                    System.out.print(" opcion 2. Validador de mayoria de edad");
                    ValidadordeMayoriadeEdad();
                    break;
                case 3:
                    System.out.print(" opcion 3. Validador numero perfecto");
                    ValidadorNumeroPerfecto();
                    break;
                case 4:
                    System.out.print(" opcion 4. Validador de palindromo");
                    ValidadordePalindromo();
                    break;
                case 5:
                    System.out.print(" opcion 5. Validador de capicua ");
                    ValidadordeCapicua();
                    break;
                case 6:
                    System.out.print(" opcion 6. Conversor de morse a texto ");
                    ConversordeMorseaTexto();
                    break;
                case 7:
                    System.out.print(" opcion 7. Conversor de texto a morse ");
                    ConversordeTextoaMorse();
                    break;
                case 8:
                    System.out.print(" opcion 8. Gestor de caballeros del zodiaco");
                    GestordeCaballerosdelZodiaco();
                    break;
                case 9:
                    System.out.print(" opcion 9. Juego");
                    Juego();
                    break;
                default:
                    System.out.println(" Opción no válida, intenta de nuevo.");

            }
            System.out.println();
        } while (opcion != 10);
        sc.close();
    }

    private static void ZodiacoPorFechadeNacimiento() {
    }

    private static void ValidadordeMayoriadeEdad() {
    }

    private static void ValidadorNumeroPerfecto() {
    }

    private static void ValidadordePalindromo() {
    }

    private static void ValidadordeCapicua() {
    }

    private static void ConversordeTextoaMorse() {

    }

    private static void ConversordeMorseaTexto() {

    }

    private static void GestordeCaballerosdelZodiaco() {

    }

    private static void Juego() {

    }
}
