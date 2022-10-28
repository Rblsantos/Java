import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero1, numero2, numero3, armazem;

        System.out.println("Digite o primeiro número a ser ordenado: ");
        numero1 = leia.nextInt();
        System.out.println("Digite o primeiro segundo a ser ordenado: ");
        numero2 = leia.nextInt();
        System.out.println("Digite o primeiro terceiro a ser ordenado: ");
        numero3 = leia.nextInt();

        if (numero1>numero2){
            armazem = numero1;
            numero1 = numero2;
            numero2 = armazem;
        }
        if (numero2>numero3){
            armazem = numero2;
            numero2 = numero3;
            numero3 = armazem;
        }
        if (numero1>numero2){
            armazem = numero1;
            numero1 = numero2;
            numero2 = armazem;
        }
        System.out.println(numero1 + " "+ numero2 + " "+numero3);
    }
}
