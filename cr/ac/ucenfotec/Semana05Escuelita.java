/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ucenfotec;

import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Semana05Escuelita {
    public static void main(String[] args) {
        int n, ausentes = 0, presentes = 0;
        double porAsusentes, porPresentes;
        boolean estaPresente;
        String salida = "";
        
        n = Lectura.leerEntero("Digite la cantidad de estudiantes");
        for (int i = 0; i < n; i++) {
            estaPresente = Lectura.leerBoolean(String.format("Digite si esta presente el estudiante %d", i+1));
            if (estaPresente) {
                presentes++;
            } else {
                ausentes++;
            }
        }
        
        porPresentes = presentes * 100 / (presentes + ausentes);
        porAsusentes = ausentes * 100 / (presentes + ausentes);
        
        
        
        if (porPresentes >= 80) {
            salida = String.format("Presentes: %6.2f\nAusentes:  %6.2f\nAsistencia Satisfactoria", porPresentes, porAsusentes);
        } else {
            salida = String.format("Presentes: %6.2f\nAusentes:  %6.2f\n", porPresentes, porAsusentes);
        }
        
        JOptionPane.showMessageDialog(null, salida);
    }
}
