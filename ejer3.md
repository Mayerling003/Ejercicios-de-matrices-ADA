# Ejercicio 3: 
Dada una matriz mmm de números enteros y dimensión ddd, escribe un algoritmo que calcule la suma de los elementos en el "perímetro" de la matriz (es decir, los elementos que están en los bordes).
###  Perímetro de la matriz
```Java
public class ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dimension de la matriz: ");
        int d = sc.nextInt();
        int[][] m = new int[d][d];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        int sp = 0;
        for (int j = 0; j < d; j++) {
            sp += m[0][j];           
            sp += m[d - 1][j];       
        }
        for (int i = 1; i < d - 1; i++) {
            sp += m[i][0];           
            sp += m[i][d - 1];       
        }
        System.out.println("Suma de los elementos en el perimetro: " + sp);
    }
} ```
## Complejidad total:

La entrada de datos tiene una complejidad de O(d²).
El cálculo de la suma del perímetro tiene una complejidad de O(d) debido a las operaciones sobre las filas y columnas del borde de la matriz.
Por lo tanto, la complejidad total del programa es O(d²), ya que el paso más costoso (rellenar la matriz) tiene una complejidad de O(d²).

La complejidad total de este programa es O(d²) debido al proceso de llenar la matriz, que requiere recorrer todos los elementos de la matriz 
𝑑×𝑑


