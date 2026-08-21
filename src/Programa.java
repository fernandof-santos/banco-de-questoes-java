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
        System.out.println("3 - Atualizar Questão");
        System.out.println("4 - Remover Questão");
        System.out.println("5 - Simulado");
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

                   for (int i = 0; i < perguntas.size(); i++) {
                       System.out.println("Questão " + (i + 1) + " "+ perguntas.get(i));
                       System.out.println(" ");
                       System.out.println("A) " +alternativasA.get(i));
                       System.out.println("B) " +alternativasB.get(i));
                       System.out.println("C) " +alternativasC.get(i));
                       System.out.println("D) " +alternativasD.get(i));
                       System.out.println("Resposta correta: " + respostasCorretas.get(i));
                       System.out.println(" ");

                   }
                   break;

               case 3:
                   System.out.println("===== Atualizar Questão =====");
                   System.out.println(" ");
                   System.out.print("Digite o número da questão que deseja atualizar: ");
                   int numeroQuestao = sc.nextInt();

                   sc.nextLine();

                   int indice = numeroQuestao - 1;
                   System.out.println("Pergunta Atual: " + perguntas.get(indice));
                   System.out.println(" ");

                   System.out.print("Digite a nova pergunta: ");
                   String novaPergunta = sc.nextLine();
                   perguntas.set(indice, novaPergunta);

                   System.out.println("Alternativa A atual: " + alternativasA.get(indice));
                   System.out.println(" ");
                   System.out.print("Digite a nova Alternativa A: ");
                   String novaAlternativaA = sc.nextLine();
                   alternativasA.set(indice, novaAlternativaA);

                   System.out.println("Alternativa B atual: " + alternativasB.get(indice));
                   System.out.println(" ");
                   System.out.print("Digite a nova Alternativa B: ");
                   String novaAlternativaB = sc.nextLine();
                   alternativasB.set(indice, novaAlternativaB);

                   System.out.println("Alternativa C atual: " + alternativasC.get(indice));
                   System.out.println(" ");
                   System.out.print("Digite a nova Alternativa C: ");
                   String novaAlternativaC = sc.nextLine();
                   alternativasC.set(indice, novaAlternativaC);

                   System.out.println("Alternativa D atual: " + alternativasD.get(indice));
                   System.out.println(" ");
                   System.out.print("Digite a nova Alternativa D: ");
                   String novaAlternativaD = sc.nextLine();
                   alternativasD.set(indice, novaAlternativaD);

                   System.out.println("Resposta Atual Correta: " + respostasCorretas.get(indice));
                   System.out.println(" ");
                   System.out.print("Digite a nova alternativa correta: ");
                   String novaRespostaCorretas = sc.nextLine().toUpperCase();

                   while (! (novaRespostaCorretas.equals("A") || novaRespostaCorretas.equals("B") || novaRespostaCorretas.equals("C") || novaRespostaCorretas.equals("D") ) ){
                       System.out.println("Resposta Inválida!");
                       System.out.print("Digite novamente: ");
                       novaRespostaCorretas = sc.nextLine().toUpperCase();

                   }

                   respostasCorretas.set(indice, novaRespostaCorretas);

                   System.out.println("Questão atualizada com sucesso. ");


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
