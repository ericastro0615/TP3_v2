import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test {

    /*
    a) Crear una Instancia de Registro.
b) Crear una instancia de Trabajador.
c) Crear una instancia de Jubilado.
d) invocar del registro el método procesarDatos 2 veces, una con el trabajador y
otra con el Jubilado creados en los items anteriores.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

         Registro r1 = new Registro();

         Jubilado j1 = new Jubilado();

        System.out.println("***** JUBILADO ***** ");
        System.out.println("ingrese el nombre del jubilado : ");
        j1.setNombre(sc.nextLine());
        System.out.println("ingrese el dni ");
        j1.setDni(sc.nextLong());
        System.out.println("ingrese el domicilio ");
        j1.setDomicilio(sc.next());
        j1.setFechaNacimiento(parsearFechaNacimiento( ) );
        r1.procesarDatos(j1);




        Trabajador t1 = new Trabajador();

        System.out.println("\n\n ***** TRABAJADOR *****\n");
        System.out.println("ingrese el nombre del trabajador : ");
        t1.setNombre(sc.next());
        System.out.println("ingrese el dni ");
        t1.setDni(sc.nextLong());
        System.out.println("ingrese el domicilio ");
        t1.setDomicilio(sc.next());
        t1.setFechaNacimiento(parsearFechaNacimiento( ) );
        System.out.println("ingrese el monto de su sueldo. Sólo números");
        t1.setSueldo(sc.nextDouble());
        r1.procesarDatos(t1);

    }






    public static LocalDate parsearFechaNacimiento() {
        LocalDate fechaNacimiento = null;
        boolean fechaValida = false;

        while (!fechaValida) {
            try {

                Scanner sc = new Scanner(System.in).useDelimiter("\n");
                System.out.println("Ingrese la fecha con el siguiente formato dd/MM/yyyy (sólo números y '/' )");
                String fechaNac = sc.nextLine();
                DateTimeFormatter formaFechaNacimiento = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                fechaNacimiento = LocalDate.parse(fechaNac, formaFechaNacimiento);
                fechaValida = true;

            } catch (Exception e) {
                System.out.println("Fecha inválida. Por favor, ingrese la fecha con el formato yyyy//MM/dd.");
            }
        }

        return fechaNacimiento;
    }




}




