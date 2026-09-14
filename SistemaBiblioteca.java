/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.df.sistemabiblioteca;

/**
 *
 * @author caio61567586
 */
public class SistemaBiblioteca {

    public static void main(String[] args) {
        System.out.println("SISTEMA DA BIBLIOTECA: ");
        
    Livro1 livro01 = new Livro1("1946" , "George Orwell", "Distopia");
    Livro2 livro02 = new Livro2("A Revolução dos Bichos" , "George Orwell", "Sátira política");
    Livro3 livro03 = new Livro3("Dom Casmurro" , "Machado de Assis", "Romance");
    Livro4 livro04 = new Livro4("O Pequeno Príncipe" , "Antonie de Saint-Exupéry", "Fantasia");
    Livro5 livro05 = new Livro5("Herry Potter e a Pedra Filosofal" , "J.K Rowling", "Fantasia");
    Livro6 livro06 = new Livro6("O Hobbit" , "J.R.R Tolkien", "Fantasia/Aventura");
    Livro7 livro07 = new Livro7("A Menina que Roubava Livros" , "Marcus Zusak", "Romance histórico");
    Livro8 livro08 = new Livro8("Verity" , "Colleen Hoover", "Thriller");
    Livro9 livro09 = new Livro9("Torto Arado" , "Itamar Vieira Junior", "Romance");
    Livro10 livro010 = new Livro10("Sapiens" , "Yuval Noah Harari", "História/Não ficção");
    Livro11 livro011 = new Livro11("A Psicologia Financeira" , "Morgan Housel", "Finanças");
    Livro12 livro012 = new Livro12("Pai Rico, Pai Pobre" , "Robert T.Kiyosaki", "Finanças");
    Livro13 livro013 = new Livro13("O Homem Mais Rico da Babilônia" , "George S.Clason", "Finanças");
    Livro14 livro014 = new Livro14("O Poder do Hábito" , "Charles Duhigg", "Desenvolvimento Pessoal");
    Livro15 livro015 = new Livro15("Hábitos Atômicos" , "James Clear", "Desenvolvimento Pessoal");
    LivroExtra livroextra = new LivroExtra("O Alienista", "Machado de Assis" ,"Literatura Clássica" );
    
    livro01.imprimirinformacoes();
    System.out.println("------------------------------------");
    
    livro02.imprimirinformacoes();
    System.out.println("------------------------------------");
    
    livro03.imprimirinformacoes();
    System.out.println("------------------------------------");
    
    livro04.imprimirinformacoes();
    System.out.println("------------------------------------");
    
    livro05.imprimirinformacoes();
    System.out.println("------------------------------------");
    
    livro06.imprimirinformacoes();
    System.out.println("------------------------------------");
    
    livro07.imprimirinformacoes();
    System.out.println("------------------------------------");
    
    livro08.imprimirinformacoes();
    System.out.println("------------------------------------");
    
    livro09.imprimirinformacoes();
    System.out.println("------------------------------------");
    
    livro010.imprimirinformacoes();
    System.out.println("------------------------------------");
    
    livro011.imprimirinformacoes();
    System.out.println("------------------------------------");
    
    livro012.imprimirinformacoes();
    System.out.println("------------------------------------");
    
    livro013.imprimirinformacoes();
    System.out.println("------------------------------------");
    
    livro014.imprimirinformacoes();
    System.out.println("------------------------------------");
    
    livro015.imprimirinformacoes();
    System.out.println("------------------------------------");
    
    livroextra.imprimirinformacoes();
    System.out.println("------------------------------------");
    }
}
