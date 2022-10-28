import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade;
        System.out.print("Digite sua idade: ");
        idade = leia.nextInt();

        if (idade < 0)
            System.out.println("Sua idade é inválida ela não pode ser negativa!");
        else if (idade <= 14)
            System.out.println("Sua categoria é infantil");
        else if (idade < 18)
            System.out.println("Sua categoria é Juvenil");
        else
        System.out.println("Sua categoria é Adulto");
    }
}




