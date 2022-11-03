package Exercicio01.model;

public class ClientModel {
    private String nome;
    private String email;
    private String senha;
    private String cpf;
    private String telefone;

    public ClientModel(String nome, String email, String senha, String cpf, String telefone) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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
        System.out.println("Dados do funcionário");
        System.out.println("Nome: "+nome);
        System.out.println("Email: "+email);
        System.out.println("Senha: "+senha);
        System.out.println("CPF: "+cpf);
        System.out.println("Telefone: "+telefone);
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
