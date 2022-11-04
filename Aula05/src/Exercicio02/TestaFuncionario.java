package Exercicio02;

import Exercicio02.model.FuncionarioModel;
import Exercicio02.model.GerenteModel;
import Exercicio02.model.VendedorModel;

public class TestaFuncionario {
    public static void main(String[] args) {
        FuncionarioModel ruan = new FuncionarioModel("Ruan", "ruan.bsantos@mercadolivre.com",
                "Rua da ladeira, 51", "48489-5125", "94848-5862");
        FuncionarioModel guilherme = new FuncionarioModel("Guilherme","onlyguilherme.com",
                "Rua das pintangas,95","9595-9611","96666-4444");


        FuncionarioModel vendedor = new VendedorModel("Ruan", "ruan.bsantos@mercadolivre.com", "Rua das pintangas,95", "59595-569459", "9594-265169","25 planos");
        FuncionarioModel gerente = new GerenteModel("Guilherme","guilherme@mercadolivre.com","Rua das laranjas, 625", "2626-20626", "92155-3624", "25000");



        ruan.visualizar ();
        guilherme.visualizar ();

        vendedor.visualizar();
        gerente.visualizar();


    }
}
