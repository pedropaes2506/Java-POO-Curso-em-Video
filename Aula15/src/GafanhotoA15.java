public class GafanhotoA15 extends PessoaA15{
    private String login;
    private int totAssistido;

    // Método Construtor
    public GafanhotoA15(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    // Métodos
    public void viuMaisUm() {
        
    }

    @Override
    protected void ganharExp() {

    }

    @Override
    public String toString() {
        return super.toString() + "\nGafanhoto [login=" + login + ", totAssistido=" + totAssistido + "]";
    }

    // Métodos de Acesso
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
}
