import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cargaDatos = new Scanner(System.in);

        System.out.println("Ingrese el precio original.");
        Double precioOriginal =  cargaDatos.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento. Por ejemplo 10 o 15");
        Double descuento =  cargaDatos.nextDouble();

        Double precioFinal = precioOriginal - (precioOriginal * descuento / 100);
        System.out.println("Si consideramos que el descuento es del " + descuento + " por ciento, entonces el precio final con descuento es " + precioFinal + " pesos");
    }
}
