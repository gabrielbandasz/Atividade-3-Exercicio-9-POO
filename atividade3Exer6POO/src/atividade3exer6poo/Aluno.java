
package atividade3exer6poo;


public class Aluno {
      private String nome;

    private double nota1;

    private double nota2;

    private double media;


    public String getNome(){

        return nome;

    }

    public void setNome(String nome){

        this.nome = nome;

    }

   

    public double getNota1(){

        return nota1;

    }

    public void setNota1(double nota1){

        this.nota1 = nota1;

    }

   

    public double getNota2(){

        return nota2;

    }

    public void setNota2(double nota2){

        this.nota2 = nota2;

    }

   

    public void calcular(){

        media= (nota1+nota2)/2;

       

        if(media>=7.0){

            System.out.println("!!!APROVADO!!!");

        }

        else{

            System.out.println("REPROVADO ");

        }

    }  
}
