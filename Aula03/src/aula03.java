public class aula03 {
    public static void main(String[] args) throws Exception {
        Canetas c1 = new Canetas();

        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = true;

        c1.tampar();
        c1.status();
    }
}
