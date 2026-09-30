/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ucenfotec;

/**
 *
 * @author admin
 */
public class Semana05_Ejercicio01 {

    public static void main(String[] args) {
        int kWh = 350;
        double monto = 0;
        String etiqueta = null;
        if (kWh <= 30) {
            etiqueta = "Consumo Mínimo / Básico";
            monto = 1744.0;
        } else if (kWh <= 200) {
            etiqueta = "Consumo Moderado";
            monto = 1744.0 + (kWh-30) * 58.16;
        } else if (kWh <= 300) {
            etiqueta = "Consumo Alto";
        } else {
            etiqueta = "Consumo Excesivo";
        }
        
        System.out.println(etiqueta);
    }
}
