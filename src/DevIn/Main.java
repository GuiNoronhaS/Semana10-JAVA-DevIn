package DevIn;

import java.time.LocalDate;
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
        System.out.println("Digite um numero com 2 ou mais casas apos a . Exemplo: 22.22");
        // float valor = scan.nextFloat(); // funciona com , =não consome a linha assim foi trocado pelo nextLine
        float valor = Float.parseFloat(scan.nextLine()); //funciona com .
        int valorConvertido = Math.round(valor);
        System.out.printf("O valor digitado em inteiro é: %d \n", valorConvertido);
        
//      Exercicio 9
//      Crie um programa em Java que, utilizando a classe Scanner, 
//        peça ao usuário que digite um nome qualquer, e em seguida escreva na tela 
//        o tamanho de letras que o nome possui.
        System.out.println("Digite nome qualquer, para saber a quantidade de letras que o nome possui");
        String palavra = scan.nextLine();
        palavra = palavra.trim();
        System.out.println("O numero de letras da palavra ("+palavra+") escolhida é: "+ palavra.length());
        
//      Exercicio 10
//      Crie um programa em Java que, utilizando a classe Scanner, 
//        pergunte ao usuário a seguinte frase: “Adivinhe qual número de 1 a 5 eu estou pensando”. 
//        Na sequência, o usuário deve inserir um número entre 1 e 5, 
//        e o seu programa deve gerar aleatoriamente outro número, 
//        também de 1 a 5. Se o número gerado for o mesmo que o usuário inseriu, 
//        o programa deve escrever na tela “Você acertou!”, mas se for diferente, 
//        o programa deve escrever “Você errou, o número correto era X”, 
//        onde X é o número gerado aleatoriamente pelo programa.
        int valorGerado = (int)(Math.random() * 5) + 1;
        System.out.println("Adivinhe qual número de 1 a 5 eu estou pensando");
        int valorUsuario = Integer.parseInt((scan.nextLine()));
        if(valorGerado == valorUsuario) {
        	System.out.println("Você acertou! O valor gerado era: " + valorGerado);
        } else {
        	System.out.println("Você errou, o número correto era " + valorGerado);
        }

//      Exercicio 11
//      Crie um programa em Java que, utilizando a classe Scanner, 
//        pergunte ao usuário sua data de nascimento e calcule a sua idade. 
//        Se o usuário tiver 18 anos ou mais, escreva na tela “você é maior de idade”, 
//        mas caso tenha menos de 18 anos, escreva “você é menor de idade”.
        System.out.println("Digite a sua data de nascimento no formato(Dia/Mes/Ano), Exemplo: 20/01/1990 ");
        LocalDate nascimento = LocalDate.parse(scan.nextLine(), DateTimeFormatter.ofPattern("d/M/u"));
        LocalDate atual = LocalDate.now();
        int idade = atual.getYear() - nascimento.getYear();
        if(atual.getMonthValue() > nascimento.getMonthValue()) {
        	idade++;
        } else if(atual.getMonthValue() == nascimento.getMonthValue() 
        		&& atual.getDayOfMonth() >= nascimento.getDayOfMonth())  {
        	idade++;
        }
        if(idade >= 18) {
        	System.out.println("Você é maior de idade.");
        } else {
        	System.out.println("Você é menor de idade.");
        }
        
//      Exercicio 12
//      Crie um programa em Java que, utilizando a classe Scanner, 
//        peça ao usuário para inserir um número inteiro. 
//        O programa deve verificar se o número é par ou ímpar, 
//        e exibir essa informação de volta ao usuário.
        System.out.println("Digite um valor inteiro ");
        int inteiro = Integer.parseInt(scan.nextLine());
        System.out.println( (inteiro & 1)== 0 
        		? "O valor " + inteiro+" é par" 
        		: "O valor " + inteiro+" é impar");
        
//      Exercicio 13
//      Crie um programa em Java que, utilizando a classe Scanner, 
//        peça ao usuário para inserir as notas do semestre, 
//        e deve retornar a média final. 
//        O programa deve pedir 3 notas, que devem ser números reais, 
//        e retornar um número real com 2 casas depois da vírgula, 
//        com o texto “Sua média final é:” seguido do valor.
        System.out.println("Insira as notas do Semestre");
        System.out.println("Digite a primeira nota");
        float notaUm = Float.parseFloat(scan.nextLine());
        System.out.println("Digite a segunda nota");
        float notaDois = Float.parseFloat(scan.nextLine());
        System.out.println("Digite a terceira nota");
        float notaTres = Float.parseFloat(scan.nextLine());
        float media = (notaUm+notaDois+notaTres)/3;
        System.out.printf("Sua média final é: %.2f \n", media);

