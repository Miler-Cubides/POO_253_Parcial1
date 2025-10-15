package Main;

import CaballerosdelZodiaco.ZodiacoPorFechadeNacimiento;
import Conversores.ConversordeMorseaTexto;
import Conversores.ConversordeTextoMorse;
import Validadores.Validador;
import Validadores.ValidadordeCapicua;
import Validadores.ValidadordeNumeroPerfecto;
import Validadores.ValidadordePalindromo;

import java.util.Scanner;

public abstract class Menu {
    public static void main(String[] args) throws InterruptedException


    {
        Scanner sc = new Scanner(System.in);
        int option;


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
            System.out.println("10. Salir");
            System.out.println(" elige una opcion");

            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println(" opcion 1. Zodiaco por fecha de nacimiento");
                    ZodiacoPorFechadeNacimiento z = new ZodiacoPorFechadeNacimiento() {
                        @Override
                        public void main() {

                        }
                    };
                    z.ejecutar();
                    break;

                case 2:
                    System.out.println(" opcion 2. Validador de mayoria de edad");
                    Validador v;
                    v = new Validador() {
                        @Override
                        public void ejecutar(Scanner sc) {

                        }

                        @Override
                        public void main() {

                        }
                    };
                    v.ejecutar();
                    break;
                case 3:
                    System.out.println("Opción 3. Validador número perfecto");
                    ValidadordeNumeroPerfecto validadorN = new ValidadordeNumeroPerfecto();
                    validadorN.ejecutar();
                    break;
                case 4:
                    System.out.println("Opción 4. Validador de palíndromo");
                    ValidadordePalindromo p = new ValidadordePalindromo() {
                        @Override
                        public void main() {

                        }
                    };
                    p.ejecutar();
                    break;
                case 5:
                    System.out.print(" opcion 5. Validador de capicua ");
                    ValidadordeCapicua C = new ValidadordeCapicua() {
                        @Override
                        public void main() {

                        }
                    };
                    C.ejecutar();
                    break;
                case 6:
                    System.out.print(" opcion 6. Conversor de morse a texto \n");
                    ConversordeMorseaTexto M = new ConversordeMorseaTexto() {
                        @Override
                        public void main() {

                        }
                    };
                    M.ejecutar();
                    break;
                case 7:
                    System.out.print(" opcion 7. Conversor de texto a morse \n");
                    ConversordeTextoMorse T = new ConversordeTextoMorse() {
                        @Override
                        public void main() {

                        }
                    };
                    T.ejecutar();
                    break;
                case 8:
                    System.out.print(" opcion 8. Gestor de caballeros del zodiaco");
                    GestordeCaballerosdelZodiaco();
                    break;
                case 9:
                    System.out.print(" opcion 9. Juego");
                    Juego();
                    break;
                case 10:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println(" Opción no válida, intenta de nuevo.");

            }
            System.out.println();
        } while (option != 10);
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

    public abstract void ejecutar();

    public abstract void main();

}


