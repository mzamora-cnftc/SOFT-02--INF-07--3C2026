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
public class Semana05_Alcancia {

    public static void main(String[] args) {
        double saldo = 0, dinero = 0;
        int opcion = 0;
        String menu = "MENU\n1. Ver Saldo\n2. Depositar\n3. Retirar\n0. Salir";
        boolean esError = false;

        do {
            opcion = Lectura.leerEntero(menu);
            switch (opcion) {
                case 0:
                    System.out.println("Hasta la vista, baby!");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, String.format("Saldo %.2f", saldo));
                    break;
                case 2:
                    dinero = Lectura.leerDouble("Digite la cantidad de dinero a depositar");
                    saldo = saldo + dinero;
                    break;
                case 3:
                    esError = false;
                    do {
                        if (esError) {
                            JOptionPane.showMessageDialog(null, "Fondos insuficientes");
                        }
                        dinero = Lectura.leerDouble("Digite la cantidad de dinero a retirar");
                        esError = true;
                        
                    } while (dinero > saldo);

                    saldo = saldo - dinero;

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while ((opcion != 0));
    }
}
