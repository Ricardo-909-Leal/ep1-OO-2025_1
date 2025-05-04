public class AlunoRegular extends Aluno {
    private String curso;
    private String periodo;
    private String turno;
    private int nota;
    
    public AlunoRegular(String nome, String maricula, String nascimento , String curso, String periodo, String turno, int nota) {
        super(nome, maricula, nascimento);
        this.curso = curso;
        this.periodo = periodo;
        this.turno = turno;
        this.nota = nota;
    }
    @Override
    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Matricula: " + getMaricula()); 
        System.out.println("Nascimento: " + getNascimento());
        System.out.println("Curso: " + curso);
        System.out.println("Periodo: " + periodo);
        System.out.println("Turno: " + turno);
        System.out.println("Nota: " + nota);
    }
}
