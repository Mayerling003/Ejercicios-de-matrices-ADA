# Ejercicio 2: 
Dada una matriz cuadrada mmm de dimensión ddd, escribe un algoritmo que permita rotar la matriz 90° en el sentido de las agujas del reloj. 
### Rotación de una matriz 90°
```Java
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
𝑛×𝑛 varias etapas del proceso.

