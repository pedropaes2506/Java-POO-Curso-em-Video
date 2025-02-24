public class aula10 {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa("Pedro", 19, "M");
        Aluno p2 = new Aluno("Maria", 18, "F");
        Professor p3 = new Professor("Cláudio", 42, "M");
        Funcionario p4 = new Funcionario("Fabiana", 27, "F");

        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
