package cr.ac.ucenfotec;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Semana02c {
    public static void main(String[] args) {
        int x = 1;
        int y = 10;
        
        System.out.println(y);
        y =  y + 5;
        System.out.println(y);
        y += 5;
        System.out.println(y);
        
        //x = x + 1;
        //x++; //post - incremento
        //++x; //pre  - incremento
        
        if (++x == 2) {
            System.out.println("Entro en True");
        } else {
            System.out.println("Entro en False");
        }
        
        System.out.println(x);
    }
}
