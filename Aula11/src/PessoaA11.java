public abstract class PessoaA11 {
    // Atributos
    private String nome;
    private int idade;
    private String sexo;

    // Métodos
    @Override
    public String toString() {
        return "PessoaA11 [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
    }

    public final void fazerAniv() {
        this.setIdade(this.getIdade() + 1);
    }

    // Métodos de Acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
