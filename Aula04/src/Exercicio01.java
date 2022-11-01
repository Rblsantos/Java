import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        int num;
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número para ver onde ele está localizado: ");
        num = leia.nextInt();

        //if(num < 10){

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == num) {
                System.out.println("O numero " + num + " está localizado na posição: " + i);
                break;
            }
            else if (i == vetor.length - 1){
                System.out.println("O numero " + num + " não foi encontrado!");
            }
        }
        //}







    }
}
