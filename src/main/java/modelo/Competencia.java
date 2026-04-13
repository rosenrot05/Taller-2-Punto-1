
package modelo;

/**
 *
 * @author rosam
 */

import java.util.ArrayList;

public class Competencia {
    private String nombreEvento;
    private ArrayList<Equipo> equipos;

    public Competencia(String nombreEvento) {
        this.nombreEvento = nombreEvento;
        this.equipos = new ArrayList<>();
    }

    public void agregarEquipo(Equipo e) {
        equipos.add(e);
    }

    public String generarReporte() {
        StringBuilder sb = new StringBuilder();
        sb.append("----------------------------------------\n");
        sb.append("   REPORTE: ").append(nombreEvento).append("\n");
        sb.append("   Velodromo Alcides Nieto Patino - Cali\n");
        sb.append("----------------------------------------\n");
        for (Equipo eq : equipos) {
            sb.append(eq.obtenerDatosEquipo()).append("\n");
        }
        return sb.toString();
    }

    public String getNombreEvento() { 
        return nombreEvento; 
    }
    
    public void setNombreEvento(String n) { 
        this.nombreEvento = n;
    }
    
    public ArrayList<Equipo> getEquipos() {
        return equipos; 
    }
}
