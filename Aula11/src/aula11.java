public class aula11 {
    public static void main(String[] args) throws Exception {
        VisitanteA11 v1 = new VisitanteA11();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());

        AlunoA11 a1 = new AlunoA11();
        a1.setNome("Cláudio");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.pagarMensalidade();
        System.out.println(a1.toString());

        BolsistaA11 b1 = new BolsistaA11();
        b1.setNome("Jubileu");
        b1.setIdade(17);
        b1.setSexo("M");
        b1.setMatricula(2222);
        b1.setCurso("Letras");
        b1.renovarBolsa();
        b1.pagarMensalidade();
        System.out.println(b1.toString());
    }
}
