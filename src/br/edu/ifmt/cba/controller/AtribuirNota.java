
package br.edu.ifmt.cba.controller;

import static br.edu.ifmt.cba.controller.Busca.buscar;
import static br.edu.ifmt.cba.controller.Main.menu;
import static br.edu.ifmt.cba.controller.Main.qtdAlunos;
import br.edu.ifmt.cba.model.Aluno;
import br.edu.ifmt.cba.model.Superior;
import br.edu.ifmt.cba.model.Medio;
import java.util.Scanner;

/**
 *
 * @author pedri
 */
public class AtribuirNota {
        
    public static void menuNota(Aluno[] guardaAluno){
        
        System.out.println("--------------------------------------------------------");
        System.out.println("******************* -ATRIBUIR NOTAS- *******************");
        System.out.println("1 -> Buscar por matricula");
        System.out.println("2 -> Buscar por nome");
        System.out.println("3 -> Menu Principal");
        
        System.out.println("\nDigite uma opcao.");

        Scanner entrada = new Scanner(System.in);
        int opc;
        opc = entrada.nextInt();
        
        switch(opc){
            case 2:
                System.out.println("Digite o Nome:");
                entrada.nextLine();
                String nome = entrada.nextLine();
                
                int buscar = buscar(nome, qtdAlunos, guardaAluno);
                
                try{
                    guardaAluno[buscar].calculoNota();
                }
                catch(ErroFormatoNota erro){
                    System.out.println(erro.getMessage());
                }
                        
                
                
                
                
                break;
            case 1:
                System.out.println("Digite a Matricula:");
                
                int matricula = entrada.nextInt();
                
                int aux = buscar(matricula, qtdAlunos, guardaAluno);
                
                try{
                    guardaAluno[aux].calculoNota();
                }
                catch(ErroFormatoNota erro){
                    System.out.println(erro.getMessage());
                }
                
                
                break;
                
                
            case 3:
                menu();
                break;
                
            default:
               
        }
    }


    
}
