package EjerciciosADA;
import java.util.Scanner;
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
}


