package cr.ac.ucenfotec;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
String nombre = Lectura.leerString("Ingrese el nombre del estudiante:");
        int edad = Lectura.leerEntero("Ingrese la edad:");
        double nota = Lectura.leerDouble("Ingrese la nota final:");
        char seccion = Lectura.leerChar("Ingrese la sección (A, B, C):");
        boolean becado = Lectura.leerBoolean("¿El estudiante está becado?");

        String resumen = "Datos registrados:\n" +
                         "Nombre: " + nombre + "\n" +
                         "Edad: " + edad + "\n" +
                         "Nota: " + nota + "\n" +
                         "Sección: " + seccion + "\n" +
                         "Becado: " + (becado ? "Sí" : "No");

        javax.swing.JOptionPane.showMessageDialog(null, resumen);
//        System.out.println("Hola, Mundo!");
//        int x;
//        int y, z;
//        x = 1;
//        y = 3;
//        z =  x / y * 100;
//        System.out.println("Resultado = " + z);
//        String nombre = "Mauricio ";
//        String apellido = "Zamora";
//        System.out.println(nombre + apellido);
//        System.out.println(x + y);
//        int edad1, edad2;
//        edad1 = 25;
//        edad2 = 25;
//        boolean esMayor;
//        esMayor = edad1 >= edad2;
//        System.out.println(esMayor);
//        
//        System.out.println(Math.ceil(1.2));      
//        System.out.println(Math.floor(1.2));
        
        
        
    }
    
}
