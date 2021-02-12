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
//		Crie um programa Java que, ao executar, escreva na tela “Olá, Mundo!”.
        System.out.println("Ola Mundo!!");
        
//      Exercicio 3
//      Crie um programa em Java que, ao executar, 
//      	escreve na tela um número aleatório entre 0 e 1.
        double aleatorio = Math.random();
        System.out.println("Numero aleatorio gerado: " + aleatorio);
        
//      Exercicio 4
//      Crie um programa em Java que, ao executar, verifique o horário atual 
//      	e escreva para o usuário uma saudação, contendo o período e o horário. 
//      	Por exemplo: “Boa tarde, no momento são 15:08.”.

        System.out.println("Bom dia, Atualmente é: "+ LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")));
        
//      Exercicio 5
//      Crie um programa em Java que, ao executar, escreva o idioma do sistema.
        System.out.println("Idioma do Sistema: " + Locale.getDefault().getLanguage());
        
//      Exercicio 7
//      Crie um programa em Java que, utilizando a classe Scanner, 
//        pergunte ao usuário seu sobrenome, depois seu nome, 
//        e então escreva na tela, em uma única “string”, o nome completo do usuário.
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu Sobrenome");
        String nome = scan.nextLine();
        System.out.println("Digite seu Nome");
        nome = scan.nextLine() + " " + nome;
        System.out.println("Ola " + nome);
        
//      Exercicio 8
//      Crie um programa em Java que, utilizando a classe Scanner, 
//        peça ao usuário que digite um número com 2 ou mais casas depois da vírgula, 
//        converta esse número para um inteiro e escreva o resultado na tela.
        System.out.println("Digite um numero com 2 ou mais casas apos a ,");
        float valor = scan.nextFloat();
        int valorConvertido = Math.round(valor);
        System.out.printf("O valor digitado em inteiro é: %d", valorConvertido);
        
        
        
        scan.close();
        

	
	}

}
