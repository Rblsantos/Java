import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        double nota = 0, media;
        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".0");

        for (int contador = 0; contador < 4; contador++) {
            System.out.print("Digite a nota do aluno correspondente ao " + (contador + 1) + " bimestre: ");
            nota += leia.nextDouble();
        }
        media = nota/4;

        System.out.println("A média das notas do aluno é igual a : " + df.format(media));

    }
}
