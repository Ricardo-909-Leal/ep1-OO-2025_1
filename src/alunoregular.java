public class AlunoRegular extends Aluno {
    private String curso;
    private String semestre;
    private String turno;

    public AlunoRegular(String nome, String matricula, String nascimento , String curso, String semestre, String turno ) {
        super(nome, matricula, nascimento);
        this.curso = curso;
        this.semestre = semestre;
        this.turno = turno;

    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getSemestre() {
        return semestre;
    }
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    } 
    @Override
    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + getMatricula()); 
        System.out.println("Nascimento: " + getNascimento());
        System.out.println("Curso: " + curso);
        System.out.println("Semestre: " + semestre);
        System.out.println("Turno: " + turno);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Matrícula: " + getMatricula() + ", Nascimento: " + getNascimento() + ", Curso: " + curso + ", Semestre: " + semestre + ", Turno: " + turno ;
    }
}
