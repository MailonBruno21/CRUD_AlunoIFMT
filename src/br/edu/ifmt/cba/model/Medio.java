/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifmt.cba.model;

import br.edu.ifmt.cba.controller.ErroFormatoNota;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author pedri
 */
public class Medio extends Aluno {

    private double notaF;

    public double getNotaF() {
        return notaF;
    }

    public void setNotaF(double notaF) {
        this.notaF = notaF;
    }
    

    @Override
    public void calculoNota() {
        
        double media = 0;
        
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o numero de avaliacoes");
        double numeroAvaliacoes = entrada.nextInt();
        
        for(int i = 0; i < numeroAvaliacoes; i++){
            try{
                System.out.println("Digite a "+ (i+1) +"ª nota");
                double nota = entrada.nextDouble();
                media = media + nota;
            }
            catch(InputMismatchException erro){
                throw new ErroFormatoNota ("Tipo de nota errada");
            }
            
        }
       setNotaF(media/numeroAvaliacoes);
        
    }

    @Override
    public String finalNota() { 
        String nota = String.valueOf(this.notaF);
        return  nota;
    }

    
    
}
