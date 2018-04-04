package br.com.sam.pocs.fatorialRecursivo;

import java.util.Scanner;

import br.com.sam.pocs.fatorial.Fatorial;

public class FatorialRecursivo {

	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
		long fatorial;
		
		do{		
			System.out.println("Entre com um número positivo: ");
			fatorial = scan.nextInt();
		if(fatorial < 0){
			System.out.println("Número inválido entre com um número novamente");			
		}
		System.out.println(fatorial);
		} while (fatorial < 0);
		
		System.out.println("Fatorial com recursividade ===>> ");
		long tempoInicialRecursivo = System.currentTimeMillis();
		System.out.println(FatorialRecursivo.fatorialRecursivo(fatorial));	
		long tempoFinalRecursivo = System.currentTimeMillis();
		System.out.println("O metodo executou em " +( tempoInicialRecursivo - tempoFinalRecursivo));
	}

	/**
	 * O FATORIAL de um numero e igual a esse numero X esse numero - 1.
	 * O FATORIAL e representado pelo simbolo !
	 * fatorial(5) = 5 fatorial(4)
	 * fatorial(4) = 4 fatorial(3)
	 * fatorial(3) = 3 fatorial(2)
	 * fatorial(2) = 2 fatorial(1)
	 * fatorial(1) = 1 fatorial(0)
	 * fatorial(0) = 1 
	 * @param num
	 * @return Long total
	 */
	public static long fatorialRecursivo(long num){
		if(num == 0){
			return 1;
		}		
		return num * fatorialRecursivo(num - 1);
	}
}
