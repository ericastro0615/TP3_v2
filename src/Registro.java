public class Registro {
    /*
    Crear una clase Registro con un método de nombre procesarDatos() que reciba una
Persona, si esta es un Trabajador muestre su nombre, edad, cobrar() y hacerAportes()
; si es un Jubilado muestre su nombre y los días que ha vivido y cobrar()
     */

    public void procesarDatos(Persona p1 ) {
        if (p1 instanceof Trabajador) {
            //
            Trabajador trabajador = (Trabajador) p1;
            System.out.println ("\n\nTrabajador : \n" +
                    "Nombre " + p1.getNombre() );
            p1.calcularEdad();
            p1.cobrar();
            trabajador.haceraportes();
        } else {
            System.out.println("\n\nJubilado : \n " +
                    "Nombre: " + p1.getNombre() );
            p1.calcularDiasVividos();
            p1.cobrar();
        }

    }

}
