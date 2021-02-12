package DevIn;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

/* Atividades da Semanha 10 do Curso DevIn House do Senai
 * Semana 10 Materia: Java.
 * Aluno: Guilherme Noronha da Silva.
 * 
 */
public class Main {
	public static void main(String[] args) {
		
//		Exercicio 2
//		Crie um programa Java que, ao executar, escreva na tela �Ol�, Mundo!�.
        System.out.println("Ola Mundo!!");
        
//      Exercicio 3
//      Crie um programa em Java que, ao executar, 
//      	escreve na tela um n�mero aleat�rio entre 0 e 1.
        double aleatorio = Math.random();
        System.out.println("Numero aleatorio gerado: " + aleatorio);
        
//      Exercicio 4
//      Crie um programa em Java que, ao executar, verifique o hor�rio atual 
//      	e escreva para o usu�rio uma sauda��o, contendo o per�odo e o hor�rio. 
//      	Por exemplo: �Boa tarde, no momento s�o 15:08.�.

        System.out.println("Bom dia, Atualmente �: "+ LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));
        
//      Exercicio 5
//      Crie um programa em Java que, ao executar, escreva o idioma do sistema.
        System.out.println("Idioma do Sistema: " + Locale.getDefault().getLanguage());
        
//      Exercicio 7
//      Crie um programa em Java que, utilizando a classe Scanner, 
//        pergunte ao usu�rio seu sobrenome, depois seu nome, 
//        e ent�o escreva na tela, em uma �nica �string�, o nome completo do usu�rio.
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu Sobrenome");
        String nome = scan.nextLine();
        System.out.println("Digite seu Nome");
        nome = scan.nextLine() + " " + nome;
        System.out.println("Ola " + nome);
        
//      Exercicio 8
//      Crie um programa em Java que, utilizando a classe Scanner, 
//        pe�a ao usu�rio que digite um n�mero com 2 ou mais casas depois da v�rgula, 
//        converta esse n�mero para um inteiro e escreva o resultado na tela.
        System.out.println("Digite um numero com 2 ou mais casas apos a ,");
        float valor = scan.nextFloat();
        int valorConvertido = Math.round(valor);
        System.out.printf("O valor digitado em inteiro �: %d", valorConvertido);
        
        
        
        scan.close();
        

	
	}

}
