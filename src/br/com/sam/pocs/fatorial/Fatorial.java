package br.com.sam.pocs.fatorial;

import java.util.Scanner;

public class Fatorial {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		
		int num;
		
		long tempoInicial;
		long tempoFinal;
		do{
			System.out.println("Entre com um número positivo: ");
			num = scan.nextInt();
		if(num < 0){
			System.out.println("Número inválido entre com um número novamente");			
		}
		System.out.println("Fatorial sem recursividade ===>> ");
		tempoInicial = System.currentTimeMillis();
		} while (num < 0);{
			System.out.println(Fatorial.fatorial(num));
		}
		tempoFinal = System.currentTimeMillis();
		System.out.println("O metodo executou em " +( tempoFinal - tempoInicial));
	}

	/**
	 * O FATORIAL de um numero e igual a esse numero X esse numero - 1.
	 * O FATORIAL e representado pelo simbolo !
	 * 	5! = 5*4*3*2*1 = 120
	 *  0! = 1
	 * @param num
	 * @return Long total
	 */

	public static long fatorial (long num){
	
		if(num == 0){
			return 1;
		}
		int total = 1;
		
		for(long i=num;i>1;i--){
			total *= i;
		}
		
		return total;
	}
	
}
