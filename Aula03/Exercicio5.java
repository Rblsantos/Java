import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        int num, somaPositivo = 0;
        Scanner leia = new Scanner(System.in);

        do {
            System.out.print("Digite o valor: ");
            num= leia.nextInt();
            if (num > 0){
                somaPositivo += num;
            }
        }while ( num !=0 );

        System.out.println("A soma dos números positivos é: " + somaPositivo);




    }
}
