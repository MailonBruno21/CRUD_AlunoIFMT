package br.edu.ifmt.cba.controller;

import static br.edu.ifmt.cba.controller.Main.menu;
import br.edu.ifmt.cba.model.Aluno;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.IIOException;

/**
 *
 * @author pedri
 */
public class Busca {

    public static void menuBusca(int qtdAluno, Aluno[] guardaAluno) {
        
        if(guardaAluno[0] == null){
            System.out.println("Nao existe alunos cadastrados");
        }
        
        System.out.println("\n--------------------------------------");
        System.out.println("------------- BUSCAS ALUNO -------------");
        System.out.println("1 - SUPERIOR    2 - MEDIO");
        System.out.println("3- Voltar");

        System.out.println("\nDigite uma opcao.");

        Scanner entrada = new Scanner(System.in);

        int opc = entrada.nextInt();

        switch (opc) {

            case 1:
                System.out.println("\n--------------------------------------");
                System.out.println("------------- BUSCAR ALUNO POR?-------------");
                System.out.println("1 - NOME    2 - MATRICULA");
                System.out.println("3- Voltar");

                System.out.println("\nDigite uma opcao.");
                
                opc = entrada.nextInt();
                

                switch (opc) {

                    case 1:
                        System.out.println("Digite o Nome:");
                        entrada.nextLine();
                        String nome = entrada.nextLine();
                        buscar(nome, qtdAluno, guardaAluno, "Superior");
                        break;

                    case 2:
                        System.out.println("Digite o Matricula:");
                        int numeroMatricula = entrada.nextInt();
                        buscar(numeroMatricula, qtdAluno, guardaAluno, "Superior");
                        break;

                    case 3:
                        menuBusca(qtdAluno, guardaAluno);
                        break;

                    default:
                        System.out.println("Opcao Invalida\n\n");
                        menuBusca(qtdAluno, guardaAluno);
                }
                break;

            case 2:
                
                System.out.println("\n--------------------------------------");
                System.out.println("------------- BUSCAR ALUNO POR?-------------");
                System.out.println("1 - NOME    2 - MATRICULA");
                System.out.println("3- Voltar");

                System.out.println("\nDigite uma opcao.");

                opc = entrada.nextInt();

                switch (opc) {

                    case 1:
                        System.out.println("Digite o Nome:");
                        entrada.nextLine();
                        String nome = entrada.nextLine();
                        buscar(nome, qtdAluno, guardaAluno, "Medio");
                        break;

                    case 2:
                        System.out.println("Digite o Matricula:");
                        int numeroMatricula = entrada.nextInt();
                        buscar(numeroMatricula, qtdAluno, guardaAluno, "Medio");
                        break;

                    case 3:
                        menuBusca(qtdAluno, guardaAluno);
                        break;

                    default:
                        System.out.println("Opcao Invalida\n\n");
                        menuBusca(qtdAluno, guardaAluno);
                }

                break;

            case 3:
                menu();
                break;
            default:
                System.out.println("Opcao Invalida\n\n");
                menuBusca(qtdAluno, guardaAluno);

        }
    }

    public static Aluno buscar(String nome, int qtdAluno, Aluno[] guardaAluno, String tipoAluno) {

        switch (tipoAluno) {

            case "Superior":
                
                for (int i = 0; i < qtdAluno; i++) {
                    if (guardaAluno[i].getNome().equals(nome)) {
                        return guardaAluno[i];
                    }
                }
                break;

            case "Medio":
                for (int i = 0; i < qtdAluno; i++) {
                    if ((guardaAluno[i].getNome().equals(nome)) && (guardaAluno[i].getTipoAluno().equals(tipoAluno))) {
                        return guardaAluno[i];
                    }
                }
                break;
        }
        return null;
    }

    public static Aluno buscar(int matricula, int qtdAluno, Aluno[] guardaAluno, String tipoAluno) {

        switch (tipoAluno) {

            case "Superior":
                for (int i = 0; i < qtdAluno; i++) {
                    if ((guardaAluno[i].getMatricula() == matricula) && (guardaAluno[i].getTipoAluno().equals(tipoAluno))) {
                        return guardaAluno[i];
                    }
                }
                break;

            case "Medio":
                for (int i = 0; i < qtdAluno; i++) {
                    if ((guardaAluno[i].getMatricula() == matricula) && (guardaAluno[i].getTipoAluno().equals(tipoAluno))) {
                        return guardaAluno[i];
                    }
                }
                break;
        }
        return null;
    }

}
