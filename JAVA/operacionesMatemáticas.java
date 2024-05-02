package JAVA;

public class operacionesMatemáticas {
    public int Operaciones(int numero1, int numero2, int opt){
        int result = 0;
        switch (opt) {
            case 1:
                result = numero1 + numero2;
                break;
            case 2:
                result = numero1 - numero2;
                break;
            case 3:
                result = numero1 * numero2;
                break;
            case 4:
                result = numero1 / numero2;
                break;
        
            default:
                break;
        }
        return result;
    }
}
