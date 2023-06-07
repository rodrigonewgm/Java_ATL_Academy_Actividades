import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cargaDatos = new Scanner(System.in);

        System.out.println("Ingrese las millas a convertir:");
        Double millas =  cargaDatos.nextDouble();

        Double kilometros = millas * 1.60934;
        System.out.println("Las " + millas + " millas que ha ingresado equivalen a " + kilometros + " kilometros.");
    }
}