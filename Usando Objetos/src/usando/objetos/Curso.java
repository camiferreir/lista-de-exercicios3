package usando.objetos;

class Curso {

    String nome;
    int duracao;

    Curso(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    void exibirInformacoes() {
        System.out.println("Curso: " + nome + ", Duração: " + duracao + " meses");
    }
}
