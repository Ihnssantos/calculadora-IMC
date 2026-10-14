package programa;

import javax.swing.JOptionPane;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double peso = Double.parseDouble(JOptionPane.showInputDialog("Entre com o peso do usuário: "));

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Entre com a altura do usuário: "));

        double imc = peso / (altura * altura);
        String formatado = String.format("%.2f", imc);


        if (imc < 18.5) {

            JOptionPane.showMessageDialog(null, "O IMC do usuário é " + formatado + " Abaixo do peso");

        } else if (imc >= 18.6 && imc <= 24.9) {

            JOptionPane.showMessageDialog(null, "O IMC do usuário é " + formatado + " Peso ideal (Parabéns!)");

        } else if (imc >= 25.0 && imc <= 29.9) {

            JOptionPane.showMessageDialog(null, "O IMC do usuário é " + formatado + " Atenção! Você está acima do peso");

        } else if (imc >= 30 && imc <= 34.9) {

            JOptionPane.showMessageDialog(null, "O IMC do usuário é " + formatado + " Obesidade Grau I");

        } else if (imc >= 35.0 && imc <= 39.9) {

            JOptionPane.showMessageDialog(null, "O IMC do usuário é " + formatado + " Obesidade Grau II (severa)");

        } else {

            JOptionPane.showMessageDialog(null, "O IMC do usuário é " + formatado + " Obesidade Grau III (móbida)");

        }

        sc.close();
    }
}
