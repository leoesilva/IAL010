package Lista;

import javax.swing.JOptionPane;

public class ComparaPrecos {
    public static void main(String[] args) {
        double precop1 = 0, precop2 = 0, precop3 = 0, menorpreco = 0;
        int menorprod = 0;

        precop1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do primeiro produto:"));
        precop2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do segundo produto:"));
        precop3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do terceiro produto:"));

        if ((precop1 == precop2) || (precop2 == precop3) || (precop1 == precop3)) {
            JOptionPane.showMessageDialog(null, "Foram digitados valores iguais!");
        } else {
            if ((precop1 < precop2) && (precop1 < precop3)) {
                menorpreco = precop1;
                menorprod = 1;
            } else if ((precop2 < precop1) && (precop2 < precop3)) {
                menorpreco = precop2;
                menorprod = 2;
            } else {
                menorpreco = precop3;
                menorprod = 3;
            }
            JOptionPane.showMessageDialog(null,
                    "A compra recomendada é a do produto " + menorprod + ", no valor de R$ " + menorpreco + ".");
        }
    }
}
