package Exercicio_2;

import java.util.Scanner;

public class application {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Informe um número");
		int num = sc.nextInt();
		
		int fibA = 0, fibB = 1, resul = 0;
		
	    while (fibA < num) {
	        int aux = fibB;
	        fibB = fibA + fibB;
	        fibA = aux;
	        if(fibA==num) {
	        	resul = fibA;
	        }
		}
	    if(resul==num) {
	    	System.out.println(num + " pertence à sequência de Fibonacci.");
	    }
	    else {
	    	System.out.println(num + " não pertence à sequência de Fibonacci.");
	    }

	sc.close();

	}

}
