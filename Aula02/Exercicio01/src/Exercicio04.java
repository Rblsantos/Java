import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        int numero;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o número para saber se ele é ímpar ou par: ");
        numero = leia.nextInt();

        if (numero % 2 == 0.0) {
            System.out.println("O número é par");
        }
        else
            System.out.println("O número é impar");
    }
}
