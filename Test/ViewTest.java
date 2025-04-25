import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class ViewTest extends TestCase {

    @Test
    @DisplayName("Test de comprobar la velocidad")
    public void testMuestraVelocidad() {
        View view = new View();
        String matricula = "1234ABC";
        Integer velocidad = 100;
        boolean resultado = view.muestraVelocidad(matricula, velocidad);
        assertTrue(resultado);
    }
    @Test
    @DisplayName("Subir velocidad")
    public void testsubirVelocidad(){

    }

}