package usando.objetos;

public class UsandoObjetos {

    public static void main(String[] args) {
        Curso curso = new Curso("Administração", 24);
        CursoTecnico cursoTecnico = new CursoTecnico("Informática", 18, "Tecnologia");

        curso.exibirInformacoes();
        cursoTecnico.exibirInformacoes();
    }
}
