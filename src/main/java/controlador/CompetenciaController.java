
package controlador;

/**
 *
 * @author rosam
 */
import modelo.Competencia;
import modelo.Competidor;
import modelo.Equipo;
import java.util.ArrayList;

public class CompetenciaController {
        private Competencia competencia;

    public CompetenciaController(String nombreEvento) {
        this.competencia = new Competencia(nombreEvento);
    }

    public void agregarEquipo(Equipo e) {
        competencia.agregarEquipo(e);
    }

    public String generarReporte() {
        return competencia.generarReporte();
    }

    // Sobrecarga: buscar por nombre
    public Competidor buscarCompetidor(String nombre) {
        for (Equipo eq : competencia.getEquipos()) {
            for (Competidor c : eq.getCompetidores()) {
                if (c.getNombre().equalsIgnoreCase(nombre)) return c;
            }
        }
        return null;
    }

    // Sobrecarga: buscar por ranking
    public Competidor buscarCompetidor(int rankingMundial) {
        for (Equipo eq : competencia.getEquipos()) {
            for (Competidor c : eq.getCompetidores()) {
                if (c.getRankingMundial() == rankingMundial) return c;
            }
        }
        return null;
    }

    public Competidor getMejorRanking() {
        Competidor mejor = null;
        for (Equipo eq : competencia.getEquipos()) {
            for (Competidor c : eq.getCompetidores()) {
                if (mejor == null || c.getRankingMundial() < mejor.getRankingMundial()) {
                    mejor = c;
                }
            }
        }
        return mejor;
    }

    public ArrayList<Competidor> getTodosLosCompetidores() {
        ArrayList<Competidor> todos = new ArrayList<>();
        for (Equipo eq : competencia.getEquipos()) {
            todos.addAll(eq.getCompetidores());
        }
        return todos;
    }

    public Competencia getCompetencia() {
        return competencia; 
    }
}
