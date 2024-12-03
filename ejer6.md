# Ejercicio 6: 
Escribe un algoritmo que recorra una matriz cuadrada o rectangular M en forma de espiral, comenzando desde la esquina superior izquierda y moviéndose en sentido horario. 
El algoritmo debe devolver los elementos en el orden en que son visitados.
### Recorrido Espiral
```Java
public class ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de filas (n): ");
        int n = sc.nextInt();
        System.out.print("Numero de columnas (m): ");
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int top = 0, left = 0, bottom = n - 1, right = m - 1;
        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) System.out.print(mat[top][j] + " ");
            top++;

            for (int i = top; i <= bottom; i++) System.out.print(mat[i][right] + " ");
            right--;

            if (top <= bottom) {
                for (int j = right; j >= left; j--) System.out.print(mat[bottom][j] + " ");
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) System.out.print(mat[i][left] + " ");
                left++;
            }
        }
    }
}
 ```
## Complejidad total:

La entrada de datos tiene una complejidad de O(n * m) ya que se recorren todos los elementos de la matriz para leerlos.
El algoritmo para imprimir los elementos en espiral recorre la matriz de manera ordenada en espiral, y cada elemento de la matriz se visita exactamente una vez. 
Dado que se visitan todos los elementos de la matriz, esta operación también tiene una complejidad de O(n * m).

Por lo tanto, la complejidad total del programa es O(n * m), ya que tanto la lectura de la matriz como la impresión en espiral requieren recorrer todos los elementos de la matriz.

La complejidad total de este programa es O(n * m) debido al proceso de recorrer toda la matriz para realizar las operaciones de lectura e impresión.
