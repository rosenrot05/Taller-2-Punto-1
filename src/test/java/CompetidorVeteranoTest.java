import modelo.CompetidorVeterano;
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
public class CompetidorVeteranoTest {
        @Test
    public void testCalcularBonoSimple() {
        CompetidorVeterano v = new CompetidorVeterano(
            "Carlos", 35, "Colombia", 5, 1.75, 68, 10, "Elite"
        );

        int bono = v.calcularBonoRanking(40);

        assertEquals(40 + (10 * 2), bono);
    }

    @Test
    public void testCalcularBonoComplejo() {
        CompetidorVeterano v = new CompetidorVeterano(
            "Carlos", 35, "Colombia", 5, 1.75, 68, 10, "Elite"
        );

        int bono = v.calcularBonoRanking(40, 3);

        assertTrue(bono > 40);
    }
}

