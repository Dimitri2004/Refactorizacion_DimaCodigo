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
                    // Mostrar coches del parking
                    Controller2.mostrarCoches();
                    // Mostrar la velocidad de los coches
                    Controller2.visualizarVelocida();
                    break;

                case 2:
                    // Mostrar velocidad de la opcion anterior
                    // Mostrar la velocidad de los coche1
                    String matricula = Model.parking.getFirst().matricula;
                    Controller2.visualizarVelocida();
                    break;
                case 3:
                    System.out.println("Introduce la velocidad a aumentar(1) o reducir(2)");
                    int op2 = sc.nextInt();
                    if (  op2 == 1) {
                        int velocidad = sc.nextInt();
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
    public static boolean muestraVelocidad(String matricula, Integer v){
        System.out.println(matricula + ": " + v + "km/hr");
        return true;
    }
}
