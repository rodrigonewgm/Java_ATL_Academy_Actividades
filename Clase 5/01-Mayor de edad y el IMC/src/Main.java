import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner cargaDatos = new Scanner(System.in);

        //IMC = peso (kg) / (altura (m))^2

        System.out.println("Ingrese su peso en Kg sin usar decimales:");
        double peso = cargaDatos.nextDouble();

        System.out.println("Ingrese su altura en metros, use la coma para los decimales, no use el punto:");
        double altura = cargaDatos.nextDouble();


        double indiceMasaCorporal = peso/(altura * altura);
        System.out.printf("Tu indice de masa corporal es:  %.2f", indiceMasaCorporal);

        // Mayor a 30 -> Obesidad
        if (indiceMasaCorporal >= 30 ){
            System.out.println(". Estas en obesidad, es poco saludable que tengas este peso.");
        }
        //Entre 25 y 30 -> Obesidad
        if (indiceMasaCorporal >= 25 && indiceMasaCorporal<30){
            System.out.println(". Estas en sobrepeso, no es grave para decir que es obesidad pero tampoco podemos decir que es el peso ideal.");
        }
        // Entre  a 18.5 y 25 -> Obesidad
        if (indiceMasaCorporal >= 18.5 && indiceMasaCorporal<25){
            System.out.println(". Estas en un peso normal e ideal para una buena salud.");
        }
        // Menor a 18.5 -> Obesidad
        if (indiceMasaCorporal < 18.5 ){
            System.out.println(". Estas por debajo del peso normal, no es grave pero no seria un peso ideal");
        }


        /*System.out.println( );
        Scanner cargaDeDatos = new Scanner(System.in);
        Integer edad = cargaDeDatos.nextInt();


        if(edad>=18){
            System.out.println("Es mayor de edad");
        } else{
            System.out.println("Es menor de edad");
        }*/
    }
}
