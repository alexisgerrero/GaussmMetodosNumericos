package Ecuaciones_lineales;

//Módulo de datos: define la matriz aumentada [A | b] del sistema a resolver.
//Para probar otro sistema, solo se modifican los valores de esta clase.

public class defmatrizz {

    public static double[][] defmatriz() {
        return new double[][] {
                { 3.0, -0.1, -0.2,  7.85 },
                { 0.1,  7.0, -0.3, -19.3 },
                { 0.3, -0.2, 10.0,  71.4 }
        };
    }
}
