import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);
        ArrayList<String> perguntas = new ArrayList<>();
        ArrayList<String> alternativasA = new ArrayList<>();
        ArrayList<String> alternativasB = new ArrayList<>();
        ArrayList<String> alternativasC = new ArrayList<>();
        ArrayList<String> alternativasD = new ArrayList<>();
        ArrayList<String> respostasCorretas = new ArrayList<>();

       while (true) {
        System.out.println("==== BANCO DE QUESTÕES ====");
        System.out.println(" ");
        System.out.println("1 - Cadastrar Questão");
        System.out.println("2 - Listar Questão");
        System.out.println("3 - Buscar Questão");
        System.out.println("4 - Atualizar Questão");
        System.out.println("5 - Remover Questão");
        System.out.println("6 - Simulado");
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

                   System.out.print("Digite a alternativa A: ");
                   String alternativaA = sc.nextLine();
                   alternativasA.add(alternativaA);

                   System.out.print("Digite a alternativa B: ");
                   String alternativaB = sc.nextLine();
                   alternativasB.add(alternativaB);

                   System.out.print("Digite a alternativa C: ");
                   String alternativaC = sc.nextLine();
                   alternativasC.add(alternativaC);

                   System.out.print("Digite a alternativa D: ");
                   String alternativaD = sc.nextLine();
                   alternativasD.add(alternativaD);

                   System.out.print("Digite a resposta correta: ");
                   String resposta = sc.nextLine().toUpperCase();


                   while (! (resposta.equals("A") || resposta.equals("B") || resposta.equals("C") || resposta.equals("D"))) {
                       System.out.println("Resposta Inválida!");
                       System.out.println("Digite novamente: ");
                       resposta = sc.nextLine().toUpperCase();
                   }
                   respostasCorretas.add(resposta);
                   System.out.println(" ");
                   System.out.println("Questão cadastrada com sucesso!");
                   System.out.println (" ");

                   break;

               case 2:
                   System.out.println("===== QUESTÕES =====");
                   System.out.println(" ");

                   for (String questao: perguntas) {
                       System.out.println(questao);
                   }
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

               case 6:
                   System.out.println("      ");
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
