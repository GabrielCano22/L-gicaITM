package JAVA;

import java.util.Scanner;

public class métodos{
    public static void main(String[] args) {
        mensaje m = new mensaje();
        operacionesMatemáticas op = new operacionesMatemáticas();
        Scanner sc = new Scanner(System.in);
        String mensajeResult = m.mensaje();
        System.out.println(mensajeResult);
        m.mensaje();
        int result=0, opt=0;
        System.out.println("ingrese numero1");
        int numero1 = sc.nextInt();
        System.out.println("ingrese numero2");
        int numero2 = sc.nextInt();
        System.out.println("ingrese la operacion que desea 1: suma, 2: resta, 3: multiplicación, 4:division");
        opt = sc.nextInt();
        result = op.Operaciones(numero1,numero2,opt);
        System.out.println(result);
    }
}