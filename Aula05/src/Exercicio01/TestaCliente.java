package Exercicio01;

import Exercicio01.model.ClientModel;
import Exercicio01.model.FisicaModel;
import Exercicio01.model.JuridicaModel;

public class TestaCliente {
    public static void main(String[] args) {
        ClientModel Ruan = new ClientModel("Ruan", "ruan.bsantos@mercadolivre.com", "1234",
                "987654-321");
        ClientModel Guilherme = new ClientModel("Guilherme", "onlyguilherme@mercadolivre.com", "1234",
                "54231-587");

        Ruan.visualizar();
        Guilherme.visualizar();

        ClientModel fisica1 = new FisicaModel("Ruan", "ruan.bsantos@mercadolivre.com", "1234", "987654-321","23548-89613");
        fisica1.visualizar();
        ClientModel fisica2 = new FisicaModel("Guilherme", "onlyguilherme@mercadolivre.com", "1234", "54231-587","489926-65154");
        fisica2.visualizar();

        ClientModel juridica = new JuridicaModel("Ruan.limited","ruanlimitado@limite.com", "1561581", "35 2541-6547", "98.172.146/0001-19");
        juridica.visualizar();
        ClientModel juridica2 = new JuridicaModel("Guilherme.limitado","guilhermelimitado@limite.com", "16516588", "35 3541-5687", "98.172.146/0001-19");
        juridica2.visualizar();



    }
}
