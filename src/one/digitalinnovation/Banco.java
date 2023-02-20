package one.digitalinnovation;

import java.util.List;

public class Banco {
    // atributo de abstração
    protected String nome;
    private List<Conta> contas;

    // metodo Get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return List<Conta> return the contas
     */
    public List<Conta> getContas() {
        return contas;
    }

    /**
     * @param contas the contas to set
     */
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

}
