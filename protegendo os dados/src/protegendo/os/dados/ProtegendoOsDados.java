package protegendo.os.dados;

public class ProtegendoOsDados {

    public static void main(String[] args) {
        Curso curso1 = new Curso("Java Básico", 40);
        curso1.exibirCurso();

        curso1.setCargaHoraria(-5);
        curso1.exibirCurso();

        curso1.setCargaHoraria(30);
        curso1.exibirCurso();
    }

}
