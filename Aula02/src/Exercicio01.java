import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero1,numero2, numero3;

        System.out.print("Digite o primeiro número: ");
        numero1 = leia.nextInt();
        System.out.print("Digite o segundo número: ");
        numero2 = leia.nextInt();
        System.out.print("Digite o terceiro número: ");
        numero3 = leia.nextInt();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println(numero1 + " é o maior número.");
        }
        else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println(numero2 + " é o maior número.");
        }
        else System.out.println(numero3 + " é o maior número.");


    }
}
