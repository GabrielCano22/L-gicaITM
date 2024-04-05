import java.util.Scanner;
public class pizzeria2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        int numero =0;
        String entrada="";
        System.out.println("Ingrese la cantidad de numeros a ingresar");
        n = sc.nextInt();
        String[] numeros = new String[n];
        // int[] numeros = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el numero: ");
            entrada = sc.next();
            // Convierto los valores de numero en entero y abao convierto el string en numero con ese Integer.toString, luego lo multiplico por 2 y melo
            numero = Integer.parseInt(entrada);
            numeros[i] = "el numero en la posicion "+ (i+0)+ " y su valor multiplicado a por 2 es: "+ Integer.toString((numero*2));
        }
        //Mostrar el array cuando ya tenga el proocedimiento realizado
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("------------------------------");
            System.out.println("| Array original: "+numeros[i]+          "        |");
            // System.out.println("| Array multiplicado *2: "+numeros[i]*2+ " |");
            System.out.println("------------------------------");
        }
    }
}
