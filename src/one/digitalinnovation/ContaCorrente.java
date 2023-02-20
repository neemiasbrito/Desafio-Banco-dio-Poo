package one.digitalinnovation;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("*** Extrado Conta Corrente ***");
        super.imprimirIonforComuns();
    }
}
