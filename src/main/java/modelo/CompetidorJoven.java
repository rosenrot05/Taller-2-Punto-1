
package modelo;

/**
 *
 * @author rosam
 */
public class CompetidorJoven extends Competidor {
    
        private String patrocinador;
    private double potencialMejora;

    public CompetidorJoven(String nombre, int edad, String pais, int rankingMundial, double estatura, double peso,
                           String patrocinador, double potencialMejora) {
        super(nombre, edad, pais, rankingMundial, estatura, peso);
        this.patrocinador = patrocinador;
        this.potencialMejora = potencialMejora;
    }

    // Sobreescritura con super
    @Override
    public String obtenerDatos() {
        return super.obtenerDatos() +
               " | Patrocinador: " + patrocinador +
               " | Potencial: " + (potencialMejora * 100) + "%" +
               " [JOVEN]";
    }

    // Sobrecarga 1: proyeccion simple
    public int proyectarRanking(int aniosFuturos) {
        int mejora = (int)(rankingMundial * potencialMejora * aniosFuturos * 0.1);
        return Math.max(1, rankingMundial - mejora);
    }

    // Sobrecarga 2: con estructura anidada 
    public int proyectarRanking(int aniosFuturos, int competenciasAnuales) {
        int rankingProyectado = rankingMundial;
        if (potencialMejora > 0.5) {
            for (int i = 0; i < aniosFuturos; i++) {
                int mejoraPorAnio = (int)(rankingProyectado * potencialMejora * 0.1);
                if (competenciasAnuales >= 10) {
                    mejoraPorAnio += 5;
                } else if (competenciasAnuales >= 5) {
                    mejoraPorAnio += 2;
                }
                rankingProyectado = Math.max(1, rankingProyectado - mejoraPorAnio);
            }
        } else {
            rankingProyectado = proyectarRanking(aniosFuturos);
        }
        return rankingProyectado;
    }

    public String getPatrocinador() { 
        return patrocinador; 
    }
    public void setPatrocinador(String p) { 
        this.patrocinador = p; 
    }
    public double getPotencialMejora() { 
        return potencialMejora; 
    }
    public void setPotencialMejora(double p) { 
        this.potencialMejora = p; 
    }
}
