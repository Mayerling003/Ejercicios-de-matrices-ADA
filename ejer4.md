# Ejercicio 4: 
Dada una matriz mmm de n×mn \times mn×m, escribe un algoritmo que genere la matriz transpuesta.
###  Transpuesta de una matriz
```Java
public class ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de filas (n): ");
        int n = sc.nextInt();
        System.out.print("Número de columnas (m): ");
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int[][] trans = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                trans[j][i] = mat[i][j];
            }
        }
        System.out.println("Matriz original:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
} ```
## Complejidad total:

La entrada de datos tiene una complejidad de O(n * m) ya que se recorren todos los elementos de la matriz para leerlos. La transposición de la matriz tiene una complejidad de O(n * m) debido a las operaciones sobre cada elemento de la matriz original.
La impresión de la matriz original y de la transpuesta también tiene una complejidad de O(n * m) porque se recorren todos los elementos de ambas matrices para imprimirlos.
Por lo tanto, la complejidad total del programa es O(n * m) ya que las operaciones dominantes (lectura, transposición e impresión) tienen una complejidad de O(n * m).

La complejidad total de este programa es O(n * m) debido al proceso de recorrer todas las posiciones de la matriz para realizar las operaciones.

