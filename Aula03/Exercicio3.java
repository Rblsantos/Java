import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int idade, contador = 0, contador1 = 0;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite uma idade: ");
        idade = leia.nextInt();
        if (idade >= 0) {
            while (idade >= 0) {
                System.out.print("Digite uma idade: ");
                idade = leia.nextInt();
                if (idade<21){
                    contador++;
                }
                if (idade>50){
                    contador1++;
                }
            }

            System.out.println("Total de pessoas menores de 21 anos: "+ contador);
            System.out.println("Total de pessoas maiores de 50 anos: "+ contador1);
        }
        else {

        }
    }
}


