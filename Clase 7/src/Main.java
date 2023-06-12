import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //1) hacer un programa que permita al usuario ingresar 5 numeros y mostrarlos
        Scanner ingresaData = new Scanner(System.in);
        int[] numerosParaMostrar = new int[5];

        for (int contador = 0; contador < numerosParaMostrar.length; contador++) {
            System.out.println("Ingrese un numero: ");
            numerosParaMostrar[contador]= ingresaData.nextInt();
        }


        //2) mostrar el número mayor y el número menor
        int contador=0;
        int mayor = numerosParaMostrar[contador];
        int menor = numerosParaMostrar[contador];
        for (contador=0; contador< numerosParaMostrar.length;contador++){
            if (numerosParaMostrar[contador]>=mayor){
                mayor=numerosParaMostrar[contador];
            }
            if(numerosParaMostrar[contador]<=menor){
                menor=numerosParaMostrar[contador];
            }
        };
        System.out.println("numero mayor es: " + mayor);
        System.out.println("numero menor es: " + menor);


        //3) mostrar el promedio de los numeros ingresados
        double sumatoria = 0;
        for (int i = 0; i < numerosParaMostrar.length; i++) {
            sumatoria += (numerosParaMostrar[i]);
        }
        double promedio = sumatoria / numerosParaMostrar.length;
        System.out.println("el promedio de los numeros es: "+ promedio);



        /*
        for (int contador = 0; contador < numerosParaMostrar.length; contador++) {
            System.out.print(numerosParaMostrar[contador]+" ");
        }

            System.out.println("Ingrese un numero: ");
            int numerosIngresados = ingresaData.nextInt();
            numerosParaMostrar[contador]= numerosIngresados;
            contador++;
        }while (contador < numerosParaMostrar.length );

        contador=0;
        do {
            System.out.println(numerosParaMostrar[contador]);
            contador++;
        }while (contador<numerosParaMostrar.length);
        */
    }
}