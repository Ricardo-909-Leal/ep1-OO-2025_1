import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        
        ArrayList<AlunoRegular> alunosRegulares = new ArrayList<>();
        ArrayList<AlunoEspecial> alunosEspeciais = new ArrayList<>();
        List<Disciplina> disciplinas = new ArrayList<>();

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
                    System.out.println("9. Voltar ao menu principal");
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
                        case 9:
                            System.out.println("Voltando ao menu principal...");
                            break;
                        default:
                            System.out.println("Opção inválida! Tente novamente.");
                        }
                        System.out.println(); 
                    } while (opcao != 9);
                    break;
                case 2:
                // Modo disciplina/turma
                    do {
                        System.out.println("=== MENU PRINCIPAL ===");
                        System.out.println("1. Cadastrar Disciplina");
                        System.out.println("2. Listar Disciplinas");
                        System.out.println("3. Criar Turma");
                        System.out.println("4. Listar Turmas");
                        System.out.println("9. Sair");
                        System.out.print("Escolha uma opção: ");
                        opcao = sc.nextInt();
                        sc.nextLine(); // consumir quebra de linha

                        switch (opcao) {
                            case 1:
                                // Cadastrar disciplina
                                cadastrarDisciplina();
                                break;
                            case 2:
                                // Listar disciplinas
                                System.out.println("===== LISTA DE DISCIPLINAS =====");
                                listarDisciplinasDoArquivo();
                                break;
                            case 3:
                                // Criar turma
                                System.out.println("===== CRIAÇÃO DE TURMA =====");
                                criarTurma();
                                break;
                            case 4:
                                // Listar turmas
                                System.out.println("===== LISTA DE TURMAS POR DISCIPLINA =====");
                                listarTurmasDoArquivo();
                                break;
                            case 9:
                                System.out.println("voltando ao menu!");
                                break;
                            default:
                                System.out.println("Opção inválida!");
                        }
                        System.out.println();
                    } while (opcao != 9);
                    break;
                case 3:
                    // Modo avaliação/frequência
                    do {
                        System.out.println("===== MENU =====");
                        System.out.println("1. Lançamento de notas!");
                        System.out.println("2. Lançamento de frequencia!");
                        System.out.println("3. Relatório de turmas!");
                        System.out.println("4. Relatório de alunos!");
                        System.out.println("9. Voltar ao menu principal");
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
                            case 9:
                                System.out.println("voltar ao menu principal");
                                break;
                            default:
                                System.out.println("Opção inválida! Tente novamente.");
                        }
                    } while (opcao != 9);    
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

                        System.out.println("Dados salvos.");
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
//salvamento dos dados no arquivo .txt
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
//modo aluno
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
    // Modo disciplina e turma
    private static void cadastrarDisciplina() {
        List<Disciplina> disciplinas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("===== CADASTRO DE DISCIPLINA =====");
        System.out.println("Digite os dados da disciplina:");
        System.out.print("Nome da disciplina: ");
        String nome = sc.nextLine();
        System.out.print("Código da disciplina: ");
        String codigo = sc.nextLine();
        System.out.print("Carga horária: ");
        int cargaHoraria = sc.nextInt();
        sc.nextLine(); // quebra de linha

        Disciplina disciplina = new Disciplina(nome, codigo, cargaHoraria);

        System.out.print("Deseja adicionar pré-requisitos? (s/n): ");
        String resposta = sc.nextLine();
        while (resposta.equalsIgnoreCase("s")) {
            System.out.print("Código do pré-requisito: ");
            String prereq = sc.nextLine();
            disciplina.adicionarPreRequisito(prereq);
            System.out.print("Adicionar outro? (s/n): ");
            resposta = sc.nextLine();
        }

        disciplinas.add(disciplina);
        System.out.println("Disciplina cadastrada com sucesso.");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("disciplinas.txt", true))) {
            writer.write("Nome: " + nome + ", Código: " + codigo + ", Carga Horária: " + cargaHoraria);
            if (!disciplina.getPreRequisitos().isEmpty()) {
                writer.write(", Pré-requisitos: " + disciplina.getPreRequisitos());
            }
            writer.newLine();
            System.out.println("Disciplina salva em disciplinas.txt.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar disciplina: " + e.getMessage());
        }
    }

    public static void listarDisciplinasDoArquivo() {
    try (Scanner scanner = new Scanner(new java.io.File("disciplinas.txt"))) {
        System.out.println("===== Disciplinas Cadastradas =====");
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    } catch (IOException e) {
        System.out.println("Erro ao ler disciplinas: " + e.getMessage());
    }
}

  private static void criarTurma() {
    List<String> codigosDisciplinas = new ArrayList<>();
    List<String> nomesDisciplinas = new ArrayList<>();

    // Lê o arquivo disciplinas.txt e armazena códigos e nomes
    try (Scanner scanner = new Scanner(new java.io.File("disciplinas.txt"))) {
        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            // Espera-se que a linha tenha o formato: Nome: X, Código: Y, ...
            String[] partes = linha.split(",");
            String nome = "";
            String codigo = "";
            for (String parte : partes) {
                if (parte.trim().startsWith("Nome:")) {
                    nome = parte.trim().replace("Nome:", "").trim();
                }
                if (parte.trim().startsWith("Código:")) {
                    codigo = parte.trim().replace("Código:", "").trim();
                }
            }
            if (!codigo.isEmpty() && !nome.isEmpty()) {
                codigosDisciplinas.add(codigo);
                nomesDisciplinas.add(nome);
            }
        }
        } catch (IOException e) {
            System.out.println("Erro ao ler disciplinas: " + e.getMessage());
            return;
        }

        if (codigosDisciplinas.isEmpty()) {
            System.out.println("Nenhuma disciplina cadastrada. Cadastre uma disciplina antes de criar uma turma.");
            return;
        }

        System.out.println("Escolha a disciplina pelo código:");
        for (int i = 0; i < codigosDisciplinas.size(); i++) {
            System.out.println("- " + codigosDisciplinas.get(i) + ": " + nomesDisciplinas.get(i));
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Código: ");
        String codigoEscolhido = sc.nextLine();

        String nomeDisciplinaSelecionada = "";
        for (int i = 0; i < codigosDisciplinas.size(); i++) {
            if (codigosDisciplinas.get(i).equalsIgnoreCase(codigoEscolhido)) {
                nomeDisciplinaSelecionada = nomesDisciplinas.get(i);
                break;
            }
        }

        if (nomeDisciplinaSelecionada.isEmpty()) {
            System.out.println("Disciplina não encontrada.");
            return;
        }

        System.out.print("Código da turma: ");
        String codTurma = sc.nextLine();
        System.out.print("Professor responsável: ");
        String professor = sc.nextLine();
        System.out.print("Semestre (ex: 2025.1): ");
        String semestre = sc.nextLine();
        System.out.print("Forma de avaliação (simples ou ponderada): ");
        String forma = sc.nextLine();
        System.out.print("A turma será presencial? (s/n): ");
        boolean presencial = sc.nextLine().equalsIgnoreCase("s");
        String sala = presencial ? pedirTexto("Sala: ") : "";
        System.out.print("Horário: ");
        String horario = sc.nextLine();
        System.out.print("Capacidade máxima: ");
        int capacidade = sc.nextInt();
        sc.nextLine(); // quebra de linha

        Turma turma = new Turma(codTurma, professor, semestre, forma, presencial, sala, horario, capacidade);
//        disciplinaSelecionada.adicionarTurma(turma);

        System.out.println("Turma criada com sucesso.");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("turmas.txt", true))) {
            writer.write("Disciplina: " + nomeDisciplinaSelecionada +
                     ", Código Turma: " + codTurma +
                     ", Professor: " + professor +
                     ", Semestre: " + semestre +
                     ", Forma: " + forma +
                     ", Presencial: " + presencial +
                     ", Sala: " + sala +
                     ", Horário: " + horario +
                     ", Capacidade: " + capacidade);
            writer.newLine();
            System.out.println("Turma salva em turmas.txt.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar turma: " + e.getMessage());
        }
    }

    public static void listarTurmasDoArquivo() {
        try (Scanner scanner = new Scanner(new java.io.File("turmas.txt"))) {
            System.out.println("===== Turmas Cadastradas =====");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler turmas: " + e.getMessage());
        }
    }

    private static String pedirTexto(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextLine();
    }
}
