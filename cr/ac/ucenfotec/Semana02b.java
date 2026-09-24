/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.ucenfotec;

/**
 *
 * @author admin
 */
public class Semana02b {
    public static void main(String[] args) {
        double monto, multiplo, resultado;
        monto = 531.5;
        multiplo = 10;
        //Eduardo
        resultado = (int)((monto + multiplo - 1) / multiplo)* multiplo;
        // (int) 10.5  ->  10
        // (double) 10 -> 10.0
        // casting
        System.out.println(resultado);
        
        //Frenny
        if (monto % multiplo != 0) {
            resultado = (int)(monto/multiplo) * multiplo + multiplo;
        } else {
            resultado = monto;
        }
        System.out.println(resultado);
    }
}
