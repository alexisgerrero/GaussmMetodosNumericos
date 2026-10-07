package Ecuaciones_lineales;

public class Lanzador_gaus {
    public static void main(String[] args) {
        // 1. Obtener la matriz aumentada [A | b]
        double[][] matriz = defmatrizz.defmatriz();

        try {
            // 2. Eliminación gaussiana (triangulación superior):
            //    convierte en ceros los elementos debajo de la diagonal principal.
            Gauss.eliminacionGaussiana(matriz);

            // 3. Sustitución regresiva: despeja las incógnitas de abajo hacia arriba.
            double[] soluciones = Gauss.sustitucionRegresiva(matriz);

            // 4. Imprimir resultados finales en consola
            System.out.println("Soluciones del sistema:");
            for (int i = 0; i < soluciones.length; i++) {
                System.out.println("x" + (i + 1) + " = " + soluciones[i]);
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
