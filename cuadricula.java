public class cuadricula {
    public int [][] llenar(int n){
        int [][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int)(Math.random()*10+1);
            }
        }
        return matriz;
    }
}
