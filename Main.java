import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Arvore arvore = new Arvore();

        System.out.println("Quantos números deseja inserir?");
        int quantidade = entrada.nextInt();

        for (int i = 0; i < quantidade; i++) {

            System.out.println("Digite um número:");

            int valor = entrada.nextInt();

            arvore.inserir(new No(valor));
        }

        System.out.println("Digite um número para buscar:");

        int busca = entrada.nextInt();

        if (arvore.buscar(busca)) {

            System.out.println("Valor encontrado!");

        } else {

            System.out.println("Valor não encontrado!");
        }

        entrada.close();
    }
}