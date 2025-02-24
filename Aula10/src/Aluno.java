public class Aluno extends Pessoa{
    // Atributos
    private int matricula;
    private String curso;

    // Métodos
    public Aluno(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    public void cancelarMatr() {
        this.setMatricula(0);
        this.setCurso(null);
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
