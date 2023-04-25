import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public abstract class Persona {
    private String nombre;
    private long dni;
    private String domicilio;
    private LocalDate fechaNacimiento;

    public Persona () {

    }

    public Persona(String nombre, long dni, String domicilio, LocalDate fechaNacimiento) {

        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.fechaNacimiento = fechaNacimiento;
    }

    /*
    public Persona(String nombre, long dni, String domicilio) {
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
    }
     */


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        try{
            this.nombre = nombre;
        } catch(Exception e) {
            System.out.println("Opcion inválida.");
        }
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
       try {

           this.dni = dni;
       } catch(Exception e) {
           System.out.println("Opcion inválida. Ingrese solo números y espacios ");
       }
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        try {
            this.domicilio = domicilio;
        } catch (Exception e) {
            System.out.println("Opción inválida.");
        }
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
       this.fechaNacimiento = fechaNacimiento;

    }

    public void calcularEdad () {
        //DIFERENCIA ENTRE DOS FECHAS - Period
        Period periodo = Period.between(this.fechaNacimiento, LocalDate.now());
        System.out.println("Edad: " + periodo.getYears() + " años");
    }

    //Para
    //presentar la cantidad de tiempo medida en una sola unidad de
    //tiempo, como días, puede usar el enum ChronoUnit y su método
    //between
     public void calcularDiasVividos () {
         long dias= ChronoUnit.DAYS.between(this.fechaNacimiento, LocalDate.now());
         System.out.println("los dias vividos son: "+ dias);
     }

     public abstract void cobrar();


}
