import java.util.Scanner;


public class numerosMatriz6{
    public static void main(String[] args) {
        int[][] numerosM = new int[6][6];
        Scanner sc =new Scanner(System.in);
        int suma=0, cadena=0;
        // String cadena ="";

        System.out.println("pene");
   
        for (int i= 0; i < 6; i++) {
            for (int j = 0; j <36; j++) {
                 numerosM[i][j] = sc.nextInt();
                suma = suma + (int)(Math.random()*50+1);
            }
            // numerosM[1][i]= String.valueOf(suma/36);
            
        }
         int numero=0;


        for (int i = 0; i < 2; i++) {
            for (int j=0;j < 6; j++) {
                numero =numero+ numerosM[i][j] ;                
            }
          System.out.println(numero);
       
        }
    } 
}

