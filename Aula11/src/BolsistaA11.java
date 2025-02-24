public class BolsistaA11 extends AlunoA11{
    // Atributos
    private int bolsa;
    
    // Métodos
    public void renovarBolsa() {
        System.out.println("Renovando bolsa");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade de bolsista");
    }

    // Métodos de Acesso
    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}
