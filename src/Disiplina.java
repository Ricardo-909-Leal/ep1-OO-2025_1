public class Disiplina {
    private String nome;
    private String codigo;
    private int cargaHoraria;
    private String preRequisito;
    
    public Disiplina(String nome, String codigo, int cargaHoraria, String preRequisito) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.preRequisito = preRequisito;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getCodigo() {
        return this.codigo;
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }
    public String getPreRequisito() {
        return this.preRequisito;
    }
}
