package Exercicio02.model;

public class VendedorModel extends FuncionarioModel {

    private String meta;

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public VendedorModel(String nome, String email, String endereco, String cpf, String telefone, String meta) {
        super(nome, email, endereco, cpf, telefone);
        this.meta = meta;



    }

    public void visualizar() {
        super.visualizar();
        System.out.println("Meta: " + meta);
    }
}
