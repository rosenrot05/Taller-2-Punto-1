
import modelo.Equipo;
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
public class EquipoTest {
    
    @Test
    public void testAgregarCompetidor() {
        Equipo equipo = new Equipo("Colombia", "Colombia");
        Competidor c = new Competidor("Christian", 25, "Colombia", 10, 1.75, 70);

        equipo.agregarCompetidor(c);

        assertEquals(1, equipo.getCompetidores().size());
    }

    @Test
    public void testObtenerDatosEquipo() {
        Equipo equipo = new Equipo("Colombia", "Colombia");
        Competidor c = new Competidor("Christian", 25, "Colombia", 10, 1.75, 70);

        equipo.agregarCompetidor(c);

        String datos = equipo.obtenerDatosEquipo();

        assertTrue(datos.contains("Christian"));
    }
}
