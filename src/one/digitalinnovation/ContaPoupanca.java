package one.digitalinnovation;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("*** Extrado Conta Poupança ***");
        super.imprimirIonforComuns();
    }

}
