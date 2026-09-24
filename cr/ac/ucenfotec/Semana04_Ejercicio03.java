package cr.ac.ucenfotec;

/**
 *
 * @author admin
 */
public class Semana04_Ejercicio03 {
    public static void main(String[] args) {
        int dinero = 1000;
        boolean hayQueMadrugar = true;
        
        if (dinero > 0) {
            System.out.println("Saliamos a comer");
            if (hayQueMadrugar) {
                System.out.println("Solo comida conocida");
            } else {
                System.out.println("Nos aventuramos con nueva comida");
            }
        } else {
            System.out.println("Nos quedamos en la casa a ver TV");
            if (hayQueMadrugar) {
                System.out.println("Solo comida de la casa");
            } else {
                System.out.println("Pedimos alguna promo en Uber");
            }
        }
    }
}
