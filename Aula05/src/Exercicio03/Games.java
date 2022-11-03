package Exercicio03;

import Exercicio03.gamesmodel.GamesModel;

public class Games {
    public static void main(String[] args) {
        GamesModel Burnout = new GamesModel("Burnout",123,"Playstation",159.55,2004);
        GamesModel SlynCooper = new GamesModel("Slyn Cooper",4321,"Playstation",19.00,2002);

        Burnout.visualizar();
        SlynCooper.visualizar();

    }
}
