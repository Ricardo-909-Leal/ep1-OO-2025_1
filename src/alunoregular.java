public class AlunoRegular extends Aluno {
    private String curso;
    private String periodo;
    private String turno;
    private int nota;
    
    public AlunoRegular(String nome, String matricula, String nascimento , String curso, String periodo, String turno, int nota) {
        super(nome, matricula, nascimento);
        this.curso = curso;
        this.periodo = periodo;
        this.turno = turno;
        this.nota = nota;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getPeriodo() {
        return periodo;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }
    @Override
    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + getMatricula()); 
        System.out.println("Nascimento: " + getNascimento());
        System.out.println("Curso: " + curso);
        System.out.println("Periodo: " + periodo);
        System.out.println("Turno: " + turno);
        System.out.println("Nota: " + nota);
    }
    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Matrícula: " + getMatricula() + ", Nascimento: " + getNascimento() + ", Curso: " + curso + ", Período: " + periodo + ", Turno: " + turno + ", Nota: " + nota;
    }
}
