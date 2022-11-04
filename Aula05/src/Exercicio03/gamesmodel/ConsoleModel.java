package Exercicio03.gamesmodel;
public class ConsoleModel extends GamesModel {
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ConsoleModel(String titulo, int codigo, String plataforma, double preco, int lancamento, String modelo) {
        super(titulo, codigo, plataforma, preco, lancamento);
        this.modelo = modelo;



    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Modelo do console: "+modelo);
    }
}





