public class Cuenta {
    private Persona titular;
    private double cantidad;

    public Cuenta(){
    }

    public Cuenta(Persona titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String mostrarDatosCuenta() {
        return "Cuenta{" +
                "titular=" + titular +
                ", cantidad=" + cantidad +
                '}';
    }

    public void ingresar(double cantidad){
        if (cantidad>0){
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad){
        this.cantidad -= cantidad;
    }
}
