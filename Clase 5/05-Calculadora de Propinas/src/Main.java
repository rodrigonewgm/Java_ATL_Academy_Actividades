import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cargaDatos = new Scanner(System.in);

        System.out.println("Ingrese el total de la cuenta a pagar");
        Double totalCuenta = cargaDatos.nextDouble();

        System.out.println("Ingrese el porcentaje de propina que desea pagar");
        Double porcentajePropina = cargaDatos.nextDouble();

        Double propina =  totalCuenta * (porcentajePropina / 100);
        System.out.println("La propina que usted tiene que dejar es " + propina + " pesos.");
    }
}
