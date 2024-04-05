// la pizzeria itm ofrece pizza vegetariana y no vegetariana a sus clientes, los ingredientes para cada pizza
// aprarecen a continuacion
 
// vegetariana: pimienta, tofu,brocoly,champiñon
 
// no vegetariana:peproni9, jamon,salmon, pollo, ranchera, mixta,
 
// escribir un programa que meustre al usuario que tipo de pizza quiere, en funcion a su respuesta
// muestre el menu correspondiente (vegetariana, no vegtariana) solo se puede elegir un solo ingredientes
// se debe mostrar al final que tipo de pizza y que ingredientes
// si la comprar fue echa en el horario de las 5pm a 7pm tiene un descuento de 10%
// si la compra fue echa en el horario de 7pm a 9pm hayn un descuento del 8%
// por otro lado la pizzeria requiere saber saber cual es la pizza que mas se vende y en que horario
import java.util.Scanner;
public class pizzeria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vg=0, ng=0, ingredientes =0, horario=0;

        System.out.println("Bienvenido a la pizeria itm, por favor elija un tipo de pizza dependiendo de sus opciones");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                System.out.println("Los ingredientes vegerarianos son: \n");
                System.out.println("Pimienta \n");
                System.out.println("Tofu \n");
                System.out.println("Brocoly \n");
                System.out.println("champiñon \n");
                break;
            case 2:
                System.out.println("Los ingredientes no vegerarianos son: \n");
                System.out.println("Peperoni \n");
                System.out.println("Jamón \n");
                System.out.println("Salmon \n");
                System.out.println("pollo \n");
                System.out.println("ranchera \n");
                System.out.println("mixta \n");
                break;
        
            default:
                break;
        }
    }
}
