public class imprimirDiagonalMatriz {
    public void Imprimir(int[][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i==j) {
                    System.out.println(matriz[i][j]);
                }
            }
        }
    }
}
