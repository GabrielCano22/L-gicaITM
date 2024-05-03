import javax.swing.JOptionPane;

public class Operacion {
    public double operacion (int opt) {
        double n1=0, n2=0;
        n1=Double.parseDouble(JOptionPane.showInputDialog(null,"INGRESE N1"));
        n2=Double.parseDouble(JOptionPane.showInputDialog(null,"INGRESE N2"));
        Operaciones op= new Operaciones();
        double resultado=0;
        switch (opt) {
            case 1:
                resultado=op.Sumar(n1,n2);
                break;
                case 2:
                resultado=op.Restar(n1,n2);
                break;
                case 3:
                resultado=op.Multiplicar(n1,n2);
                break;
        
            default:
            resultado=op.Dividir(n1, n2);
                break;
        }
        return resultado;
    }
}
