package PacoteJavaExec;

import java.util.Scanner;

public class ExeDoWhile1 {

	public static void main(String[] args) {
		int soma=0,x;
		do {
			System.out.println("Entre com um número diferente de Zero! ");
			Scanner ler = new Scanner(System.in);
			x = ler.nextInt();
			soma = soma + x;
			System.out.println("\nA soma dos valores digitados é de: "+soma);
		}while(x!=0);
		System.out.println("O valor digitado é Zero! Programa foi encerrado :( ");
	}

}
