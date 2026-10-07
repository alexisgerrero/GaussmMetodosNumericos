package Ecuaciones_lineales;

public class Gauss {

    public static void eliminacionGaussiana(double[][] matriz) {
        int n = matriz.length; // Tamaño del sistema (número de filas)

        // CICLO 1 (i): Selecciona el renglón pivote actual (la diagonal principal)
        for (int i = 0; i < n; i++) {

            // Validación: un pivote en cero provocaría una división entre cero
            if (matriz[i][i] == 0) {
                throw new ArithmeticException(
                        "Pivote cero en la fila " + (i + 1) + ": se requiere pivoteo.");
            }

            // CICLO 2 (j): Recorre los renglones que están ABAJO del pivote actual
            for (int j = i + 1; j < n; j++) {

                // Factor de proporción para anular el coeficiente de esta columna
                double factor = matriz[j][i] / matriz[i][i];

                // CICLO 3 (k): Recorre COLUMNA POR COLUMNA la fila completa
                // para aplicar la operación: R_j = R_j - (factor * R_i)
                for (int k = i; k <= n; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }
        }
    }

    public static double[] sustitucionRegresiva(double[][] matriz) {
        int n = matriz.length;
        double[] x = new double[n]; // Arreglo para almacenar las respuestas

        // Recorre los renglones de ABAJO hacia ARRIBA (del último al primero)
        for (int i = n - 1; i >= 0; i--) {
            double suma = 0;

            // Suma los valores de las incógnitas ya conocidas en este renglón
            for (int j = i + 1; j < n; j++) {
                suma += matriz[i][j] * x[j];
            }

            // Despeja: (lado derecho - suma acumulada) / coeficiente del pivote
            x[i] = (matriz[i][n] - suma) / matriz[i][i];
        }

        return x;
    }
}
