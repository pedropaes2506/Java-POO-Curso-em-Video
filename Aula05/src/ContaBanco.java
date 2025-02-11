public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Método Construtor
    public ContaBanco() {
        this.setSaldo(0.0f);
        this.setStatus(false);
    }

    // Métodos Específicos
    public void estadoAtual() {
        System.out.println("====================");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("====================");
    }

    public void abrirConta(String tipo) {
        this.setStatus(true);
        this.setTipo(tipo);

        if (tipo == "cc") {
            this.setSaldo(50.0f);
        }
        else if (tipo == "cp") {
            this.setSaldo(150.0f);
        }

        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        float saldo = this.getSaldo();

        if (saldo > 0) {
            System.out.println("Conta com dinheiro");
        }
        else if (saldo < 0) {
            System.out.println("Conta em débito");
        }
        else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float valor) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }
        else {
            System.out.println("Impossível depositar");
        }
    }

    public void sacar(float valor) {

        if (this.getStatus()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }
            else {
                System.out.println("Saldo insuficiente");
            }
        }
        else {
            System.out.println("Impossível sacar");
        }
    }

    public void pagarMensal() {
        float mensalidade = 0;

        if (tipo == "cc") {
            mensalidade = 12;
        }
        else if (tipo == "cp") {
            mensalidade = 20;
        }

        if (this.getStatus()) {
            if (this.getSaldo() >= mensalidade) {
                this.setSaldo(this.getSaldo() - mensalidade);
                System.out.println("Mensalidade paga!");
            }
            else {
                System.out.println("Saldo insuficiente");
            }
        }
        else {
            System.out.println("Impossível pagar");
        }
    }

    // Métodos de Acesso
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
