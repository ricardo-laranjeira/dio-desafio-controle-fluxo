import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        int parametro1, parametro2;

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        parametro1 = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        parametro2 = terminal.nextInt();

        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e);
        }
    }
    static void contar (int value1, int value2) throws ParametrosInvalidosException {
        if (value1 > value2) {
            throw new ParametrosInvalidosException("O primeiro parametro deve menor que o segundo");
        }
        int contagem = value2 - value1;
        for (int i = 0; i < contagem; i++){
            System.out.println("Imprimindo o número " + (i+1));
        }
    }
}