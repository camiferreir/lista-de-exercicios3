package protegendo.os.dados;

final class Curso {

    private String nome;
    private int cargaHoraria;

    public Curso(String nome, int cargaHoraria) {
        this.nome = nome;
        setCargaHoraria(cargaHoraria);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria > 0) {
            this.cargaHoraria = cargaHoraria;
        } else {
            System.out.println("Erro: A carga horária deve ser maior que zero.");
        }
    }

    public void exibirCurso() {
        System.out.println("Curso: " + nome + ", Carga Horária: " + cargaHoraria + " horas");
    }
}
