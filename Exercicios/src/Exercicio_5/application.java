package Exercicio_5;

import java.util.Scanner;

public class application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String palavra = sc.nextLine();
		
		char[] palaChar = palavra.toCharArray(); //convertendo sring para char
		int aux = palavra.length()-1;
		
		for(int i=0; i<palavra.length(); i++) { 
			System.out.printf("%s",palaChar[aux-i]);
		}
		sc.close();

	}

}
