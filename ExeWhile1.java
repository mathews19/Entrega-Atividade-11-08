package PacoteJavaExec;

import java.util.Scanner;

public class ExeWhile1 {

	public static void main(String[] args) {
		int cmenor=0,centre=0,total,cmaior=0,idade;
		
		System.out.println("Entre com a idade !");
		Scanner ler = new Scanner(System.in);
		idade = ler.nextInt();
		
		while(idade!=-99 && idade>0) {
			if(idade<=21) {
				cmenor = cmenor +1;
			}else {
				if (idade>=50) {
					cmaior = cmaior +1;
				}else {
					centre= centre + 1;
				}
			}
			System.out.println("Entre com outra idade !");
			idade = ler.nextInt();
		}
		total = cmaior+cmenor+centre;
		
		System.out.println("O número de pessoas menor de 21 anos é de "+cmenor);
		System.out.println("O número de pessoas maior de 50 anos é de "+cmaior);
		System.out.println("O número total de pessoas é de "+total);
		

	}

}
