import java.time.LocalDate;

public class Jubilado extends Persona{
    public Jubilado(String nombre, long dni, String domicilio, LocalDate fechaNacimiento) {
        super(nombre, dni, domicilio, fechaNacimiento);
    }

    public Jubilado() {
    }

    @Override
    public void cobrar() {
        System.out.println("cobrando mi jubilacion 💲💲 ");
    }



}
