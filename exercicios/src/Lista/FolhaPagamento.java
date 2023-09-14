package Lista;

import javax.swing.JOptionPane;

public class FolhaPagamento {
    public static void main(String[] args) {
        final double aliquotaInss = 10, aliquotaFgts = 11;
        int qtdHoras;
        double valorHora, salarioBruto, aliquotaIr, valorIr, valorInss, valorFgts, totalDescontos, salarioLiquido;

        qtdHoras = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas no mês:"));
        valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da sua hora de trabalho:"));

        salarioBruto = qtdHoras * valorHora;

        if (salarioBruto <= 900) {
            aliquotaIr = 0;
        } else if (salarioBruto <= 1500) {
            aliquotaIr = 5;
        } else if (salarioBruto <= 2500) {
            aliquotaIr = 10;
        } else {
            aliquotaIr = 20;
        }

        valorIr = salarioBruto * (aliquotaIr / 100);
        valorInss = salarioBruto * (aliquotaInss / 100);
        valorFgts = salarioBruto * (aliquotaFgts / 100);
        totalDescontos = valorIr + valorInss;
        salarioLiquido = salarioBruto - totalDescontos;

        JOptionPane.showMessageDialog(null,
                "Salário bruto: (" + qtdHoras + " * " + valorHora + ") \t\t: R$ " + salarioBruto
                        + "\n(-) IR (" + aliquotaIr + "%) \t\t: R$ " + valorIr
                        + "\n(-) INSS (" + aliquotaInss + "%)\t\t: R$ " + valorInss
                        + "\nFGTS (" + aliquotaFgts + "%) \t\t: R$ " + valorFgts
                        + "\nTotal de descontos \t\t: R$" + totalDescontos
                        + "\nSalário líquido \t\t : R$ " + salarioLiquido);
    }
}
