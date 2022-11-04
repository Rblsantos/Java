package Exercicio03;

import Exercicio03.gamesmodel.ConsoleModel;
import Exercicio03.gamesmodel.GamesModel;
import Exercicio03.gamesmodel.JogoModel;

public class Games {
    public static void main(String[] args) {
        GamesModel Burnout = new GamesModel("Burnout",123,"Console",159.55,2004);
        GamesModel SlynCooper = new GamesModel("Slyn Cooper",4321,"Console",19.00,2002);

        Burnout.visualizar();
        SlynCooper.visualizar();

        GamesModel GodOfWar = new ConsoleModel("God of War",4562,"Console", 98.55,2001,"Xbox");
        GamesModel AssassinsCreed = new ConsoleModel("Assassins Creed", 36578,"Console",125.12,  2003,"Playstation");

        GodOfWar.visualizar();
        AssassinsCreed.visualizar();

        GamesModel GodOfWar2 = new JogoModel("God of War",4562,"Console",105.20,2001, "+14");
        GamesModel AssassinsCreed2 = new JogoModel("Assassins Creed", 185189,"Console",123.45,2003,"+16");

        GodOfWar2.visualizar();
        AssassinsCreed2.visualizar();

    }
}
