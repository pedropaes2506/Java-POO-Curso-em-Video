public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }

    void rabiscar() {
        if (tampada) {
            System.out.println("ERRO!");
        }
        else {
            System.out.println("Rabisco");
        }
    }

    void tampar() {
        tampada = true;
    }

    void destampar() {
        tampada = false;
    }
}
