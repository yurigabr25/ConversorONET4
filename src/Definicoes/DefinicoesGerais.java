package Definicoes;

public abstract class DefinicoesGerais {

    private String nome;

    // Construtor da classe referindo o nome do conversor
    public DefinicoesGerais() {
        this.nome = "";
    }

    // Recebe o nome dos conversores do sistema
    public DefinicoesGerais(String nome) {
        this.nome = nome;
    }

    // Torna o nome acessível a outras classes
    public String getNome() {
        return this.nome;
    }

    public abstract void executar();

}
