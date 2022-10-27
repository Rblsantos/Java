import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        int numero1, numero2, numero3, numero4, diferenca;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        numero1 = leia.nextInt();
        System.out.print("Digite o segundo valor: ");
        numero2 = leia.nextInt();
        System.out.print("Digite o terceiro valor: ");
        numero3 = leia.nextInt();
        System.out.print("Digite o quarto valor: ");
        numero4 = leia.nextInt();

        diferenca = (numero1*numero2)-(numero3*numero4);

        System.out.println("A diferença entre os valores é de: " + diferenca);

    }
}
