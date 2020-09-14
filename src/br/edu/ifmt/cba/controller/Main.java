package br.edu.ifmt.cba.controller;
import static br.edu.ifmt.cba.controller.Cadastro.cadastrar;
import java.util.Scanner;


/**
 *
 * @author pedri
 */
public class Main {
    
    public static void main (String [] args){
                
        menu();
    }
    
    public static void menu(){
        
              
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
                cadastrar();
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Opcao Invalida\n\n");                          
                menu();
        }
        
        
        
        
    }
    
}
