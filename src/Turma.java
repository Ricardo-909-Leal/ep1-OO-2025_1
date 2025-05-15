import java.util.ArrayList;
import java.util.List;

public class Turma extends Disciplina {
    // Atributos
    private String codTurma;
    private String professorResponsavel;
    private String semestre;
    private String formaAvaliacao; // "simples" ou "ponderada"
    private boolean presencial;
    private String sala;
    private String horario;
    private int capacidadeMaxima;
    private List<Aluno> alunosMatriculados;

    public Turma(String nome, String codigo,int cargaHoraria, String codTurma, String professorResponsavel, String semestre, String formaAvaliacao, boolean presencial, String sala, String horario, int capacidadeMaxima) {

        super(nome, codigo, cargaHoraria); 
        this.codTurma = codTurma;
        this.professorResponsavel = professorResponsavel;
        this.semestre = semestre;
        this.formaAvaliacao = formaAvaliacao;
        this.presencial = presencial;
        this.sala = presencial ? sala : null;
        this.horario = horario;
        this.capacidadeMaxima = capacidadeMaxima;
        this.alunosMatriculados = new ArrayList<>();
    }
    public Turma(String codTurma, String professor,String semestre,String forma, boolean presencial,String sala,String horario,int capacidade) {
        super("", "", 0); // Exemplo de valores
        this.codTurma = codTurma;
        this.professorResponsavel = professor;
        this.semestre = semestre;
        this.formaAvaliacao = forma;
        this.presencial = presencial;
        this.sala = presencial ? sala : null;
        this.horario = horario;
        this.capacidadeMaxima = capacidade;
        this.alunosMatriculados = new ArrayList<>();
    }


    public boolean matricularAluno(Aluno aluno) {
        if (alunosMatriculados.size() < capacidadeMaxima) {
            alunosMatriculados.add(aluno);
            return true;
        }
        return false;
    }

    public void listarAlunos() {
        for (Aluno a : alunosMatriculados) {
            System.out.println(a);
        }
    }

    // Getters e setters

    public String getCodTurma() {
        return codTurma;
    }

    public String getProfessorResponsavel() {
        return professorResponsavel;
    }

    public String getSemestre() {
        return semestre;
    }

    public String getFormaAvaliacao() {
        return formaAvaliacao;
    }

    public boolean isPresencial() {
        return presencial;
    }

    public String getSala() {
        return sala;
    }

    public String getHorario() {
        return horario;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    @Override
    public String toString() {
        return "Turma " + codTurma + " - " + (presencial ? "Presencial" : "Remota")
                + " - Prof: " + professorResponsavel + " - Horário: " + horario;
    }
}

 