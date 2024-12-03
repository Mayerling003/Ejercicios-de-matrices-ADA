package EjerciciosADA;
import java.util.Scanner;
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
}

