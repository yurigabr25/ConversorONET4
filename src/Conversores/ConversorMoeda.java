package Conversores;
// Chama o pachage do Controle
import Definicoes.DefinicoesGerais;

// Importa a interface JOptionPane
import javax.swing.JOptionPane;

public class ConversorMoeda extends DefinicoesGerais {
    // Envia o nome da moeda ao constructor
    public ConversorMoeda() {
        super("Conversor de Moeda");
    }

    @Override
    public void executar() {
        // Interface de escolha de moedas
        String[] moedas = {"Dólar", "Euro", "Peso Argentino", "Dólar Canadense"};
        String moedaOrigem = (String) JOptionPane.showInputDialog(null, "Selecione a moeda de origem:", "Conversor de Moedas", JOptionPane.PLAIN_MESSAGE, null, moedas, moedas[0]);

        // Recebe os parâmetros de valor de origem
        // Inicia a contagem do valorReal em 0
        double valorOrigem = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor em " + moedaOrigem + ":", "Conversor de Moedas", JOptionPane.PLAIN_MESSAGE));
        double valorReal = 0;

        // Lógica de escolha das moedas para conversão
        if (moedaOrigem.equals("Dólar")) {
            valorReal = valorOrigem * 5.27;
        } else if (moedaOrigem.equals("Euro")) {
            valorReal = valorOrigem * 5.62;
        } else if (moedaOrigem.equals("Peso Argentino")) {
            valorReal = valorOrigem * 0.026;
        } else if (moedaOrigem.equals("Dólar Canadense")) {
            valorReal = valorOrigem * 3.84;
        }
        // Retorna a mensagem com o valor convertido em real
        JOptionPane.showMessageDialog(null, "O valor em Real é: R$" + valorReal, "Conversor de Moedas", JOptionPane.INFORMATION_MESSAGE);
    }
}
