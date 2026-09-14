/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.df.sistemabiblioteca;

/**
 *
 * @author caio61567586
 */
public class Livro4 {
    // Título, Autor, Genêro, Ano de publicação, Número de páginas, Preço 
    String titulo;
    String autor;
    String genero;
    int anoPublicacao;
    int numeroPaginas;
    double preco;
    int idadeLivro;
    
   public Livro4 (String titulo, String autor, String genero){
   this.titulo = titulo;
   this.autor = autor;
   this.genero = genero;
   this.anoPublicacao = 1943;
   this.numeroPaginas = 224;
   this.preco = 45.00;
    }
   
  public void calcular(){
  idadeLivro = 2026 - anoPublicacao;
 } 
   
   public void imprimirinformacoes(){ 
   System.out.println("Título do Livro: " + titulo);
   System.out.println("Autor: " + autor);
   System.out.println("Genêro: " + genero);
   System.out.println("Ano da publicação: " + anoPublicacao);
   System.out.println("Idade deo livro: " + idadeLivro);
   System.out.println("Número de páginas: " + numeroPaginas);
   System.out.println("Preço: " + preco);
   System.out.println();
   }
}
