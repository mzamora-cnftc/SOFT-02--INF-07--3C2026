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
public class Semana05_TrumpWhile {
    public static void main(String[] args) {
        int fondo = 1000;
        boolean deseaRetirar = true;
        int monto = 0;
        
        deseaRetirar = Lectura.leerBoolean("Desea retirar el fondo");
        while (deseaRetirar && fondo > 0) {            
            monto = Lectura.leerEntero("Digite el monto a retirar");
            if (fondo < monto || monto < 0) {
                JOptionPane.showMessageDialog(null, "No tiene fondos suficientes o es una cantidad negativa");
            } else {
                fondo = fondo - monto;
            }
            deseaRetirar = Lectura.leerBoolean("Desea retirar el fondo");
        }
        System.out.println("Hemos terminado");
        
    }
}
