import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entraDato = new Scanner(System.in);

        System.out.println("Voy a decirle un numero entre 1 y 100.");
        System.out.println("Escriba el numero que usted crea que le voy a mostrar y veremos si usted tiene poderes para adivinar:");

        Integer numIngresado =  entraDato.nextInt();
        Integer numDelJuego = Math.round(Math.round(Math.random()*100));
        if (numIngresado==numDelJuego){
            System.out.println("¡WOW! ¡FELICITACIONES LO ADIVINASTE!");
            System.out.println("Tu si que tienes poderes.");
        } else{
            System.out.println("No adivinaste. El numero que te iba a decir es "+ numDelJuego);
            System.out.println("Haz click en RUN para volver a jugar.");
        }

    }
}
