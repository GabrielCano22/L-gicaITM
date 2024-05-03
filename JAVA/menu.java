import java.util.Scanner;

public class menu {
    public int menu () {
        Scanner sc = new Scanner(System.in);
        int opt=0;
        System.out.println("INGRESE LA OPCION QUE DESEA 1:SUMAR | 2: RESTAR | 3:MULTIPLICAR | 4:DIVIDIR");
        opt= sc.nextInt();
        return opt;
    }
}
