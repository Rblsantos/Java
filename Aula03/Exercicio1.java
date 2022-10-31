import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner leia = new Scanner(System.in);


        System.out.println("Digite o primeiro número: ");
        num1 = leia.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = leia.nextInt();


        if (num1 > num2) {

            for (; num1 > num2; num1 = 0) {
                System.out.println("O intervalo digitado é inválido! O primeiro número deve ser menor do que o segundo número.");
                break;
            }
        }

        else if (num1 % 3 == 0 && num1 % 5 == 0 && num2 % 3 == 0 && num2 % 5 == 0) {
            System.out.println(num1 + " é multiplo de 5 e 3.");
            System.out.println(num2 + " é multiplo de 5 e 3.");
        }


    }
}
