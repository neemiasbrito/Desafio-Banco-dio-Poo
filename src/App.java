import one.digitalinnovation.Banco;
import one.digitalinnovation.Cliente;
import one.digitalinnovation.Conta;
import one.digitalinnovation.ContaCorrente;
import one.digitalinnovation.ContaInterface;
import one.digitalinnovation.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente Davi = new Cliente();
        Davi.setNome("Davi");
        Conta cc1 = new ContaCorrente(Davi);
        cc1.depositar(200);

        Cliente Carolinny = new Cliente();
        Carolinny.setNome("Carolinny");
        Conta cc2 = new ContaCorrente(Carolinny);
        cc2.depositar(300);

        Cliente Jose = new Cliente();
        Jose.setNome("José");
        Conta cc3 = new ContaCorrente(Jose);
        cc3.depositar(400);

        Cliente Luiz = new Cliente();
        Luiz.setNome("Luiz");
        Conta cp1 = new ContaPoupanca(Luiz);
        cp1.depositar(500);

        Cliente Sandra = new Cliente();
        Sandra.setNome("Sandra");
        Conta cp2 = new ContaPoupanca(Sandra);
        cp2.depositar(600);

        cc3.transferir(50, cc1);
        cc3.imprimirExtrato();
        cp1.transferir(70, cp2);
        cp2.imprimirExtrato();

        cc1.getSaldo();
        cc1.imprimirExtrato();
        cc2.getSaldo();
        cc2.imprimirExtrato();
        cp1.getSaldo();
        cp1.imprimirExtrato();

    }
}
