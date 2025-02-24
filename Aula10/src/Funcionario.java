public class Funcionario extends Pessoa{
    // Atributos
    private String setor;
    private boolean trabalhando;

    // Métodos
    public Funcionario(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    public void mudarTrabalho(String novoSetor) {
        if (this.getTrabalhando()) {
            this.setSetor(novoSetor);
        }
    }

    // Métodos de Acesso
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
