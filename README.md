# Práctica: Método de Gauss

SCC-1017 Métodos Numéricos – Unidad 3 – ITS Xalapa.

## Lenguaje de programación
Java (JDK 17 o superior).

## Estructura modular
| Archivo | Función |
|---|---|
| `defmatrizz.java` | Datos: define la matriz aumentada `[A \| b]` |
| `Gauss.java` | Lógica: eliminación gaussiana y sustitución regresiva |
| `Lanzador_gaus.java` | Clase principal (`main`) |

## Compilar y ejecutar
Desde la carpeta raíz del repositorio:

```bash
javac -d out src/Ecuaciones_lineales/*.java
java -cp out Ecuaciones_lineales.Lanzador_gaus
```

En IntelliJ IDEA: abrir el proyecto, marcar `src` como *Sources Root* y ejecutar `Lanzador_gaus` con ▶.

## Ejemplo de prueba
Sistema:

```
3.0x1 - 0.1x2 - 0.2x3 =   7.85
0.1x1 + 7.0x2 - 0.3x3 = -19.3
0.3x1 - 0.2x2 + 10x3  =  71.4
```

Salida por consola:

```
Soluciones del sistema:
x1 = 3.0
x2 = -2.5
x3 = 7.000000000000002
```

(Solución exacta: x1 = 3, x2 = -2.5, x3 = 7; la pequeña diferencia es error de redondeo de punto flotante.)
