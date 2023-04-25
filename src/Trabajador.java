import java.time.LocalDate;

public class Trabajador extends Persona implements Activo {

    private double sueldo;

    public Trabajador() {
    }

    public Trabajador(String nombre, long dni, String domicilio, LocalDate fechaNacimiento, double sueldo) {
        super(nombre, dni, domicilio, fechaNacimiento);
        this.sueldo = sueldo;
    }

    @Override
    public void cobrar() {
        System.out.println("el monto a cobrar es: $"+ getSueldo());
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public void haceraportes() {

    }
}
