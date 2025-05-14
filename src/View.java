import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase encargada de la interacción con el usuario
 */
public class View {
    /**
     * Menu inicial que dependiendo de la opción acceda a mecanicas del Controller
     */
    public static void menu() {
        System.out.println("1.mostrar coches parking con velocidad");
        System.out.println("2.Mostrar velocidad");
        System.out.println("3.Cambiar velocidad");
        System.out.println("4.Salir");

        Scanner sc = new Scanner(System.in);
        System.out.println("Elige opcion");
        int op = sc.nextInt();

        //repetir menu hasta que el usuario elija salir
        while (op != 4) {
            switch (op) {
                case 1:
                     Model.parking= new ArrayList<>();
                     Controller2.Inicio();
                    for (Coche e : Model.parking) {
                        // Mostrar la velocidad de cada coche
                        System.out.println(e.matricula + ": " + e.velocidad + "km/hr");
                    }
                    // Mostrar la velocidad de cada coche
                    break;

                case 2:
                    Controller2.Inicio();
                    int velocidad=Model.getVelocidad(Model.parking.toString());

                    break;
                case 3:
                    System.out.println("Introduce la velocidad a aumentar(1) o reducir(2)");
                    int op2 = sc.nextInt();
                    if (  op2 == 1) {
                        // Aumentar la velocidad
                        int v1= Model.getVelocidad(Model.parking.getFirst().matricula);
                        // Cambiar la velocidad
                        Controller2.aumentarVel();

                    } else if ( op2 == 2) {
                        // Disminuir la velocidad
                        Controller2.disminuirVel();
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");

            }
            System.out.println("Elige opcion");
            op = sc.nextInt();

        }
        System.out.println("Saliendo...");
        sc.close();

    }
    /*
    public static boolean muestraVelocidad(String matricula, Integer v){
        System.out.println(matricula + ": " + v + "km/hr");
        return true;
    }
     */
}
