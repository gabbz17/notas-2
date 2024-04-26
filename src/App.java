
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        int[] v = new int[3];
        String m;
        int i = 0;
        float media;
        float n = 0;

        while (i < v.length) {
            m = JOptionPane.showInputDialog("Informe a nota: ");
            float m1 = Float.parseFloat(m);
            if (m1 > 10 || m1 < 0) {
                JOptionPane.showMessageDialog(null, "Informe uma nota válida!");
                System.out.println("Informe uma nota válida!");
            } else {
                System.out.println("Nota " + m1 + " na posição " + i);
                n += m1;
                i++;
            }

        }

        media = n / i;
        System.out.println(" ");
        JOptionPane.showMessageDialog(null, "Média: " + media);
        System.out.println("Média: " + media);
        System.out.println(" ");

        JOptionPane.showMessageDialog(null, media >= 6 ? "APROVADO" : "REPROVADO");
        System.out.println(media >= 6 ? "APROVADO" : "REPROVADO");
    }
}
