import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        
        ArrayList<AlunoRegular> alunosRegulares = new ArrayList<>();
        ArrayList<AlunoEspecial> alunosEspeciais = new ArrayList<>();

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
                // Modo aluno
                do {
                    System.out.println("===== MENU =====");
                    System.out.println("1. cadastro aluno");
                    System.out.println("2. lista de alunos");
                    System.out.println("3. matricula/trancame1nto de turma");
                    System.out.println("4. Voltar ao menu principal");
                    System.out.print("Escolha uma opção: ");
                    opcao = sc.nextInt();
        
                    switch (opcao) {
                        case 1:
                        // Cadastro de aluno
                            do {
                                System.out.println("===== MENU =====");
                                System.out.println("1. Adicionar aluno regular!");
                                System.out.println("2. Adicionar aluno especial!");
                                System.out.println("3. editar aluno!");
                                System.out.println("4. Remover aluno!");
                                System.out.println("5. Voltar ao menu principal");
                                System.out.print("Escolha uma opção: ");
                                opcao = sc.nextInt();
                                sc.nextLine(); // Consumir quebra de linha
        
                                switch (opcao) {
                                    case 1:
                                        // Cadastro de aluno regular
                                        System.out.println("Digite o nome do aluno:");
                                        String nomeRegular = sc.nextLine();
                                        System.out.println("Digite a matrícula do aluno:");
                                        String matriculaRegular = sc.nextLine();
                                        System.out.println("Digite a data de nascimento do aluno:");
                                        String nascimentoRegular = sc.nextLine();
                                        System.out.println("Digite o curso do aluno:");
                                        String curso = sc.nextLine();
                                        System.out.println("Digite o período do aluno:");
                                        String periodoRegular = sc.nextLine();
                                        System.out.println("Digite o turno do aluno:");
                                        String turnoRegular = sc.nextLine();
                                        System.out.println("Digite a nota do aluno:");
                                        int nota = sc.nextInt();
                                        sc.nextLine(); // Consumir quebra de linha
        
                                        alunosRegulares.add(new AlunoRegular(nomeRegular, matriculaRegular, nascimentoRegular, curso, periodoRegular, turnoRegular, nota));
                                        System.out.println("Aluno regular cadastrado com sucesso!");
                                        break;
        
                                    case 2:
                                        // Cadastro de aluno especial
                                        System.out.println("Digite o nome do aluno:");
                                        String nomeEspecial = sc.nextLine();
                                        System.out.println("Digite a matrícula do aluno:");
                                        String matriculaEspecial = sc.nextLine();
                                        System.out.println("Digite a data de nascimento do aluno:");
                                        String nascimentoEspecial = sc.nextLine();
                                        System.out.println("Digite o período do aluno:");
                                        String periodoEspecial = sc.nextLine();
                                        System.out.println("Digite o turno do aluno:");
                                        String turnoEspecial = sc.nextLine();
        
                                        alunosEspeciais.add(new AlunoEspecial(nomeEspecial, matriculaEspecial, nascimentoEspecial, periodoEspecial, turnoEspecial));
                                        System.out.println("Aluno especial cadastrado com sucesso!");
                                        break;
        
                                    
                                    case 3:
                                    System.out.println("===== EDITAR ALUNO =====");
                                    System.out.println("Digite o nome do aluno que deseja editar:");
                                    String nomeEditar = sc.nextLine();
                                
                                    boolean encontrado = false;
                                
                                    // Procurar em alunos regulares
                                    for (AlunoRegular aluno : alunosRegulares) {
                                        if (aluno.getNome().equalsIgnoreCase(nomeEditar)) {
                                            System.out.println("Aluno encontrado! Insira os novos dados:");
                                            System.out.println("Digite o novo nome do aluno:");
                                            aluno.setNome(sc.nextLine());
                                            System.out.println("Digite a nova matrícula do aluno:");
                                            aluno.setMatricula(sc.nextLine());
                                            System.out.println("Digite a nova data de nascimento do aluno:");
                                            aluno.setNascimento(sc.nextLine());
                                            System.out.println("Digite o novo curso do aluno:");
                                            aluno.setCurso(sc.nextLine());
                                            System.out.println("Digite o novo período do aluno:");
                                            aluno.setPeriodo(sc.nextLine());
                                            System.out.println("Digite o novo turno do aluno:");
                                            aluno.setTurno(sc.nextLine());
                                            System.out.println("Digite a nova nota do aluno:");
                                            aluno.setNota(sc.nextInt());
                                            sc.nextLine(); // Consumir quebra de linha
                                            System.out.println("Dados do aluno regular atualizados com sucesso!");
                                            encontrado = true;
                                            break;
                                        }
                                    }
                                
                                    // Procurar em alunos especiais
                                    if (!encontrado) {
                                        for (AlunoEspecial aluno : alunosEspeciais) {
                                            if (aluno.getNome().equalsIgnoreCase(nomeEditar)) {
                                                System.out.println("Aluno encontrado! Insira os novos dados:");
                                                System.out.println("Digite o novo nome do aluno:");
                                                aluno.setNome(sc.nextLine());
                                                System.out.println("Digite a nova matrícula do aluno:");
                                                aluno.setMatricula(sc.nextLine());
                                                System.out.println("Digite a nova data de nascimento do aluno:");
                                                aluno.setNascimento(sc.nextLine());
                                                System.out.println("Digite o novo período do aluno:");
                                                aluno.setPeriodo(sc.nextLine());
                                                System.out.println("Digite o novo turno do aluno:");
                                                aluno.setTurno(sc.nextLine());
                                                System.out.println("Dados do aluno especial atualizados com sucesso!");
                                                encontrado = true;
                                                break;
                                            }
                                        }
                                    }
                                
                                    if (!encontrado) {
                                        System.out.println("Aluno não encontrado!");
                                    }
                                    break;
                                    case 4:
                                    System.out.println("===== REMOVER ALUNO =====");
                                    System.out.println("Digite o nome do aluno que deseja remover:");
                                    String nomeRemover = sc.nextLine();
                                
                                    encontrado = false;
                                
                                    // Remover de alunos regulares
                                    for (int i = 0; i < alunosRegulares.size(); i++) {
                                        if (alunosRegulares.get(i).getNome().equalsIgnoreCase(nomeRemover)) {
                                            alunosRegulares.remove(i);
                                            System.out.println("Aluno regular removido com sucesso!");
                                            encontrado = true;
                                            break;
                                        }
                                    }
                                
                                    // Remover de alunos especiais
                                    if (!encontrado) {
                                        for (int i = 0; i < alunosEspeciais.size(); i++) {
                                            if (alunosEspeciais.get(i).getNome().equalsIgnoreCase(nomeRemover)) {
                                                alunosEspeciais.remove(i);
                                                System.out.println("Aluno especial removido com sucesso!");
                                                encontrado = true;
                                                break;
                                            }
                                        }
                                    }
                                
                                    if (!encontrado) {
                                        System.out.println("Aluno não encontrado!");
                                    }
                                    break;
        
                                    case 5:
                                        System.out.println("Voltando ao menu principal...");
                                        break;
        
                                    default:
                                        System.out.println("Opção inválida! Tente novamente.");
                                    }
                                } while (opcao != 5);
                                break;
                            
        
                        case 2:
                            // Listar alunos
                            System.out.println("===== Lista de Alunos Regulares =====");
                            for (AlunoRegular aluno : alunosRegulares) {
                                aluno.imprimir();
                                System.out.println("------------------------");
                            }
                        
                            System.out.println("===== Lista de Alunos Especiais =====");
                            for (AlunoEspecial aluno : alunosEspeciais) {
                                aluno.imprimir();
                                System.out.println("------------------------");
                            }
                        
                            // Salvar os dados no arquivo .txt
                            try (BufferedWriter writer = new BufferedWriter(new FileWriter("alunos.txt"))) {
                                writer.write("===== Lista de Alunos Regulares =====\n");
                                for (AlunoRegular aluno : alunosRegulares) {
                                    writer.write(aluno.toString() + "\n"); // Certifique-se de que o método toString() está implementado
                                }
                        
                                writer.write("\n===== Lista de Alunos Especiais =====\n");
                                for (AlunoEspecial aluno : alunosEspeciais) {
                                    writer.write(aluno.toString() + "\n"); // Certifique-se de que o método toString() está implementado
                                }
                        
                                System.out.println("Dados salvos no arquivo 'alunos.txt'.");
                            } catch (IOException e) {
                                System.out.println("Erro ao salvar os dados: " + e.getMessage());
                            }
                            break;
                        
                        case 3: 
                            //matricula/trancamento de turma
                                do {
                                    System.out.println("===== MENU =====");
                                    System.out.println("1. Matricula em disciplina!");
                                    System.out.println("2. Trancamento de disciplina!");
                                    System.out.println("3. Voltar para o modo aluno");
                                    System.out.print("Escolha uma opção: ");
                                    opcao = sc.nextInt();
                        
                                    switch (opcao) {
                                        case 1:
                                            System.out.println("Turmas disponiveis!");
                  //                          do { 
                   //                             System.out.println("Listas de turmas disponiveis!");
                     //                           System.out.print("Escolha uma opção: ");
                       //                         opcao = sc.nextInt();
//                                                switch (opcao) {
  //                                                  case 1:
    //                                                    System.out.println("Matricula em disciplina!");
      //                                                  break;
        //                                            default:
          //                                              System.out.println("Opção inválida! Tente novamente.");
            //                                    }
              //                              } while (opcao != 1);
                //                            break;               colocar codigo nas turma e colocar como a opicao de matricula
                                        case 2:
                                            System.out.println("trancamento!");
                                            break;
                                        case 3:
                                            System.out.println("voltar ao modo aluno");
                                            break;     
                                        default:
                                            System.out.println("Opção inválida! Tente novamente.");
                                    }
                                } while (opcao != 3);
                        case 4:
                            System.out.println("Saindo do programa...");
                            break;
                        default:
                            System.out.println("Opção inválida! Tente novamente.");
                        }
                        System.out.println(); 
                    } while (opcao != 4);
                case 2:
                // Modo disciplina/turma
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
            System.out.println();
        } while (opcao != 4);

        sc.close();
    }
}
// O esqueleto do projeto ta pronto falta adicionar cada funcao em cada parte do menu para a implementacao completa do projeto
// e adicionar as classes de aluno normal e especial, disciplina, turma, professor. 