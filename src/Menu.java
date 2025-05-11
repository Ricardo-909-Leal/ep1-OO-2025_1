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
            System.out.println("00. Sair e salvar");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                // Modo aluno
                do {
                    System.out.println("===== MENU =====");
                    System.out.println("1. cadastro/edição de aluno");
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
                                System.out.println("5. Voltar ao modo aluno");
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

                                        if (verificarDuplicidadeDeMatricula(matriculaRegular)) {
                                            System.out.println("Erro: Matrícula já cadastrada!");
                                            break;
                                        }
                                        System.out.println("Digite a data de nascimento do aluno:");
                                        String nascimentoRegular = sc.nextLine();
                                        System.out.println("Digite o curso do aluno:");
                                        String curso = sc.nextLine();
                                        System.out.println("Digite o semestre do aluno:");
                                        String semestreRegular = sc.nextLine();
                                        System.out.println("Digite o turno do aluno:");
                                        String turnoRegular = sc.nextLine();
                                        sc.nextLine(); // Consumir quebra de linha
        
                                        alunosRegulares.add(new AlunoRegular(nomeRegular, matriculaRegular, nascimentoRegular, curso, semestreRegular, turnoRegular));
                                        System.out.println("Para cadastrar o aluno sair do progama!");
                                        break;
        
                                    case 2:
                                        // Cadastro de aluno especial
                                        System.out.println("Digite o nome do aluno:");
                                        String nomeEspecial = sc.nextLine();
                                        System.out.println("Digite a matrícula do aluno:");
                                        String matriculaEspecial = sc.nextLine();

                                        if (verificarDuplicidadeDeMatricula(matriculaEspecial)) {
                                            System.out.println("Erro: Matrícula já cadastrada!");
                                            break;
                                        }
                                        System.out.println("Digite a data de nascimento do aluno:");
                                        String nascimentoEspecial = sc.nextLine();
                                        System.out.println("Digite o semestre do aluno:");
                                        String semestreEspecial = sc.nextLine();
                                        System.out.println("Digite o turno do aluno:");
                                        String turnoEspecial = sc.nextLine();
        
                                        alunosEspeciais.add(new AlunoEspecial(nomeEspecial, matriculaEspecial, nascimentoEspecial, semestreEspecial, turnoEspecial));
                                        System.out.println("Para cadastrar o aluno sair do progama!");
                                        break;
        
                                    
                                        case 3:
                                            System.out.println("===== EDITAR ALUNO =====");
                                            System.out.println("Digite a matrícula do aluno que deseja editar:");
                                            String matriculaEditar = sc.nextLine();

                                            String alunoExistente = buscarAlunoNoArquivo(matriculaEditar);
                                            if (alunoExistente == null) {
                                                System.out.println("Aluno não encontrado!");
                                            } else {
                                                System.out.println("Aluno encontrado: " + alunoExistente);
                                                System.out.println("Insira os novos dados do aluno:");

                                                System.out.println("Digite o novo nome do aluno:");
                                                String novoNome = sc.nextLine();
                                                System.out.println("Digite a nova matrícula do aluno:");
                                                String novaMatricula = sc.nextLine();
                                                System.out.println("Digite a nova data de nascimento do aluno:");
                                                String novoNascimento = sc.nextLine();
                                                System.out.println("Digite o novo curso do aluno:");
                                                String novoCurso = sc.nextLine();
                                                System.out.println("Digite o novo semestre do aluno:");
                                                String novoSemestre = sc.nextLine();
                                                System.out.println("Digite o novo turno do aluno:");
                                                String novoTurno = sc.nextLine();

                                                // Formatar os novos dados do aluno
                                                String novosDados = "Nome: " + novoNome + ", Matrícula: " + novaMatricula + ", Nascimento: " + novoNascimento +
                                                                    ", Curso: " + novoCurso + ", Semestre: " + novoSemestre + ", Turno: " + novoTurno;

                                                // Atualizar o aluno no arquivo
                                                editarAlunoNoArquivo(matriculaEditar, novosDados);
                                            }
                                            break;
                                        case 4:
                                            System.out.println("===== REMOVER ALUNO =====");
                                            System.out.println("Digite a matrícula do aluno que deseja remover:");
                                            String matriculaRemover = sc.nextLine();

                                            String alunoExistenteRemover = buscarAlunoNoArquivo(matriculaRemover);
                                            if (alunoExistenteRemover == null) {
                                                System.out.println("Aluno não encontrado!");
                                            } else {
                                                System.out.println("Aluno encontrado: " + alunoExistenteRemover);
                                                System.out.println("Deseja realmente remover este aluno? (s/n)");
                                                String confirmacao = sc.nextLine();
                                                if (confirmacao.equalsIgnoreCase("s")) {
                                                    removerAlunoNoArquivo(matriculaRemover);
                                                } else {
                                                    System.out.println("Operação de remoção cancelada.");
                                                }
                                            }
                                            break;
            
                                    case 5:
                                        System.out.println("Voltando...");
                                        break;
        
                                    default:
                                        System.out.println("Opção inválida! Tente novamente.");
                                    }
                                } while (opcao != 5);
                            break;
        
                        case 2:                                                  
                            // Listar alunos
                            listarAlunosDoArquivo();
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
                                        // Aqui você adicionar a lógica para o trancamento de disciplina
                                        case 3:
                                            System.out.println("voltar ao modo aluno");
                                            break;   
                                        default:
                                            System.out.println("Opção inválida! Tente novamente.");
                                    }
                                } while (opcao != 3);
                        case 4:
                            System.out.println("Voltando ao menu principal...");
                            
                        default:
                            System.out.println("Opção inválida! Tente novamente.");
                        }
                        System.out.println(); 
                    } while (opcao != 4);
                    break;
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
                    // Modo avaliação/frequência
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
                case 00:
                    System.out.println("Saindo e salvando...");
                     // Salvar os dados no arquivo .txt
                     try (BufferedWriter writer = new BufferedWriter(new FileWriter("alunos.txt", true))) { // 'true' ativa o modo de acréscimo
 
                        for (AlunoRegular aluno : alunosRegulares) {
                            writer.write(aluno.toString() + "\n");
                        }


                        for (AlunoEspecial aluno : alunosEspeciais) {
                            writer.write(aluno.toString() + "\n");
                        }

                        System.out.println("Dados salvos no arquivo 'alunos.txt'.");
                    } catch (IOException e) {
                        System.out.println("Erro ao salvar os dados: " + e.getMessage());
                    }
                    break;
                    
                    
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            System.out.println();
        } while (opcao != 00);

        sc.close();
        
    }

    public static void atualizarArquivo(ArrayList<AlunoRegular> alunosRegulares, ArrayList<AlunoEspecial> alunosEspeciais) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("alunos.txt"))) { // Sobrescreve o arquivo
            writer.write("===== Lista de Alunos Regulares =====\n");
            for (AlunoRegular aluno : alunosRegulares) {
                writer.write(aluno.toString() + "\n");
            }
    
            writer.write("\n===== Lista de Alunos Especiais =====\n");
            for (AlunoEspecial aluno : alunosEspeciais) {
                writer.write(aluno.toString() + "\n");
            }
    
            System.out.println("Arquivo atualizado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao atualizar o arquivo: " + e.getMessage());
        }
    }

    public static boolean verificarDuplicidadeDeMatricula(String matricula) {
        try (Scanner scanner = new Scanner(new java.io.File("alunos.txt"))) {
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                if (linha.contains("Matrícula: " + matricula)) {
                    return true; // Matrícula já existe
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao verificar duplicidade: " + e.getMessage());
        }
        return false; // Matrícula não encontrada
    }

    public static String buscarAlunoNoArquivo(String matricula) {
        try (Scanner scanner = new Scanner(new java.io.File("alunos.txt"))) {
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                if (linha.contains("Matrícula: " + matricula)) {
                    return linha; // Retorna a linha do aluno encontrado
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
        return null; // Retorna null se o aluno não for encontrado
    }

    public static void removerAlunoNoArquivo(String matricula) {
        try {
            java.io.File arquivo = new java.io.File("alunos.txt");
            ArrayList<String> linhas = new ArrayList<>();
            boolean encontrado = false;
    
            // Ler todas as linhas do arquivo
            try (Scanner scanner = new Scanner(arquivo)) {
                while (scanner.hasNextLine()) {
                    String linha = scanner.nextLine();
                    if (linha.contains("Matrícula: " + matricula)) {
                        encontrado = true; // Ignora a linha do aluno a ser removido
                    } else {
                        linhas.add(linha); // Mantém as outras linhas
                    }
                }
            }
    
            // Reescrever o arquivo sem o aluno removido
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
                for (String linha : linhas) {
                    writer.write(linha);
                    writer.newLine();
                }
            }
    
            if (encontrado) {
                System.out.println("Aluno removido com sucesso!");
            } else {
                System.out.println("Aluno não encontrado!");
            }
        } catch (IOException e) {
            System.out.println("Erro ao remover o aluno: " + e.getMessage());
        }
    }
    
    public static void editarAlunoNoArquivo(String matricula, String novosDados) {
        try {
            java.io.File arquivo = new java.io.File("alunos.txt");
            ArrayList<String> linhas = new ArrayList<>();
            boolean encontrado = false;
    
            // Ler todas as linhas do arquivo
            try (Scanner scanner = new Scanner(arquivo)) {
                while (scanner.hasNextLine()) {
                    String linha = scanner.nextLine();
                    if (linha.contains("Matrícula: " + matricula)) {
                        linhas.add(novosDados); // Substitui a linha do aluno
                        encontrado = true;
                    } else {
                        linhas.add(linha); // Mantém as outras linhas
                    }
                }
            }
    
            // Reescrever o arquivo com as alterações
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
                for (String linha : linhas) {
                    writer.write(linha);
                    writer.newLine();
                }
            }
    
            if (encontrado) {
                System.out.println("Aluno editado com sucesso!");
            } else {
                System.out.println("Aluno não encontrado!");
            }
        } catch (IOException e) {
            System.out.println("Erro ao editar o arquivo: " + e.getMessage());
        }
    }
    public static void listarAlunosDoArquivo() {
        try (Scanner scanner = new Scanner(new java.io.File("alunos.txt"))) {
            System.out.println("===== Lista de Alunos =====");
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha); // Exibe cada linha do arquivo
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}


// O esqueleto do projeto ta pronto falta adicionar cada funcao em cada parte do menu para a implementacao completa do projeto
// e adicionar as classes de aluno normal e especial, disciplina, turma, professor. 