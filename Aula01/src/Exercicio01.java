import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        double  salario, abono, novoSalario;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o valor do seu salário: R$");
        salario = leia.nextDouble();
        System.out.print("Digite o valor do abono: R$");
        abono = leia.nextDouble();

        novoSalario = salario + abono;

        System.out.println("\nSeu novo salário é de : R$" + (novoSalario));



    }
}
