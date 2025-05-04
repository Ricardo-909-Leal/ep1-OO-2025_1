public class Turma extends Disiplina {
    // Atributos
    private String professor;
    private String sementre;
    private String formadeavaliacao;
    private int numero;
    private int capacidade;
    private String modalidade;
    private String sala;
    private String horario;

    // Construtor
    public Turma(String nome, String codigo, int cargaHoraria, String preRequesito, String professor, String semestre, String formadeavaliacao, int numero, int capacidade, String modalidade, String sala, String horario) {
        super(nome, codigo, cargaHoraria, preRequesito);
        this.professor = professor;
        this.sementre = semestre;
        this.formadeavaliacao = formadeavaliacao;
        this.numero = numero;
        this.capacidade = capacidade;
        this.modalidade = modalidade;
        this.sala = sala;
        this.horario = horario;
    }
    
    // Métodos de acesso (getters e setters)
    public String getProfessor() {
        return this.professor;
    }
    public String getsemestre() {
        return this.sementre;
    }
    public String getformadeavaliacao() {
        return this.formadeavaliacao;
    }
    public int getNumero() {
        return this.numero;
    }
    public int getCapacidade() {
        return this.capacidade;
    }
    public String getModalidade() {
        return this.modalidade;
    }
    public String getSala() {
        return this.sala;
    }
    public String getHorario() {
        return this.horario;
    }
}
