import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entraData = new Scanner(System.in);
        System.out.println("Por favor escriba un país");
        String paisBusqueda = entraData.nextLine();

        System.out.println("https://www.google.com/maps/search/" + paisBusqueda);
    }
}