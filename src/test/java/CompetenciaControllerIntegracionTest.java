
import controlador.CompetenciaController;
import modelo.*;
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
public class CompetenciaControllerIntegracionTest {
    @Test
    public void testFlujoCompleto() {

        CompetenciaController controller =
            new CompetenciaController("Mundial");

        Equipo eq = new Equipo("Colombia", "Colombia");

        Competidor c1 = new Competidor("Christian", 25, "Colombia", 10, 1.75, 70);
        Competidor c2 = new Competidor("Pedro", 30, "Colombia", 5, 1.80, 75);

        eq.agregarCompetidor(c1);
        eq.agregarCompetidor(c2);

        controller.agregarEquipo(eq);

        // Buscar por nombre
        Competidor encontrado = controller.buscarCompetidor("Juan");
        assertNotNull(encontrado);

        // Buscar por ranking
        Competidor encontrado2 = controller.buscarCompetidor(5);
        assertNotNull(encontrado2);

        // Mejor ranking
        Competidor mejor = controller.getMejorRanking();
        assertEquals(5, mejor.getRankingMundial());

        // Todos los competidores
        assertEquals(2, controller.getTodosLosCompetidores().size());

        // Reporte
        String reporte = controller.generarReporte();
        assertTrue(reporte.contains("Mundial"));
    }
}
