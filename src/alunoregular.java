public class AlunoRegular extends Aluno {
    private String curso;
    private String periodo;
    private String turno;
    private int nota;
    
    public AlunoRegular(String nome, String maricula, String nascimento) {
        super(nome, maricula, nascimento);
        this.curso = "";
        this.periodo = "";
        this.turno = "";
        this.nota = 0;
    }
}
