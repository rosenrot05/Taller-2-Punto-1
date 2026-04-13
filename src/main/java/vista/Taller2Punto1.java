/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vista;

/**
 *
 * @author rosam
 */

import controlador.CompetenciaController;
import modelo.Competidor;
import modelo.CompetidorJoven;
import modelo.CompetidorVeterano;
import modelo.Equipo;

public class Taller2Punto1 {
        public static void main(String[] args) {
        System.out.println("--- MUNDIAL DE CICLISMO DE PISTA - CALI ---\n");

        CompetenciaController controller =
            new CompetenciaController("Mundial de Ciclismo de Pista 2025");

        // Equipo Colombia
        Equipo colombia = new Equipo("Team Colombia", "Colombia");
        CompetidorVeterano v1 = new CompetidorVeterano(
            "Carlos Ramirez", 35, "Colombia", 5, 1.75, 68.0, 12, "Elite");
        CompetidorJoven j1 = new CompetidorJoven(
            "Sebastian Torres", 22, "Colombia", 15, 1.78, 65.0, "Coldeportes", 0.85);
        colombia.agregarCompetidor(v1);
        colombia.agregarCompetidor(j1);

        // Equipo Francia
        Equipo francia = new Equipo("Team France", "Francia");
        CompetidorVeterano v2 = new CompetidorVeterano(
            "Pierre Dupont", 32, "Francia", 3, 1.80, 72.0, 10, "Senior");
        CompetidorJoven j2 = new CompetidorJoven(
            "Lucas Martin", 24, "Francia", 8, 1.77, 67.0, "FDJ Cycling", 0.75);
        francia.agregarCompetidor(v2);
        francia.agregarCompetidor(j2);

        controller.agregarEquipo(colombia);
        controller.agregarEquipo(francia);

        // Polimorfismo: obtenerDatos
        System.out.println("--- POLIMORFISMO (sobreescritura de obtenerDatos) ---");
        for (Competidor c : controller.getTodosLosCompetidores()) {
            System.out.println(c.obtenerDatos());
        }

        // Sobrecarga calcularBonoRanking
        System.out.println("\n--- SOBRECARGA: calcularBonoRanking ---");
        System.out.println("Bono simple:        " + v1.calcularBonoRanking(40));
        System.out.println("Bono con medallas:  " + v1.calcularBonoRanking(40, 3));

        // Sobrecarga proyectarRanking
        System.out.println("\n--- SOBRECARGA: proyectarRanking ---");
        System.out.println("Proyección simple:     " + j1.proyectarRanking(3));
        System.out.println("Proyección + compet.:  " + j1.proyectarRanking(3, 12));

        // actualizarRanking
        System.out.println("\n--- ACTUALIZAR RANKING ---");
        System.out.println("Ranking antes:   " + v1.getRankingMundial());
        v1.actualizarRanking(50);
        System.out.println("Ranking después: " + v1.getRankingMundial());

        // Busqueda sobrecargada
        System.out.println("\n--- BuSQUEDA SOBRECARGADA ---");
        Competidor porNombre  = controller.buscarCompetidor("Lucas Martin");
        Competidor porRanking = controller.buscarCompetidor(3);
        System.out.println("Por nombre:  " + (porNombre  != null ? porNombre.getNombre()  : "No encontrado"));
        System.out.println("Por ranking: " + (porRanking != null ? porRanking.getNombre() : "No encontrado"));

        // Mejor ranking
        Competidor mejor = controller.getMejorRanking();
        System.out.println("\nMejor ranking: " + mejor.getNombre() + " - #" + mejor.getRankingMundial());

        // Reporte general
        System.out.println("\n" + controller.generarReporte());
    }
}


