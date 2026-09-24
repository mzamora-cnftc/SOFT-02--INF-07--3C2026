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
public class Semana02a {

    public static void main(String[] args) {
        // Esto sirve para mostrar un mensaje sencillo al usuario
        //JOptionPane.showMessageDialog(null, "Hola, mundo!");
        /*
        JOptionPane.showMessageDialog(null, "Ya casi es 15 set", "Celebración", JOptionPane.INFORMATION_MESSAGE);
         */
 /*
        Me gusta mucho programar en Java
        Se ve todo cosi!
         */
//        int respuesta = 0;
//        respuesta = JOptionPane.showConfirmDialog(null, "¿Te gusta el café?", "Selección", JOptionPane.YES_NO_OPTION);
//        System.out.println("El valor de la respuesta es " + respuesta);
//
//        if (respuesta == JOptionPane.YES_OPTION) {
//            System.out.println("Si me gusta el café, y ¿qué?");
//        } else {
//            System.out.println("Me gusta más el té");
//        }
        
        String nombre;
        nombre = JOptionPane.showInputDialog("¿Cómo se llama usted?");
        JOptionPane.showMessageDialog(null, "Yo me llamo "+nombre);
        
        
        String temporal;
        temporal = JOptionPane.showInputDialog("¿Qué edad tiene usted?");
        
        int edad = Integer.parseInt(temporal);
        System.out.println("Edad: "+edad);
        
        temporal = JOptionPane.showInputDialog("¿Cuál es su estatura en metros?");
        double estatura = Double.parseDouble(temporal);
        System.out.println("Estatura: " +estatura);
    }
}
