package Lista;

import javax.swing.JOptionPane;

public class VerificaSexo {
    public static void main(String[] args) {
        char sexo;

        sexo = Character.toUpperCase(JOptionPane.showInputDialog("Digite o seu sexo (M ou F): ").charAt(0));

        if (sexo == 'F') {
            JOptionPane.showMessageDialog(null, "Opcão digitada: " + sexo + " - Feminino.");
        } else if (sexo == 'M') {
            JOptionPane.showMessageDialog(null, "Opcão digitada: " + sexo + " - Masculino.");
        } else {
            JOptionPane.showMessageDialog(null, "Opcão digitada: " + sexo + " - Inválida.");
        }
    }
}
