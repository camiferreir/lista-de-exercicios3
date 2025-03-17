package pkgsuper.e.chamada.de.métodos;

class Curso {

    String nome;
    int duracao;

    public Curso(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public void exibirInformacoes() {
        System.out.println("Curso: " + nome);
        System.out.println("Duração: " + duracao + " meses");
    }
}
