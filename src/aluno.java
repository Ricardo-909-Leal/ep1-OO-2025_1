public abstract class Aluno {
    private String nome;
    private String maricula;
    private String nascimento;

 //   private String presença;     ..... colocar como polimorfismo na aparte 3 do menu  

    public Aluno(String nome, String maricula, String nascimento) {
        this.nome = nome;
        this.maricula = maricula;
        this.nascimento = nascimento;
    }
    
    public String getNome() {
        return this.nome;
    }
    public String getMaricula() {
        return this.maricula;
    }
    public String getNascimento() {
        return this.nascimento;
    }
    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Matricula: " + getMaricula()); 
        System.out.println("Nascimento: " + getNascimento());
    }
}
