package Exercicio03.gamesmodel;

public class GamesModel {
    private String titulo;
    private int codigo;
    private String plataforma;
    private double preco;
    private int lancamento;

    public GamesModel(String titulo, int codigo, String plataforma, double preco, int lancamento) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.plataforma = plataforma;
        this.preco = preco;
        this.lancamento = lancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getLancamento() {
        return lancamento;
    }

    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }

    public void visualizar() {
        System.out.println("Dados do Jogo");
        System.out.println("Titulo: " + titulo);
        System.out.println("Código: " + codigo);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Preço: " + preco);
        System.out.println("Data de Lançamento: " + lancamento);
        System.out.println("-------------------------------------------------------------------------------------------");
    }
}
