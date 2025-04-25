import java.lang.module.ModuleDescriptor;

public class Controller {
    public static void main(String[] args) {
     /*   // Instanciamos la vista y el modelo
        View miView = new View();
        Model miModel = new Model();

        // Crear tres coches
        miModel.crearCoche("LaFerrari", "SBC 1234");
        miModel.crearCoche("Alpine", "HYU 4567");
        miModel.crearCoche("Aston Martin", "FGH 3333");


        // modifica la velocidad
        int nuevaVelocidad = miModel.cambiarVelocidad("SBC 1234", 30);

        // recoje la velocidad y la muestra (tarea de la View)
        boolean hecho = miView.muestraVelocidad("SBC 1234", miModel.getVelocidad("SBC 1234"));

        // Aplicar el aumento de velociadad
        int aumento = 20;
        int velocidadAumentada = miModel.aumentarVelocidad("SBC 1234", aumento);
        // Mostrar la velocidad aumentada
        hecho = miView.muestraVelocidad("SBC 1234", velocidadAumentada);

        // Mostrar la velocidad disminuida
        hecho = miView.muestraVelocidad("SBC 1234", velocidadDisminuida);
*/
        //Mostrar si el coche tiene velocidad negativa
        Model miModel = new Model();
        Coche ferrari =        miModel.crearCoche( "Ferrari", "SBC 1234");
        // Cambiar la velocidad a 5
        ferrari.velocidad = 5;
        int nuevaVelocidad = miModel.cambiarVelocidad("SBC 1234", 5);
        // hacer  la velocidad es negativa
        int reducir = 10;
        // reducir la velocidad
        nuevaVelocidad= miModel.reducirVelocidad("SBC 1234", reducir);
        // si la velocidad es negativa
        if (miModel.reducirVelocidad(ferrari.matricula,nuevaVelocidad)<0){
            System.out.println(nuevaVelocidad);
        }else{
            System.out.println(nuevaVelocidad);
        }

    }
}