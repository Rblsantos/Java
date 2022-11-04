package Exercicio02.model;

public class GerenteModel extends FuncionarioModel {
    private String plr;

    public void setPlr(String plr) {
        this.plr = plr;
    }

    public String getPlr() {
        return plr;
    }

    public GerenteModel(String nome, String email, String endereco, String cpf, String telefone, String plr) {
        super(nome, email, endereco, cpf, telefone);
        this.plr = plr;
    }


    public void visualizar() {
        super.visualizar();
        System.out.println("PLR: "+plr);
    }
}

