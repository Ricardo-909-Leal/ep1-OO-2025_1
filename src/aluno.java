public abstract class Aluno {
    private String nome;
    private String matricula;
    private String nascimento;

    public Aluno(String nome, String matricula, String nascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.nascimento = nascimento;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getNascimento() {
        return nascimento;
    }
    
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + getMatricula()); 
        System.out.println("Nascimento: " + getNascimento());
    }
    @Override
    public String toString() {
        return "Nome: " + nome + ", Matrícula: " + matricula + ", Nascimento: " + nascimento ;
    } 
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aluno aluno = (Aluno) obj;
        return matricula.equals(aluno.matricula);
    }


    @Override
    public int hashCode() {
        return matricula.hashCode();
    }
}