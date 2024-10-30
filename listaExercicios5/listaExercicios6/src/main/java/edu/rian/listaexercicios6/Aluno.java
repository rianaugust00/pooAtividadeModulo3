/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.rian.listaexercicios6;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double media;
    
    public Aluno(String nome,  double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
    }
    
    
    public void exibirNota(){        
        System.out.println("Nota prova 1:" + nota1);
        System.out.println("Nota prova 2:" + nota2);
    }
    
    public void exibirMedia(double nota1, double nota2){

    }
    
    public void exibirAprovacao(){
        if(this.media >= 7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
}
