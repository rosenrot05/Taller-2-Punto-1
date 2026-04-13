

import modelo.CompetidorJoven;
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
public class CompetidorJovenTest {
    @Test
    public void testProyectarRankingSimple() {
        CompetidorJoven j = new CompetidorJoven(
            "Luis", 22, "Colombia", 20, 1.70, 60, "Nike", 0.8
        );

        int resultado = j.proyectarRanking(2);

        assertTrue(resultado < 20);
    }

    @Test
    public void testProyectarRankingComplejo() {
        CompetidorJoven j = new CompetidorJoven(
            "Luis", 22, "Colombia", 20, 1.70, 60, "Nike", 0.9
        );

        int resultado = j.proyectarRanking(2, 10);

        assertTrue(resultado < 20);
    }
}
