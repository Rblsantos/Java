package Exercicio01.model;

public class JuridicaModel extends ClientModel{
    private String cnpj;

    public JuridicaModel(String nome, String email, String senha, String telefone, String cnpj) {
        super(nome, email, senha, telefone);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void visualizar() {
        super.visualizar();

        System.out.println("CNPJ: " + cnpj);
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
