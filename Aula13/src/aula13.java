public class aula13 {
    public static void main(String[] args) throws Exception {
        Cachorro c = new Cachorro();

        c.reagir("olá");
        c.reagir("Vai Apanhar");
        c.reagir(11);
        c.reagir(21);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
    }
}
