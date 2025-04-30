/**
 * Clase encargada de la interacción con el usuario
 */
public class View {
    /**
     * Muestra la velocidad de un coche
     * @param matricula del coche
     * @param v velocidad
     * @return true si se ha mostrado correctamente
     */
    public static boolean muestraVelocidad(String matricula, Integer v){
        System.out.println(matricula + ": " + v + "km/hr");
        return true;
    }
    public static void menu(){
        System.out.println("1. Crear coche");
        System.out.println("2. Aumentar velocidad");
        System.out.println("3. Disminuir velocidad");
        System.out.println("5. Mostrar velocidad");
        System.out.println("6. Salir");
    }
}
