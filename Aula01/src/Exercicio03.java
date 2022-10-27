import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        double salarioBruto, adicionalNoturno, horasExtras, salarioLiquido, descontos = 200;
        Scanner leia = new Scanner(System.in);

        System.out.print("Coloque o valor do seu salário Bruto: R$ ");
        salarioBruto = leia.nextDouble();
        System.out.print("Coloque o valor do adicional noturno: R$ ");
        adicionalNoturno = leia.nextDouble();
        System.out.print("Coloque o valor das horas extras: R$ ");
        horasExtras = leia.nextDouble();

        salarioLiquido = salarioBruto + adicionalNoturno +((horasExtras)*5) - descontos;

        System.out.println("Seu salário liquído é de: " + salarioLiquido);
    }
}
