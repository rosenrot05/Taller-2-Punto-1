
import modelo.Competencia;
import modelo.Equipo;
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
public class CompetenciaTest {
    @Test
    public void testAgregarEquipo() {
        Competencia comp = new Competencia("Evento");
        Equipo eq = new Equipo("Colombia", "Colombia");

        comp.agregarEquipo(eq);

        assertEquals(1, comp.getEquipos().size());
    }

    @Test
    public void testGenerarReporte() {
        Competencia comp = new Competencia("Evento");
        Equipo eq = new Equipo("Colombia", "Colombia");

        comp.agregarEquipo(eq);

        String reporte = comp.generarReporte();

        assertTrue(reporte.contains("Evento"));
    }
}
