import java.util.Scanner;


public class matrizPaises {
    public static void main(String[] args) {
        String[][] paises = new String[2][6];
        Scanner sc =new Scanner(System.in);
        int suma=0;
        String cadena ="";

        
        for (int i= 0; i < 6; i++) { 
            System.out.println("ingrese los paises");
            paises[0][i] = sc.next();
        }    
        for (int i= 0; i < 6; i++) {
            for (int j = 0; j <30; j++) {
                suma = suma + (int)(Math.random()*40+1);
            }
            paises[1][i]= String.valueOf(suma/30);
            suma=0;
        }
        for (int i = 0; i < 2; i++) {
            for (int j=0;j < 6; j++) {
                cadena = cadena + paises[i][j]+ " |  | ";                
            }
          System.out.println(cadena);
          System.out.println( "\n");
          cadena = "";
        }
    } 
}