
import modelo.Competidor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rosam
 */
public class CompetidorTest {
    
        @Test
    public void testActualizarRanking() {
        Competidor c = new Competidor("Christian", 25, "Colombia", 10, 1.75, 70);

        c.actualizarRanking(50); // 50/10 = 5

        assertEquals(5, c.getRankingMundial());
        assertEquals(50, c.getPuntos());
    }

    @Test
    public void testObtenerDatos() {
        Competidor c = new Competidor("Ana", 20, "Peru", 8, 1.60, 55);

        String datos = c.obtenerDatos();

        assertTrue(datos.contains("Ana"));
        assertTrue(datos.contains("Peru"));
    }
}
