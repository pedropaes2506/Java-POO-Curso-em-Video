public class AlunoA11 extends PessoaA11{
    // Atributos
    private int matricula;
    private String curso;

    // Métodos
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade de aluno");
    }

    // Métodos de Acesso
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
