public class CanetaAula04 {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    public CanetaAula04(String m, String c, float p) {
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }

    //getter setter modelo
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }

    //getter setter cor
    public String getCor() {
        return this.cor;
    }
    public void setCor(String c) {
        this.cor = c;
    }

    //getter setter ponta
    public float getPonta() {
        return this.ponta;
    }
    public void setPonta (float p) {
        this.ponta = p;
    }

    //getter setter tampada
    public boolean getTampada() {
        return this.tampada;
    }
    public void setTampada(boolean t) {
        this.tampada = t;
    }

    public void tampar() {
        this.setTampada(true);
    }

    public void destampar() {
        this.setTampada(false);
    }

    public void status() {
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Tampada: " + this.getTampada());
    }
}
