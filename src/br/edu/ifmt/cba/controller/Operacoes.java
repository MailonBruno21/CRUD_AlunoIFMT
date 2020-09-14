package br.edu.ifmt.cba.controller;

import static br.edu.ifmt.cba.controller.Busca.buscaVetor;
import static br.edu.ifmt.cba.controller.Main.guardaAluno;
import static br.edu.ifmt.cba.controller.Main.menu;
import br.edu.ifmt.cba.model.Aluno;
import java.util.Scanner;

/**
 *
 * @author pedri
 */
public class Operacoes {
    
    public static void operacoeALunos(Aluno aluno, Aluno[] guardaAluno){
        System.out.println("\n\n---------------------------------------------------------");
        System.out.println("|" + aluno.toString() + "|");
        System.out.println("-------------------------------------------------------------\n\n");
        System.out.println("1 -> Alterar Cadastro");
        System.out.println("2 -> Excluir Cadastro");
        System.out.println("3 -> Consultar Notas");
        System.out.println("4 -> Menu Principal");
        
        System.out.println("\nDigite uma opcao.");

        Scanner entrada = new Scanner(System.in);
        int opc;
        opc = entrada.nextInt();
        
        switch (opc){
            case 1:
                
                break;
            case 2:
                excluir(aluno);
                break;
            case 3:
                
                break;
            case 4:
                menu();
                break;
            default:
                
        }
    }
    
    public static void excluir(Aluno aluno){
        int buscaVetor = buscaVetor(guardaAluno, aluno);
        
        if(buscaVetor == -1){
            System.out.println("Cadastro nao encontrado");
        }
        guardaAluno[buscaVetor] = null;
        menu();
    }
    
    public static void alterar(Aluno aluno){
        int buscaVetor = buscaVetor(guardaAluno, aluno);
        
        if(buscaVetor == -1){
            System.out.println("Cadastro nao encontrado");
        }
        guardaAluno[buscaVetor] = null;
        menu();
    }
    
    public static void consultarNotas(){
        
    }
}