import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Modo aluno");
            System.out.println("2. Modo disciplina/turma");
            System.out.println("3. Modo avaliação/frequência ");
            System.out.println("4. Sair e salvar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    do {
                        System.out.println("===== MENU =====");
                        System.out.println("1. cadastro aluno");
                        System.out.println("2. lista de alunos");
                        System.out.println("3. matricula em turma ");
                        System.out.println("4. Trancamento");
                        System.out.println("5. Voltar ao menu principal");
                        System.out.print("Escolha uma opção: ");
                        opcao = sc.nextInt();
            
                        switch (opcao) {
                            case 1:
                                System.out.println("Adicionar aluno!");
                                break;
                            case 2:
                                System.out.print("lista completa: ");
                                break;
                            case 3:
                                do {
                                    System.out.println("===== MENU =====");
                                    System.out.println("1. ");
                                    System.out.println("2. Modo disciplina/turma");
                                    System.out.println("3. Voltar para o modo aluno");
                                    System.out.print("Escolha uma opção: ");
                                    opcao = sc.nextInt();
                        
                                    switch (opcao) {
                                        case 1:
                                            System.out.println("matricula em disiplina!");
                                            break;
                                        case 2:
                                            System.out.println("trancamento!");
                                            break;
                                        case 3:
                                            System.out.println("voltar ao modo aluno");
                                            break;     
                                    }
                                } while (opcao != 3);
                            case 5:
                                System.out.println("Saindo do programa...");
                                break;
                            default:
                                System.out.println("Opção inválida! Tente novamente.");
                        }
                        System.out.println(); // Linha em branco para separar as interações
                    } while (opcao != 5);
        
                    System.out.println("Você escolheu exibir uma mensagem!");
                    break;
                case 2:
                    do {
                        System.out.println("===== MENU =====");
                        System.out.println("1. Adicionar disciplina/turma!");
                        System.out.println("2. Turmas abertas!");
                        System.out.println("3. voltar ao menu principal");
                        System.out.print("Escolha uma opção: ");
                        opcao = sc.nextInt();
                        switch (opcao) {
                            case 1:
                                System.out.println("Adicionar disciplina/turma!");
                                break;
                            case 2:
                                System.out.println("Turmas abertas!");
                                break;
                            case 3:
                                System.out.println("voltar ao menu principal");
                                break;
                            default:
                                System.out.println("Opção inválida! Tente novamente.");
                        }
                    } while (opcao != 3);
                    
                    break;
                case 3:
                    do {
                        System.out.println("===== MENU =====");
                        System.out.println("1. Lançamento de notas!");
                        System.out.println("2. Lançamento de frequencia!");
                        System.out.println("3. Relatório de turmas!");
                        System.out.println("4. Relatório de alunos!");
                        System.out.println("5. Voltar ao menu principal");
                        System.out.print("Escolha uma opção: ");
                        opcao = sc.nextInt();

                        switch (opcao) {
                            case 1:
                                System.out.println("Lançamento de notas!");
                                break;
                            case 2:
                                System.out.println("Lançamento de frequencia!");
                                break;
                            case 3:
                                System.out.println("Relatório de turmas!");
                                break;
                            case 4:
                                System.out.println("Relatório de alunos!");
                                break;
                            case 5:
                                System.out.println("voltar ao menu principal");
                                break;
                            default:
                                System.out.println("Opção inválida! Tente novamente.");
                        }
                    } while (opcao != 5);
                    break;
                case 4:
                    System.out.println("Saindoe salvando...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            System.out.println(); // Linha em branco para separar as interações
        } while (opcao != 4);

        sc.close();
    }
}
// O esqueleto do projeto ta pronto falta adicionar cada funcao em cada parte do menu para a implementacao completa do projeto
// e adicionar as classes de aluno normal e especial, disciplina, turma, professor. 