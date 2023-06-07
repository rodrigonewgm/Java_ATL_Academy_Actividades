import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cargaDatos = new Scanner(System.in);

        System.out.println("Ingrese cuantos anios tiene de su perro");
        Integer edadPerruna =  cargaDatos.nextInt();

        Integer edadHumana = edadPerruna * 7;
        System.out.println("Su perro tiene " + edadHumana + " anios humanos.");

    }
}
