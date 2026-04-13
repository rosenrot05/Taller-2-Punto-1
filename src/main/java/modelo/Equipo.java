
package modelo;

/**
 *
 * @author rosam
 */
import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String pais;
    private ArrayList<Competidor> competidores;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.competidores = new ArrayList<>();
    }

    public void agregarCompetidor(Competidor c) {
        competidores.add(c);
    }

    public String obtenerDatosEquipo() {
        StringBuilder sb = new StringBuilder();
        sb.append("---Equipo: ").append(nombre)
          .append(" | País: ").append(pais).append(" ---\n");
        for (Competidor c : competidores) {
            sb.append("  > ").append(c.obtenerDatos()).append("\n");
        }
        return sb.toString();
    }

    public String getNombre() { 
        return nombre;
    }
    
    public void setNombre(String n) { 
        this.nombre = n; 
    }
    
    public String getPais() { 
        return pais; 
    }
    
    public void setPais(String p) { 
        this.pais = p; 
    }
    
    public ArrayList<Competidor> getCompetidores() { 
        return competidores;
    }
}
