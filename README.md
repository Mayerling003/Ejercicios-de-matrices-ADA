# Ejercicios-de-matrices-ADA
# Ejercicio 1: 

Dada una matriz cuadrada `m` de números enteros de dimensión `d`, el objetivo de este ejercicio es calcular la suma de los elementos de:

- **Diagonal principal** (de la esquina superior izquierda a la esquina inferior derecha).
- **Diagonal secundaria** (de la esquina superior derecha a la esquina inferior izquierda).
- ### Suma de la Diagonal Principal y Secundaria
Java
public class ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dimension de la matriz: ");
        int n = sc.nextInt();
        int[][] m = new int[n][n];

        System.out.println("Ingrese los elementos:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz ingresada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        int sp = 0, ss = 0;
        for (int i = 0; i < n; i++) {
            sp += m[i][i];          
            ss += m[i][n - 1 - i];  
        }

        System.out.println("Suma diagonal principal: " + sp);
        System.out.println("Suma diagonal secundaria: " + ss);
    }
}

## Complejidad Temporal

- **Lectura de la matriz**: Recorre todos los elementos con un ciclo anidado, por lo que la complejidad es `O(n^2)`.
- **Cálculo de sumas de las diagonales**: Solo se recorre la matriz una vez, con complejidad `O(n)`.
- **Mostrar la matriz**: Se recorre nuevamente todos los elementos con complejidad `O(n^2)`.

**Complejidad total**: `O(n^2)` (dominado por la lectura y visualización de la matriz).

## Complejidad Espacial

- **Matriz**: Se necesita espacio para una matriz de `n x n`, lo que requiere `O(n^2)` de espacio.
- **Variables auxiliares**: Solo se usan algunas variables como `sp`, `ss`, `i`, `j`, lo cual es `O(1)`.

**Complejidad total**: `O(n^2)` (dominado por la matriz).

## Conclusión

- **Complejidad Temporal**: `O(n^2)`
- **Complejidad Espacial**: `O(n^2)`

# Ejercicio 2: 
Dada una matriz cuadrada mmm de dimensión ddd, escribe un algoritmo que permita rotar la matriz 90° en el sentido de las agujas del reloj. 
### Rotación de una matriz 90°
Java
public class ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dimensión de la matriz: ");
        int n = sc.nextInt();
        int[][] m = new int[n][n];
        System.out.println("Ingrese los elementos:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matriz original:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        int[][] r = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                r[j][n - 1 - i] = m[i][j];
            }
        }

        System.out.println("Matriz rotada 90°:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(r[i][j] + " ");
            }
            System.out.println();
        }
    }
}
## Complejidad total:
Cada una de estas operaciones (entrada, impresión, rotación e impresión) tiene una complejidad de O(n²). Dado que no hay operaciones anidadas dentro de cada bloque (los bucles están secuenciales), la complejidad total sigue siendo O(n²), ya que cada operación individual tiene la misma complejidad.

La complejidad total del programa es O(n²) debido a los bucles anidados que recorren la matriz de 
𝑛
×
𝑛
n×n en varias etapas del proceso.

