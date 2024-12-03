package EjerciciosADA;
import java.util.Scanner;
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


