import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;

public class ModelTest extends TestCase {
    Coche coche;
    


    @Test
    @DisplayName("pedir coche con crearcoche")
    @AfterEach
    public void testcrearCoche() {

        Coche coche = Model.crearCoche("mazda", "1234ABC");
        assertNotNull(coche);
        assertEquals("mazda", coche.modelo);
        assertEquals("1234ABC", coche.matricula);
    }
    //Enseñar coches creados con el testcrearcoche
    @DisplayName("pedir coche")
    public void testgetCoche(){

        coche = new Coche("Modelo", "1234ABC");

    }
    @DisplayName("Cambiar velocidad")
    public void testCambiarVelocidad() {
        Model.crearCoche("Modelo", "1234ABC");
        int nuevaVelocidad = Model.cambiarVelocidad("1234ABC", 30);
        assertEquals(30, nuevaVelocidad);
    }


  
}