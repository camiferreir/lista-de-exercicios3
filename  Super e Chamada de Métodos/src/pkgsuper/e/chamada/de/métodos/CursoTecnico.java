package pkgsuper.e.chamada.de.métodos;

class CursoTecnico extends Curso {

    String area;

    public CursoTecnico(String nome, int duracao, String area) {
        super(nome, duracao);
        this.area = area;
    }

}
