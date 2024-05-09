import java.util.Scanner;

public class mainCuadricula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        System.out.println("meta la dimension de la matriz");
        n = sc.nextInt();
        int [][] matriz = new int[n][n];
        cuadricula ll = new cuadricula();
        matriz = ll.llenar(n);
        imprimirDiagonalMatriz id = new imprimirDiagonalMatriz();
        System.out.println("matriz");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("\n");
        System.out.println("Diagonal");
        id.Imprimir(matriz);
    }
}