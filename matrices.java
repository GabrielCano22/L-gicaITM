import javax.swing.JOptionPane;
public class matrices {
        public static void main(String[] args) {
            JOptionPane jo=new JOptionPane();
            int n = Integer.parseInt(jo.showInputDialog("Ingrese la dimension de la matriz"));
            int [][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = Integer.parseInt(jo.showInputDialog(null,"Ingrese número: "));
                }
            }
            String message="";
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    message= message + " ||"+ String.valueOf(matrix[i][j]);
                }
                message = message + "\n";
            }
                    jo.showMessageDialog(null,message);
                
        }
}