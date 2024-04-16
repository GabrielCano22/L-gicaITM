import java.util.Random;
import javax.swing.JOptionPane;

public class matricesRandom {
    public static void main(String[] args) {
        JOptionPane jo = new JOptionPane();
        int n = Integer.parseInt(jo.showInputDialog("Ingrese la dimension de la matriz"));
        int[][] matrix = new int[n][n];

        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(100); 
            }
        }

        String message = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                message += matrix[i][j] + " ";
            }
            message += "\n";
        }
        jo.showMessageDialog(null, message);
    }
}