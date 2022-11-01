import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        double[][] matriz = new double[10][4];
        Scanner leia = new Scanner(System.in);
        double[] vetor = new double[10];
        DecimalFormat df = new DecimalFormat(".#");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("\nDigite a " + (j + 1) + " nota do aluno " + (i + 1) + ": ");
                matriz[i][j] = leia.nextDouble();
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                vetor[i] += (matriz[i][j]) / 4;
            }
        }
        System.out.println("A média dos alun@s são: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(df.format(vetor[i]) + " | ");
        }


    }
}
