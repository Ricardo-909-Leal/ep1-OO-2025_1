public class AlunoEspecial extends Aluno {
    private String semestre;
    private String turno;
    
    public AlunoEspecial(String nome, String matricula, String nascimento ,String semestre, String turno) {
        super(nome, matricula, nascimento);
        this.semestre = semestre;
        this.turno = turno;
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
        System.out.println("Semestre: " + semestre);
        System.out.println("Turno: " + turno);
    }
    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Matrícula: " + getMatricula() + ", Nascimento: " + getNascimento() + ", Semestre: " + semestre + ", Turno: " + turno ;
    }
}