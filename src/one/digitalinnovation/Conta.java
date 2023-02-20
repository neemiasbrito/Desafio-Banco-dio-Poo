package one.digitalinnovation;

public abstract class Conta implements ContaInterface {
    private static final int AGENCIA_PADRAO = 000001;
    private static int SEQUENCIAL = 1;

    // atributo de abstração
    protected int agencia; // private faz referencia a encapsulamento
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    //
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        // this.saldo = saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        // this.saldo = saldo + valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    // metodo get e set
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirIonforComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
