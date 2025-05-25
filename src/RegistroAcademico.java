public class RegistroAcademico {
    public double[] notas = new double[5]; // P1, P2, P3, L, S
    
    public int presencas = 0;

    public RegistroAcademico(double[] notas,int presencas) {
        this.notas = notas;
        this.presencas = presencas;
        
    }
    public double calcularMedia(String formaAvaliacao) {
        if (formaAvaliacao.equalsIgnoreCase("simples")) {
            double soma = 0;
            for (double nota : notas) soma += nota;
            return soma / 5;
        } else {
            return (notas[0] + notas[1] * 2 + notas[2] * 3 + notas[3] + notas[4]) / 8;
        }
    }

}