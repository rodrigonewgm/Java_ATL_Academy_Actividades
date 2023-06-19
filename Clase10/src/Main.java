import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
    Ejercicio 1)
    Vamos a crear una clase llamada Persona. Sus atributos son: id, nombre, edad, fecha de nacimiento y DNI.
    Construye los siguientes métodos para la clase:
    Un constructor, donde los datos pueden estar vacíos.
    Los setters y getters para cada uno de los atributos.
    mostrar(): Muestra los datos de la persona.
    esMayorDeEdad(): Devuelve un valor lógico indicando si es mayor de edad.
     */
        Persona persona;
        Scanner leer = new Scanner(System.in);
        String id;
        String nombre;
        LocalDate fechaNacimiento;
        int edad;
        int dni;

        System.out.println("Ingrese datos el id en numeros");
        //persona.setId(leer.toString());
        id = leer.next();
        System.out.println("Ingrese datos el nombre");
        //persona.setNombre(leer.toString());
        nombre = leer.next();
        System.out.println("Ingrese datos fecha de Nacimiento con el siguiente formato yyyy/mm/dd ");
        //persona.setFechaNacimiento(leer.);
        fechaNacimiento = LocalDate.parse(leer.next());
        System.out.println("Ingrese datos edad");
        //persona.setEdad(leer.nextInt());
        edad = leer.nextInt();
        System.out.println("Ingrese dni");
        dni = leer.nextInt();

        persona = new Persona(id, nombre, fechaNacimiento, edad, dni);
        System.out.println("Los datos son: " + persona.mostrar());
        if (persona.esMayorDeEdad()){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        Cuenta cuenta1 = new Cuenta(persona,800);
    }
}