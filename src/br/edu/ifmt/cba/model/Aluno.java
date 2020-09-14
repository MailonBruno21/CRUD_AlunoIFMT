package br.edu.ifmt.cba.model;

/**
 *
 * @author pedri
 */
public abstract class Aluno {
    
    private int matricula;
    private String nome;
    private String tipoAluno;
    
    
    public abstract String finalNota();
    
    public abstract void calculoNota();   

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoAluno() {
        return tipoAluno;
    }

    public void setTipoAluno(String tipoAluno) {
        this.tipoAluno = tipoAluno;
    }

    @Override
    public String toString() {
        return "Aluno-> " + "Matricula:" + matricula + ", Nome: " + nome + ", Cursando Ensino " + tipoAluno + " -";
    }
    
    
    
    
    
}
