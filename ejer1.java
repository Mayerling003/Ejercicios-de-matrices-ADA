package EjerciciosADA;
import java.util.Scanner;

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

