import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private String codigo;
    private int cargaHoraria;
    private List<String> preRequisitos;
    private List<Turma> turmas;
    
    public Disciplina(String nome, String codigo, int cargaHoraria) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.preRequisitos = new ArrayList<>();
        this.turmas = new ArrayList<>();

    }
    public void adicionarPreRequisito(String codigoDisciplina) {
        if (!preRequisitos.contains(codigoDisciplina)) {
            preRequisitos.add(codigoDisciplina);
        }
    }
    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }
    
    // Getters e setters

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public List<String> getPreRequisitos() {
        return preRequisitos;
    }
    public void setPreRequisitos(List<String> preRequisitos) {
        this.preRequisitos = preRequisitos;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }
    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
    @Override
    public String toString() {
        return codigo + " - " + nome + " (" + cargaHoraria + "h)";
    }
}
