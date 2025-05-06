

public class AlunoEspecial extends Aluno {

    private String periodo;
    private String turno;
    
    public AlunoEspecial(String nome, String matricula, String nascimento ,String periodo, String turno) {
        super(nome, matricula, nascimento);
        this.periodo = periodo;
        this.turno = turno;
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
    @Override
    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + getMatricula()); 
        System.out.println("Nascimento: " + getNascimento());
        System.out.println("Periodo: " + periodo);
        System.out.println("Turno: " + turno);
    }
    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Matrícula: " + getMatricula() + ", Nascimento: " + getNascimento() + ", Período: " + periodo + ", Turno: " + turno ;
    }
}
