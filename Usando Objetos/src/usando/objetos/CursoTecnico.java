package usando.objetos;

class CursoTecnico extends Curso {

    String area;

    CursoTecnico(String nome, int duracao, String area) {
        super(nome, duracao);
        this.area = area;
    }

    @Override
    void exibirInformacoes() {
        System.out.println("Curso Técnico: " + nome + ", Duração: " + duracao + " meses, Área: " + area);
    }
}
