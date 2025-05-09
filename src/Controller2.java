import java.util.ArrayList;
import java.util.Scanner;

public class Controller2 {

    public static void  Inicio() {
        Model.parking  = new ArrayList<>();

        Model.crearCoche( "LaFerrari", "SBC 1234");
        Model.crearCoche( "Alpine", "HYU 4567");
        Model.crearCoche( "Aston Martin", "FGH 3333");
        Model.crearCoche( "Lamborghini", "JKL 1234");

    }
    public static void visualizarVelocida() {
        // Mostrar la velocidad del coche1
        String matricula = Model.parking.getFirst().matricula;
        int velocidad = Model.getVelocidad(matricula);
        View.muestraVelocidad(matricula, velocidad);


    }
        public static void aumentarVel() {
        // Aumentar la velocidad del coche1
        String matricula = Model.parking.getFirst().matricula;
        int aumento = 20;
        int velocidadAumentada = Model.aumentarVelocidad(matricula, aumento);
        View.muestraVelocidad(matricula, velocidadAumentada);

        }
    public static void disminuirVel() {
        // Disminuir la velocidad del coche1
        String matricula = Model.parking.getFirst().matricula;
        int reducir = 10;
        int velocidadDisminuida = Model.reducirVelocidad(matricula, reducir);
        View.muestraVelocidad(matricula, velocidadDisminuida);
    }
    public static void mostrarCoches() {
        // Mostrar los coches del parking
        for (Coche coche : Model.parking) {
            System.out.println("Modelo: " + coche.modelo);
            System.out.println("Matricula: " + coche.matricula);
            System.out.println("Velocidad: " + coche.velocidad);
            System.out.println("-------------------------");
        }
    }




}
