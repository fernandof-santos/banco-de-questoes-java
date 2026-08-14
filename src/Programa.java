import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);
        ArrayList<String> perguntas = new ArrayList<>();

       while (true) {
        System.out.println("==== BANCO DE QUESTÕES ====");
        System.out.println(" ");
        System.out.println("1 - Cadastrar Questão");
        System.out.println("2 - Listar Questão");
        System.out.println("3 - Buscar Questão");
        System.out.println("4 - Atualizar Questão");
        System.out.println("5 - Remover Questão");
        System.out.println("0 - Sair");

        System.out.println(" ");

        System.out.print("Escolha uma opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();

           switch (opcao) {
               case 1:
                   System.out.println("==== CADASTRAR QUESTÃO ====");
                   System.out.println(" ");

                   System.out.print("Digite a pergunta: ");
                   String pergunta = sc.nextLine();
                   perguntas.add(pergunta);

                   System.out.print("Digite a resposta: ");

                   System.out.print("Digite a categoria: ");

                   System.out.println("Digite a dificuldade: ");

                   break;

               case 2:
                   System.out.println("  ");
                   break;

               case 3:
                   System.out.println("    ");
                   break;

               case 4:
                   System.out.println("   ");
                   break;

               case 5:
                   System.out.println("     ");
                   break;

               case 0:
                   System.out.println("Você encerrou o programa. ");


           }
        if (opcao == 0) {
            break;
        }

       }

    }
}
