// Importando as classes dos conversores
import Definicoes.DefinicoesGerais;
import Conversores.ConversorDistancia;
import Conversores.ConversorMoeda;

// Importando ArrayList e JOptionPane
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        // ArrayList que recebe todos os conversores
        ArrayList<DefinicoesGerais> conversores = new ArrayList<DefinicoesGerais>();
        // Adicionando conversores
        conversores.add(new ConversorMoeda());
        conversores.add(new ConversorDistancia());

        // Percorre a ArrayList
        String[] opcoes = new String[conversores.size() + 1];
        for (int i = 0; i < conversores.size(); i++) {
            opcoes[i] = conversores.get(i).getNome();
        }
        // Opção para finalizar a aplicacao
        opcoes[conversores.size()] = "Sair";

        // Inicio de contagem de escolha em 0
        int escolha = 0;

        // Laço while com o funcionamento do menu
        while (escolha != conversores.size()) {
            escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Conversores", 0, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
            if (escolha != conversores.size()) {
                conversores.get(escolha).executar();
            }
        }
    }

}
