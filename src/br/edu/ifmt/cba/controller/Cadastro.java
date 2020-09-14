package br.edu.ifmt.cba.controller;

import static br.edu.ifmt.cba.controller.Main.menu;
import br.edu.ifmt.cba.model.Aluno;
import br.edu.ifmt.cba.model.Medio;
import br.edu.ifmt.cba.model.Superior;
import java.util.Scanner;

/**
 *
 * @author pedri
 */
public class Cadastro {

    public static Aluno cadastrar() {

        int opc;
        String nome;
        int numeroMatricula;

        Aluno aluno;

        System.out.println("\n--------------------------------------");
        System.out.println("---------- CADASTRO DE ALUNO ---------");
        System.out.println("1 - SUPERIOR    2 - MEDIO");
        System.out.println("3- Voltar");

        System.out.println("\nDigite uma opcao.");

        Scanner entrada = new Scanner(System.in);

        opc = entrada.nextInt();

        switch (opc) {

            case 1:
                aluno = new Superior();
                System.out.println("Digite o Nome:");
                entrada.nextLine();
                nome = entrada.nextLine();
                aluno.setNome(nome);
                System.out.println("Digite o Numero de Matricula:");
                numeroMatricula = entrada.nextInt();
                aluno.setMatricula(numeroMatricula);
                aluno.setTipoAluno("Superior");
                
                
                
                return aluno;
 
            case 2:
                aluno = new Medio();
                System.out.println("Digite o Nome:");
                entrada.nextLine();
                nome = entrada.nextLine();
                aluno.setNome(nome);
                System.out.println("Digite o Numero de Matricula:");
                numeroMatricula = entrada.nextInt();
                aluno.setMatricula(numeroMatricula);
                aluno.setTipoAluno("Medio");

                return aluno;

            case 3:
                menu();
                break;
            default:
                System.out.println("Opcao Invalida\n\n");
                cadastrar();

        }
        menu();
        return null;
    }

}
