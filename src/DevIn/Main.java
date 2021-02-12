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
        System.out.println("Digite um numero com 2 ou mais casas apos a . Exemplo: 22.22");
        // float valor = scan.nextFloat(); // funciona com , =n�o consome a linha assim foi trocado pelo nextLine
        float valor = Float.parseFloat(scan.nextLine()); //funciona com .
        int valorConvertido = Math.round(valor);
        System.out.printf("O valor digitado em inteiro �: %d \n", valorConvertido);
        
//      Exercicio 9
//      Crie um programa em Java que, utilizando a classe Scanner, 
//        pe�a ao usu�rio que digite um nome qualquer, e em seguida escreva na tela 
//        o tamanho de letras que o nome possui.
        System.out.println("Digite nome qualquer, para saber a quantidade de letras que o nome possui");
        String palavra = scan.nextLine();
        palavra = palavra.trim();
        System.out.println("O numero de letras da palavra ("+palavra+") escolhida �: "+ palavra.length());
        
//      Exercicio 10
//      Crie um programa em Java que, utilizando a classe Scanner, 
//        pergunte ao usu�rio a seguinte frase: �Adivinhe qual n�mero de 1 a 5 eu estou pensando�. 
//        Na sequ�ncia, o usu�rio deve inserir um n�mero entre 1 e 5, 
//        e o seu programa deve gerar aleatoriamente outro n�mero, 
//        tamb�m de 1 a 5. Se o n�mero gerado for o mesmo que o usu�rio inseriu, 
//        o programa deve escrever na tela �Voc� acertou!�, mas se for diferente, 
//        o programa deve escrever �Voc� errou, o n�mero correto era X�, 
//        onde X � o n�mero gerado aleatoriamente pelo programa.
        int valorGerado = (int)(Math.random() * 5) + 1;
        System.out.println("Adivinhe qual n�mero de 1 a 5 eu estou pensando");
        int valorUsuario = Integer.parseInt((scan.nextLine()));
        if(valorGerado == valorUsuario) {
        	System.out.println("Voc� acertou! O valor gerado era: " + valorGerado);
        } else {
        	System.out.println("Voc� errou, o n�mero correto era " + valorGerado);
        }

//      Exercicio 11
//      Crie um programa em Java que, utilizando a classe Scanner, 
//        pergunte ao usu�rio sua data de nascimento e calcule a sua idade. 
//        Se o usu�rio tiver 18 anos ou mais, escreva na tela �voc� � maior de idade�, 
//        mas caso tenha menos de 18 anos, escreva �voc� � menor de idade�.
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
        	System.out.println("Voc� � maior de idade.");
        } else {
        	System.out.println("Voc� � menor de idade.");
        }
        
//      Exercicio 12
//      Crie um programa em Java que, utilizando a classe Scanner, 
//        pe�a ao usu�rio para inserir um n�mero inteiro. 
//        O programa deve verificar se o n�mero � par ou �mpar, 
//        e exibir essa informa��o de volta ao usu�rio.
        System.out.println("Digite um valor inteiro ");
        int inteiro = Integer.parseInt(scan.nextLine());
        System.out.println( (inteiro & 1)== 0 
        		? "O valor " + inteiro+" � par" 
        		: "O valor " + inteiro+" � impar");
        
//      Exercicio 13
//      Crie um programa em Java que, utilizando a classe Scanner, 
//        pe�a ao usu�rio para inserir as notas do semestre, 
//        e deve retornar a m�dia final. 
//        O programa deve pedir 3 notas, que devem ser n�meros reais, 
//        e retornar um n�mero real com 2 casas depois da v�rgula, 
//        com o texto �Sua m�dia final �:� seguido do valor.
        System.out.println("Insira as notas do Semestre");
        System.out.println("Digite a primeira nota");
        float notaUm = Float.parseFloat(scan.nextLine());
        System.out.println("Digite a segunda nota");
        float notaDois = Float.parseFloat(scan.nextLine());
        System.out.println("Digite a terceira nota");
        float notaTres = Float.parseFloat(scan.nextLine());
        float media = (notaUm+notaDois+notaTres)/3;
        System.out.printf("Sua m�dia final �: %.2f \n", media);

//      Exercicio 14
//      Crie um programa em Java que, utilizando a classe Scanner, 
//		  simule uma calculadora. O programa deve pedir um n�mero, depois outro, 
//		  e por �ltimo uma opera��o. O sistema deve aceitar como opera��o qualquer 
//		  uma dessas 4 strings: �somar�, �subtrair�, �multiplicar� ou "dividir", 
//		  e realizar a opera��o correspondente entre os 2 n�meros inseridos, 
//		  para ent�o escrever na tela do usu�rio o resultado.
		System.out.println("Calculadora");
		System.out.println("Digite o primeiro valor para a calculadora: ");
		int numeroUm = Integer.parseInt(scan.nextLine());
		System.out.println("Digite o segundo valor para a calculadora: ");
		int numeroDois = Integer.parseInt(scan.nextLine());
		boolean cont = true;
		while(cont == true) {
			System.out.println("Digite uma opera��o para a calculadora. Exemplos: somar, subtrair, multiplicar ou dividir");
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
					System.out.println("Voce n�o digitou uma operacao valida, tente novamente");
					break;
			}
		}

//      Exercicio 16
//      Crie um programa em Java que, utilizando a classe Scanner, 
//		  simule uma calculadora de P.A. e P.G. 
//		Pe�a para o usu�rio inserir um �valor inicial�, 
//		  que deve ser um n�mero inteiro. 
//		Em seguida, pe�a ao usu�rio para inserir um valor para a raiz. 
//		Depois, pergunte ao usu�rio se ele deseja calcular 
//		  os 10 primeiros valores de uma P.A. ou de uma P.G. 
//		  para os n�meros inseridos anteriormente. 
//		Ent�o, calcule os 10 primeiros valores de uma P.A. ou P.G. 
//		  utilizando os n�meros inseridos pelo usu�rio, 
//		  e escreva essa sequ�ncia de valores na tela 
//		  para o usu�rio visualizar o resultado. 
		System.out.println("Calculadora PA e PG");
		System.out.println("Digite o valor inicial para a calculadora: ");
		int inicial = Integer.parseInt(scan.nextLine());
		System.out.println("Digite a raiz para a calculadora: ");
		int raiz = Integer.parseInt(scan.nextLine());
		System.out.println("Digite se voce quer calcular a PA ou PG do Valor Inicial: "+inicial+" e Raiz: "+ raiz);
		String calcular = scan.nextLine();
		String resultado = "O resultado do calculo da "+calcular+" �: "+ inicial;
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
			System.out.println("Operacao n�o foi informada corretamente!");
		}
        	

//      Exercicio 17
//		Crie um programa em Java que, utilizando a classe Scanner, 
//		  calcule o fatorial de um n�mero inteiro de 0 a 10. 
//		  O programa deve pedir para o usu�rio inserir um n�mero inteiro, 
//		  mas s� deve aceitar valores de 0 a 10, e ent�o deve calcular 
//		  o fatorial desse n�mero e escrever o resultado na tela.
//		Lembrando que fatorial de 0 � 1, fatorial de 1 � 1.
		System.out.println("Digite um numero inteiro entre 0 e 10");
		int fatorial = Integer.parseInt(scan.nextLine());
		if(fatorial < 0 || fatorial > 10) {
			System.out.println("Valor Invalido");
		} else {
			System.out.println("O fatorial de "+fatorial+" �: "+ recursao(fatorial));
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
