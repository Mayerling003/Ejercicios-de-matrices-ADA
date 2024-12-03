# Ejercicio 5: 
Escribe un algoritmo que determine si una matriz cuadrada m y m es simétrica (es decir, si m[i][j]=m[j][i] para todos i,j).
###  Verificar simetría de una matriz
```Java
public class ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dimension de la matriz cuadrada (m): ");
        int m = sc.nextInt();
        int[][] mat = new int[m][m];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                if (mat[i][j] != mat[j][i]) {
                    System.out.println("La matriz no es simetrica.");
                    return;
                }
            }
        }

        System.out.println("La matriz es simetrica.");
    }
} ```
## Complejidad total:

La entrada de datos tiene una complejidad de O(m^2) ya que se recorren todos los elementos de la matriz para leerlos.
El algoritmo para verificar si la matriz es simétrica recorre solo la mitad superior de la matriz, ya que compara los elementos mat[i][j] con mat[j][i] (lo que es suficiente para verificar la simetría).
Esto tiene una complejidad de O(m^2 / 2), lo que es equivalente a O(m^2).

Por lo tanto, la complejidad total del programa es O(m^2), ya que tanto la lectura de la matriz como la verificación de simetría requieren recorrer todos los elementos de la matriz en el peor de los casos.

La complejidad total de este programa es O(m^2) debido a que se recorre toda la matriz para verificar la simetría y para llenar los datos.
