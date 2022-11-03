package Exercicio02.model;

public class FuncionarioModel {
    private String nome;
    private String email;
    private String endereco;
    private String cpf;
    private String telefone;

    public FuncionarioModel(String nome, String email, String endereco, String cpf, String telefone) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void visualizar (){
        System.out.println("Dados do Funcionário");
        System.out.println("Nome: "+nome);
        System.out.println("Email: "+email);
        System.out.println("Endereço: "+ endereco);
        System.out.println("CPF: "+cpf);
        System.out.println("Telefone: "+telefone);
        System.out.println("-------------------------------------------------------------------------------------------");
    }
}
