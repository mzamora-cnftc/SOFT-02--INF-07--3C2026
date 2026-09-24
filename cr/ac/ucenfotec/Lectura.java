package cr.ac.ucenfotec;

import javax.swing.JOptionPane;

public class Lectura {

    /**
     * Lee un texto y valida que no esté vacío
     * @param mensaje Texto presentado al usuario
     * @return Texto solicitado
     */
    public static String leerString(String mensaje) {
        while (true) {
            String entrada = JOptionPane.showInputDialog(null, mensaje, "Entrada de Texto", JOptionPane.QUESTION_MESSAGE);
            if (entrada != null && !entrada.trim().isEmpty()) {
                return entrada.trim();
            }
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un texto válido (no puede estar vacío).", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Lee un entero y valida la conversión numérica
     * @param mensaje Texto presentado al usuario
     * @return Número entero solicitado
     */
    public static int leerEntero(String mensaje) {
        while (true) {
            String entrada = JOptionPane.showInputDialog(null, mensaje, "Entrada de Entero", JOptionPane.QUESTION_MESSAGE);
            if (entrada != null) {
                try {
                    return Integer.parseInt(entrada.trim());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número entero válido.", "Error de Tipo", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error: Debe ingresar un valor para continuar.", "Atención", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    /**
     * Lee un valor con decimales y valida la conversión numérica
     * @param mensaje Texto presentado al usuario
     * @return Número doble solicitado
     */
    public static double leerDouble(String mensaje) {
        while (true) {
            String entrada = JOptionPane.showInputDialog(null, mensaje, "Entrada de Decimal", JOptionPane.QUESTION_MESSAGE);
            if (entrada != null) {
                try {
                    return Double.parseDouble(entrada.trim());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número decimal válido (ej. 15.5).", "Error de Tipo", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error: Debe ingresar un valor para continuar.", "Atención", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    /**
     * Lee un único carácter
     * @param mensaje Texto presentado al usuario
     * @return Carácter solicitado
     */
    public static char leerChar(String mensaje) {
        while (true) {
            String entrada = JOptionPane.showInputDialog(null, mensaje, "Entrada de Carácter", JOptionPane.QUESTION_MESSAGE);
            if (entrada != null && entrada.trim().length() == 1) {
                return entrada.trim().charAt(0);
            }
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar exactamente un carácter.", "Error de Entrada", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Retorna true si presiona "Sí" y false si presiona "No" usando showOptionDialog
     * @param mensaje Texto presentado al usuario
     * @return Devuelve un booleano
     */
    public static boolean leerBoolean(String mensaje) {
        String[] opciones = {"Sí", "No"};
        while (true) {
            int seleccion = JOptionPane.showOptionDialog(
                null,
                mensaje,
                "Selección de Opción",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
            );

            if (seleccion == 0) {
                return true;  // Opción "Sí"
            } else if (seleccion == 1) {
                return false; // Opción "No"
            }

            // Si el usuario cierra la ventana con la "X"
            JOptionPane.showMessageDialog(null, "Error: Debe seleccionar una de las opciones.", "Atención", JOptionPane.WARNING_MESSAGE);
        }
    }
}
