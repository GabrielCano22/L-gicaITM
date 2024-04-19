
// para llenar matriz aleatorea

public class matrizAleatoria {
    public int[][] llenarmatriz(int filas, int columnas){
        int[][]matriz=new int[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j]=(int)(Math.random()*100+1);
            }
        }
        return matriz;
    }
    public void mostrarmatrix(int[][]matriz,int filas, int columnas)
    {
      for (int i = 0; i< filas; i++) {
        for (int j = 0; j < columnas; j++) {
            System.out.print(matriz[i][j]+ "||");
        }
        System.out.println("");
      }
    }




    
}
