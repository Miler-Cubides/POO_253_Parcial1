package CaballerosdelZodiaco;

import Main.Menu;

import java.util.Scanner;

public abstract class ZodiacoPorFechadeNacimiento extends Menu {
    @Override
    public void ejecutar() {

        Scanner leer = new Scanner(System.in);
        System.out.println("Cómo es tu nombre?");

        String name = leer.nextLine();

        System.out.println(name+" bienvenid@, hoy vas a saber qué caballero dorado eres");
        System.out.println(name+" ingresa tu día de nacimiento");

        int D = leer.nextInt();


        System.out.println(name+" ingresa tu mes de nacimiento");

        int M = leer.nextInt();


        System.out.println(name+" ingresa tu año de nacimiento");
        int A = leer.nextInt();




        if(D>=20 && M==1){
            System.out.println(name+" eres Camus de Acuario");
        }
        if(D<=18 && M==2){
            System.out.println(name+" eres Camus de Acuario");
        }
        if(D>=19 && M==2){
            System.out.println(name+" eres Afrodita de Piscis");
        }
        if(D<=20 && M==3){
            System.out.println(name+" eres Afrodita de Piscis");
        }
        if(D>=21 && M==3){
            System.out.println(name+" eres Mu de aries");
        }
        if(D<=19 && M==4){
            System.out.println(name+" eres Mu de aries");
        }
        if(D>=20 && M==4){
            System.out.println(name+" eres Aldebaran de Tauro");
        }
        if(D<=20 && M==5){
            System.out.println(name+" eres Aldebaran de Tauro");
        }
        if(D>=21 && M==5){
            System.out.println(name+" eres Saga de Geminis");
        }
        if(D<=20 && M==6){
            System.out.println(name+" eres Saga de Geminis");
        }
        if(D>=21 && M==6){
            System.out.println(name+" eres Mascara de la Muerte de Cancer");
        }
        if(D<=22 && M==7){
            System.out.println(name+" eres Mascara de la Muerte de Cancer");
        }
        if(D>=23 && M==7){
            System.out.println(name+" eres Aiora de Leo");
        }
        if(D<=22 && M==8){
            System.out.println(name+" eres Aiora de Leo");
        }
        if(D>=23 && M==8){
            System.out.println(name+" eres Shaka de Virgo");
        }
        if(D<=22 && M==9){
            System.out.println(name+" eres Shaka de Virgo");
        }
        if(D>=23 && M==9){
            System.out.println(name+" eres Donko de Libra");
        }
        if(D<=22 && M==10){
            System.out.println(name+" eres Donko de Libra");
        }
        if(D>=23 && M==10){
            System.out.println(name+" eres Milo de Escorpio");
        }
        if(D<=21 && M==11){
            System.out.println(name+" eres Milo de Escorpio");
        }
        if(D>=22 && M==11){
            System.out.println(name+" eres Aioros de Sagitario");
        }
        if(D<=21 && M==12){
            System.out.println(name+" eres Aioros de Sagitario");
        }
        if(D>=22 && M==12){
            System.out.println(name+" eres Shura de Capricornio");
        }
        if(D<=19 && M==1){
            System.out.println(name+" eres Shura de Capricornio");
        }
    }

    public abstract void main();
}