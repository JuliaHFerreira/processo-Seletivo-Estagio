package Exercicio_3;

import java.util.Scanner;

public class application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int aux = 0;
		
		// Letra A
		int a=1;
		System.out.println ("Informe o tamanho da sequencia: ");
		int num = sc.nextInt();
		System.out.println("\nQuestão A");
		for(int i=0; i<num; i++) {
			System.out.printf(" %d", a);
			a +=2;
		}
		System.out.println(""); //pulando linha
		
		// Letra b
		int b=2;
		System.out.println("\nQuestão B");
		for(int i=0; i<num; i++) {
			System.out.printf(" %d", b);
			b *=2;
		}
		System.out.println(""); //pulando linha
		
		// Letra C
		int c=0;
		System.out.println("\nQuestão C");
		for(int i=0; i<num; i++) {	
			c = aux*aux;
			aux++;
			System.out.printf(" %d", c);
		}
		System.out.println(""); //pulando linha
		
		// Letra d
		int d=0;
		aux = 2;
		System.out.println("\nQuestão D");
		for(int i=0; i<num; i++) {	
			d = aux*aux;
			aux = aux+2;
			System.out.printf(" %d", d);
		}
		System.out.println(""); //pulando linha
		
		// Letra E
		int e=1;
		aux = 1;
		System.out.println("\nQuestão E");
		for(int i=0; i<num; i++) {	
			System.out.printf(" %d", e);
			int aux2 = aux;
			aux = aux2+e;
			e = aux2;
		}
		System.out.println(""); //pulando linha
		
		// Letra F
		// não consegui montar nenhum algoritimo automatico que faca esse calculo

	sc.close();
	}
}
