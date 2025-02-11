public class aula05 {
    public static void main(String[] args) throws Exception {
        ContaBanco c1 = new ContaBanco();
        ContaBanco c2 = new ContaBanco();

        c1.setNumConta(1111);
        c1.setDono("Jubileu");
        c1.abrirConta("cc");
        c1.depositar(300);
        c1.sacar(350);
        c1.fecharConta();

        c2.setNumConta(2222);
        c2.setDono("Creuza");
        c2.abrirConta("cp");
        c2.depositar(500);
        c2.sacar(100);
        c2.pagarMensal();

        c1.estadoAtual();
        c2.estadoAtual();
    }
}
