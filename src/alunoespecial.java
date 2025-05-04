public class AlunoEspecial extends Aluno {

    private String periodo;
    private String turno;
    
    public AlunoEspecial(String nome, String maricula, String nascimento) {
        super(nome, maricula, nascimento);
        this.periodo = "a";
        this.turno = "a";
    }

}
