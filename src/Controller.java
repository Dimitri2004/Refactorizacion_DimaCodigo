import java.lang.module.ModuleDescriptor;

public class Controller {
    public static void main(String[] args) {
       // Instanciamos la vista y el modelo


        // Crear tres coches
//        Model.crearCoche("LaFerrari", "SBC 1234");
//        Model.crearCoche("Alpine", "HYU 4567");
//        Model.crearCoche("Aston Martin", "FGH 3333");


        // modifica la velocidad
        int nuevaVelocidad = Model.cambiarVelocidad("SBC 1234", 30);

        // recoje la velocidad y la muestra (tarea de la View)
        boolean hecho = View.muestraVelocidad("SBC 1234", Model.getVelocidad("SBC 1234"));

        // Aplicar el aumento de velociadad
        int aumento = 20;
        int velocidadAumentada = Model.aumentarVelocidad("SBC 1234", aumento);
        // Mostrar la velocidad aumentada
        hecho = View.muestraVelocidad("SBC 1234", Model.aumentarVelocidad( "SBC 1234", 20));
        // Mostrar la velocidad disminuida
        hecho = View.muestraVelocidad("SBC 1234", Model.reducirVelocidad("SBC 1234", 10));

        //Mostrar si el coche tiene velocidad negativa

        Coche ferrari =        Model.crearCoche( "Ferrari", "SBC 1234");
        // Cambiar la velocidad a 5
        ferrari.velocidad = 5;
        Model.cambiarVelocidad("SBC 1234", 5);
        // hacer  la velocidad es negativa
        int reducir = 10;
        // reducir la velocidad
        nuevaVelocidad= Model.reducirVelocidad("SBC 1234", reducir);
        // si la velocidad es negativa
        if (Model.reducirVelocidad(ferrari.matricula,nuevaVelocidad)<0){
            System.out.println(nuevaVelocidad);
        }else{
            System.out.println(nuevaVelocidad);
        }

    }
}