package br.edu.ifmt.cba.controller;

import static br.edu.ifmt.cba.controller.AtribuirNota.menuNota;
import static br.edu.ifmt.cba.controller.Busca.menuBusca;
import static br.edu.ifmt.cba.controller.Cadastro.cadastrar;
import br.edu.ifmt.cba.model.Aluno;
import java.util.Scanner;

/**
 *
 * @author pedri
 */
public class Main {
    
    public static int qtdAlunos = 5;
    public static Aluno[] guardaAluno = new Aluno[qtdAlunos];

    public static void main(String[] args) {
        
        
        menu();

    }

    public static void menu() {
        
        

        System.out.println("----------------------------------------------");
        System.out.println("******************* -MENU- *******************");
        System.out.println("1 -> Cadastro de Aluno");
        System.out.println("2 -> Buscar Cadastro");
        System.out.println("3 -> Atribuir Notas");
        System.out.println("4 -> Sair");

        System.out.println("\nDigite uma opcao.");

        Scanner entrada = new Scanner(System.in);
        int opc;
        opc = entrada.nextInt();

        switch (opc) {
            case 1:
                for (int i = 0; i < qtdAlunos; i++){
                    if (guardaAluno[i] == null) {
                        guardaAluno[i] = cadastrar();
                    }else{
                     System.out.println("Maximo de Alunos Cadastrados ");   
                    }
                }
                break;
            case 2:
                menuBusca(qtdAlunos, guardaAluno);
                break;
            case 3:
                menuNota(guardaAluno);
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Opcao Invalida\n\n");
                menu();
        }

    }

}
