
package br.edu.ifmt.cba.model;

import br.edu.ifmt.cba.controller.ErroFormatoNota;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author pedri
 */
public class Superior extends Aluno {

    private String notaFinal;
    
    
    

    @Override
    public void calculoNota() {
        
        int media = 0;
        
        String notaF;
        
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o numero de avaliacoes");
        int numeroAvaliacoes = entrada.nextInt();
        entrada.nextLine();
        for(int i = 0; i < numeroAvaliacoes; i++){
            
            try{
                System.out.println("Digite o Conceito:");
               
                    
                String conceito = entrada.nextLine();
                if("a".equals(conceito) || "b".equals(conceito) || "c".equals(conceito) || "d".equals(conceito) || "e".equals(conceito) || "f".equals(conceito) || "A".equals(conceito) || "B".equals(conceito) || "C".equals(conceito) || "D".equals(conceito) || "E".equals(conceito) || "F".equals(conceito)){
                    if(("a".equals(conceito)) || ("A".equals(conceito))){
                        media = media + 10;
                    }
                    if(("b".equals(conceito)) || ("B".equals(conceito))){
                        media = media + 9;
                    }
                    if(("c".equals(conceito)) || ("C".equals(conceito))){
                        media = media + 7;
                    }
                    if(("d".equals(conceito)) || ("D".equals(conceito))){
                        media = media + 5;
                    }
                    if(("e".equals(conceito)) || ("E".equals(conceito))){
                        media = media + 3;
                    }
                    if(("f".equals(conceito)) || ("F".equals(conceito))){
                        media = media + 1;
                    }
                }else{
                    
                        throw new ErroFormatoNota ("Tipo de nota errada");
                    
                }
                
            }
            catch(InputMismatchException erro){
                throw new ErroFormatoNota ("Tipo de nota errada");
            }
            
        }
        media = media /  numeroAvaliacoes;
        
        if(media == 0){
            setNotaFinal("F");
        }
        if(media == 1){
            setNotaFinal("F");
        }
        if(media == 2){
            setNotaFinal("E");
        }
        if(media == 3){
            setNotaFinal("E");
        }
        if(media == 4){
            setNotaFinal("D");
        }
        if(media == 5){
            setNotaFinal("D");
        }
        if(media == 6){
            setNotaFinal("C");
        }
        if(media == 7){
            setNotaFinal("C");
        }
        if(media == 8){
            setNotaFinal("B");
        }
        if(media == 9){
            setNotaFinal("B");
        }
        if(media == 10){
            setNotaFinal("A");
        }
        
        
    }

    public String getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(String notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String finalNota() {
        return getNotaFinal();
    }

    

    
}
