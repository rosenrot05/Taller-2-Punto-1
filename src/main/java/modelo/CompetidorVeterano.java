
package modelo;

/**
 *
 * @author rosam
 */
public class CompetidorVeterano extends Competidor {
        private int aniosExperiencia;
    private String categoriaVeterano;

    public CompetidorVeterano(String nombre, int edad, String pais, int rankingMundial, double estatura, double peso,
                            int aniosExperiencia, String categoriaVeterano) {
        super(nombre, edad, pais, rankingMundial, estatura, peso);
        this.aniosExperiencia = aniosExperiencia;
        this.categoriaVeterano = categoriaVeterano;
    }

    // Sobreescritura con super
    @Override
    public String obtenerDatos() {
        return super.obtenerDatos() +
               " | Experiencia: " + aniosExperiencia + " años" +
               " | Categoría: " + categoriaVeterano +
               " [VETERANO]";
    }

    // Sobrecarga 1: version simple
    public int calcularBonoRanking(int puntosObtenidos) {
        return puntosObtenidos + (aniosExperiencia * 2);
    }

    // Sobrecarga 2: version con estructura anidada
    public int calcularBonoRanking(int puntosObtenidos, int medallas) {
        int bono = puntosObtenidos;
        if (medallas > 0) {
            if (categoriaVeterano.equals("Elite")) {
                if (medallas >= 3) {
                    bono += 50;
                } else if (medallas == 2) {
                    bono += 30;
                } else {
                    bono += 15;
                }
            } else if (categoriaVeterano.equals("Senior")) {
                if (medallas >= 3) {
                    bono += 35;
                } else {
                    bono += 10;
                }
            } else {
                bono += medallas * 5;
            }
        }
        return bono + (aniosExperiencia * 2);
    }

    public int getAniosExperiencia() { 
        return aniosExperiencia; 
    }
    
    public void setAniosExperiencia(int a) { 
        this.aniosExperiencia = a;
    }
    
    public String getCategoriaVeterano() { 
        return categoriaVeterano; 
    }
    
    public void setCategoriaVeterano(String c) { 
        this.categoriaVeterano = c; 
    }
}
