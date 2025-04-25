import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;

public class ModelTest extends TestCase {
    Coche coche;
    Model parking;


    @Test
    @DisplayName("pedir coche con crearcoche")
    @AfterEach
    public void testcrearCoche() {
        Model model = new Model();
        Coche coche = model.crearCoche("mazda", "1234ABC");
        assertNotNull(coche);
        assertEquals("mazda", coche.modelo);
        assertEquals("1234ABC", coche.matricula);
    }
    //Enseñar coches creados con el testcrearcoche
    @Test
    @DisplayName("pedir coche")
    public void testgetCoche(){
       Model model=new Model();
        coche = new Coche("Modelo", "1234ABC");

    }
    @Test
    @DisplayName("Cambiar velocidad")
    public void testCambiarVelocidad() {

        Model model = new Model();
        model.crearCoche("Modelo", "1234ABC");
        int nuevaVelocidad = model.cambiarVelocidad("1234ABC", 30);
        assertEquals(30, nuevaVelocidad);
    }


  
}