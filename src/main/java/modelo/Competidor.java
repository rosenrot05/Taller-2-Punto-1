
package modelo;

/**
 *
 * @author rosam
 */
public class Competidor {
    
    protected String nombre;
    protected int edad;
    protected String pais;
    protected int rankingMundial;
    protected double estatura;
    protected double peso;
    protected int puntos;

    public Competidor(String nombre, int edad, String pais, int rankingMundial, double estatura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.pais = pais;
        this.rankingMundial = rankingMundial;
        this.estatura = estatura;
        this.peso = peso;
        this.puntos = 0;
    }

    public void actualizarRanking(int puntosObtenidos) {
        this.puntos += puntosObtenidos;
        this.rankingMundial = Math.max(1, rankingMundial - (puntosObtenidos / 10));
    }

    public String obtenerDatos() {
        return "Nombre: " + nombre +
               " | Edad: " + edad +
               " | Pais: " + pais +
               " | Ranking: " + rankingMundial +
               " | Estatura: " + estatura + "m" +
               " | Peso: " + peso + "kg" +
               " | Puntos: " + puntos;
    }

    public String getNombre() { 
        return nombre; 
    }
    
    public void setNombre(String n) { 
        this.nombre = n; 
    }
    
    public int getEdad() { 
        return edad; 
    }
    
    public void setEdad(int e) { 
        this.edad = e; 
    }
    
    public String getPais() { 
        return pais; 
    }
    
    public void setPais(String p) { 
        this.pais = p; 
    }
    
    public int getRankingMundial() { 
        return rankingMundial; 
    }
    
    public void setRankingMundial(int r) { 
        this.rankingMundial = r; 
    }
    
    public double getEstatura() { 
        return estatura; 
    }
    
    public void setEstatura(double e) { 
        this.estatura = e; 
    }
    
    public double getPeso() { 
        return peso; 
    }
    
    public void setPeso(double p) { 
        this.peso = p; 
    }
    
    public int getPuntos() { 
        return puntos; 
    }
    
    public void setPuntos(int p) { 
        this.puntos = p; 
    }
}
