import java.time.LocalDate;

public class Persona {
    private String id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private int edad;
    private int dni;

    public Persona(){
    }

    public Persona(String id, String nombre, LocalDate fechaNacimiento, int edad, int dni) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.dni = dni;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String mostrar() {
        return
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", edad=" + edad +
                ", dni=" + dni
                ;
    }

    /*
    public void mostrar2(){
        System.out.println("id = " + id);
        System.out.println("nombre = " + nombre);
        System.out.println("fechaNacimiento = " + fechaNacimiento);
        System.out.println("edad = " + edad);
        System.out.println("dni = " + dni);
    }
    */
    public boolean esMayorDeEdad(){
        return edad >= 18;
    }
}
