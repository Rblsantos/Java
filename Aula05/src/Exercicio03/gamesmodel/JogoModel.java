package Exercicio03.gamesmodel;
public class JogoModel extends GamesModel {
    private String faixaEtaria;

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public JogoModel(String titulo, int codigo, String plataforma, double preco, int lancamento, String faixaEtaria) {
        super(titulo, codigo, plataforma, preco, lancamento);
        this.faixaEtaria = faixaEtaria;





    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Faixa Etária do jogo: "+faixaEtaria);
    }
}
