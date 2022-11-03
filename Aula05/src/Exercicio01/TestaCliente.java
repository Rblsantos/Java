package Exercicio01;

import Exercicio01.model.ClientModel;

public class TestaCliente {
    public static void main(String[] args) {
        ClientModel Ruan = new ClientModel("Ruan", "ruan.bsantos@mercadolivre.com", "1234",
                "987654-321","91234-5678");
        ClientModel Guilherme = new ClientModel("Guilherme", "onlyguilherme@mercadolivre.com", "1234",
                "54231-587", "96542-4123");

        Ruan.visualizar();
        Guilherme.visualizar();
    }
}
