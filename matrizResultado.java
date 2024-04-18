import javax.swing.JOptionPane;
public class matrizResultado {
        public static void main(String[] args) {
            JOptionPane jo=new JOptionPane();
            int n = Integer.parseInt(jo.showInputDialog("Ingrese la dimension n de la matriz"));
            int m = Integer.parseInt(jo.showInputDialog("Ingrese la dimension m de la matriz"));
            int [][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = Integer.parseInt(jo.showInputDialog(null,"Ingrese número: "));
                }
            }
            String message="";
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    message= message + " ||"+ String.valueOf(matrix[i][j]*2);
                }
                message = message + "\n";
            }
                    jo.showMessageDialog(null,message);
                
        }
}