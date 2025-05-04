public class AlunoEspecial extends Aluno {

    private String periodo;
    private String turno;
    
    public AlunoEspecial(String nome, String maricula, String nascimento ,String periodo, String turno) {
        super(nome, maricula, nascimento);
        this.periodo = periodo;
        this.turno = turno;
    }
    @Override
    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Matricula: " + getMaricula()); 
        System.out.println("Nascimento: " + getNascimento());
        System.out.println("Periodo: " + periodo);
        System.out.println("Turno: " + turno);
    }
}
