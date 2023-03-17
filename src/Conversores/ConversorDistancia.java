package Conversores;
// Chama a classe ControleDeConversores
import Definicoes.DefinicoesGerais;

// Importa a interface JOptionPane
import javax.swing.JOptionPane;

public class ConversorDistancia extends DefinicoesGerais {

    public ConversorDistancia() {
        // Envia o nome do conversor ao construtor
        super("Conversor de Distância");
    }


    @Override
    public void executar() {
        // Interface de escolha de unidades de medidas
        String[] unidades = {"Metros", "Centímetros", "Polegadas", "Pés"};

        // Recebe os valores String de unidades de medidas de origem e destino
        String unidadeOrigem = (String) JOptionPane.showInputDialog(null, "Escolha a unidade de origem:", "Conversor de Distância", JOptionPane.PLAIN_MESSAGE, null, unidades, unidades[0]);
        String unidadeDestino = (String) JOptionPane.showInputDialog(null, "Escolha a unidade de destino:", "Conversor de Distância", JOptionPane.PLAIN_MESSAGE, null, unidades, unidades[1]);

        // Recebe os valores double de unidades de medidas de origem e destino
        double valorOrigem = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor em " + unidadeOrigem + ":", "Conversor de Distância", JOptionPane.PLAIN_MESSAGE));
        double valorDestino = 0;

        // Lógica de escolha de unidades de medidas
        if (unidadeOrigem.equals("Metros")) {
            if (unidadeDestino.equals("Centímetros")) {
                valorDestino = valorOrigem * 100;
            } else if (unidadeDestino.equals("Polegadas")) {
                valorDestino = valorOrigem * 39.3701;
            } else if (unidadeDestino.equals("Pés")) {
                valorDestino = valorOrigem * 3.28084;
            } else {
                valorDestino = valorOrigem;
            }
        } else if (unidadeOrigem.equals("Centímetros")) {
            if (unidadeDestino.equals("Metros")) {
                valorDestino = valorOrigem / 100;
            } else if (unidadeDestino.equals("Polegadas")) {
                valorDestino = valorOrigem / 2.54;
            } else if (unidadeDestino.equals("Pés")) {
                valorDestino = valorOrigem / 30.48;
            } else {
                valorDestino = valorOrigem;
            }
        } else if (unidadeOrigem.equals("Polegadas")) {
            if (unidadeDestino.equals("Metros")) {
                valorDestino = valorOrigem / 39.3701;
            } else if (unidadeDestino.equals("Centímetros")) {
                valorDestino = valorOrigem * 2.54;
            } else if (unidadeDestino.equals("Pés")) {
                valorDestino = valorOrigem / 12;
            } else {
                valorDestino = valorOrigem;
            }
        } else if (unidadeOrigem.equals("Pés")) {
            if (unidadeDestino.equals("Metros")) {
                valorDestino = valorOrigem / 3.28084;
            } else if (unidadeDestino.equals("Centímetros")) {
                valorDestino = valorOrigem * 30.48;
            } else if (unidadeDestino.equals("Polegadas")) {
                valorDestino = valorOrigem * 12;
            } else {
                valorDestino = valorOrigem;
            }
        }
        // Exibe a mensagem com a unidade de medida convertida
        JOptionPane.showMessageDialog(null, "O valor em " + unidadeDestino + " é: " + valorDestino, "Conversor de Distância", JOptionPane.INFORMATION_MESSAGE);
    }

}