//      Exercicio 14
//      Crie um programa em Java que, utilizando a classe Scanner, 
//		  simule uma calculadora. O programa deve pedir um número, depois outro, 
//		  e por último uma operação. O sistema deve aceitar como operação qualquer 
//		  uma dessas 4 strings: “somar”, “subtrair”, “multiplicar” ou "dividir", 
//		  e realizar a operação correspondente entre os 2 números inseridos, 
//		  para então escrever na tela do usuário o resultado.
		System.out.println("Calculadora");
		System.out.println("Digite o primeiro valor para a calculadora: ");
		int numeroUm = Integer.parseInt(scan.nextLine());
		System.out.println("Digite o segundo valor para a calculadora: ");
		int numeroDois = Integer.parseInt(scan.nextLine());
		boolean cont = true;
		while(cont == true) {
			System.out.println("Digite uma operação para a calculadora. Exemplos: somar, subtrair, multiplicar ou dividir");
			String operacao = scan.nextLine();
			switch(operacao) {
				case "somar":
					System.out.println("Resultado: "+numeroUm+" + "+numeroDois+"= "+(numeroUm + numeroDois));
					cont = false;
					break;
				case "subtrair":
					System.out.println("Resultado: "+numeroUm+" - "+numeroDois+"= "+(numeroUm - numeroDois));
					cont = false;
					break;
				case "multiplicar":
					System.out.println("Resultado: "+numeroUm+" * "+numeroDois+"= "+(numeroUm * numeroDois));
					cont = false;
					break;
				case "dividir":
					System.out.println("Resultado: "+numeroUm+" / "+numeroDois+"= "+(numeroUm / numeroDois));
					cont = false;
					break;
				default:
					System.out.println("Voce não digitou uma operacao valida, tente novamente");
					break;
			}
		}

//      Exercicio 16
//      Crie um programa em Java que, utilizando a classe Scanner, 
//		  simule uma calculadora de P.A. e P.G. 
//		Peça para o usuário inserir um “valor inicial”, 
//		  que deve ser um número inteiro. 
//		Em seguida, peça ao usuário para inserir um valor para a raiz. 
//		Depois, pergunte ao usuário se ele deseja calcular 
//		  os 10 primeiros valores de uma P.A. ou de uma P.G. 
//		  para os números inseridos anteriormente. 
//		Então, calcule os 10 primeiros valores de uma P.A. ou P.G. 
//		  utilizando os números inseridos pelo usuário, 
//		  e escreva essa sequência de valores na tela 
//		  para o usuário visualizar o resultado. 
		System.out.println("Calculadora PA e PG");
		System.out.println("Digite o valor inicial para a calculadora: ");
		int inicial = Integer.parseInt(scan.nextLine());
		System.out.println("Digite a raiz para a calculadora: ");
		int raiz = Integer.parseInt(scan.nextLine());
		System.out.println("Digite se voce quer calcular a PA ou PG do Valor Inicial: "+inicial+" e Raiz: "+ raiz);
		String calcular = scan.nextLine();
		String resultado = "O resultado do calculo da "+calcular+" é: "+ inicial;
		if(calcular.equalsIgnoreCase("PA")) {
			for(int count = 0; count < 9; count++) {
				inicial = inicial + raiz;
				resultado = resultado + ", " + inicial;
			}
		} else if(calcular.equalsIgnoreCase("PG")){
			for(int count = 0; count < 9; count++) {
				inicial = inicial * raiz;
				resultado = resultado + ", " + inicial;
			}
			System.out.println(resultado+".");
		} else {
			System.out.println("Operacao não foi informada corretamente!");
		}
        	

//      Exercicio 17
//		Crie um programa em Java que, utilizando a classe Scanner, 
//		  calcule o fatorial de um número inteiro de 0 a 10. 
//		  O programa deve pedir para o usuário inserir um número inteiro, 
//		  mas só deve aceitar valores de 0 a 10, e então deve calcular 
//		  o fatorial desse número e escrever o resultado na tela.
//		Lembrando que fatorial de 0 é 1, fatorial de 1 é 1.
		System.out.println("Digite um numero inteiro entre 0 e 10");
		int fatorial = Integer.parseInt(scan.nextLine());
		if(fatorial < 0 || fatorial > 10) {
			System.out.println("Valor Invalido");
		} else {
			System.out.println("O fatorial de "+fatorial+" é: "+ recursao(fatorial));
		}
        scan.close();
	}
	
	public static int recursao(int i) {
		if(i == 0 || i == 1) {
			return 1;
		} else {
			return i * recursao(i-1);
		}
	}

}
