package Exercicio02;

import Exercicio02.model.FuncionarioModel;

public class TestaFuncionario {
    public static void main(String[] args) {
        FuncionarioModel Ruan = new FuncionarioModel("Ruan", "ruan.bsantos@mercadolivre.com",
                "Rua da ladeira, 51", "48489-5125", "94848-5862");
        FuncionarioModel Guilherme = new FuncionarioModel("Guilherme","onlyguilherme.com",
                "Rua das pintangas,95","9595-9611","96666-4444");

        Ruan.visualizar ();
        Guilherme.visualizar ();

    }
}
