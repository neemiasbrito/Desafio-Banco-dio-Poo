package one.digitalinnovation;

public interface ContaInterface {
    // metodo
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}
