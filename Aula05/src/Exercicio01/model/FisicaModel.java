package Exercicio01.model;

public class FisicaModel extends ClientModel {

    private String cpf;

    public FisicaModel(String nome, String email, String senha, String telefone, String cpf) {
        super(nome, email, senha, telefone);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void visualizar() {
        super.visualizar();

        System.out.println("CPF: " + cpf);
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
