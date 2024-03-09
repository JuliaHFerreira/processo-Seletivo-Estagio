package Exercicio_4;

import java.util.Scanner;

public class application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int interruptor = 0;
		int acerto = 0;
		int tentativa = 2;
		String resposta;
		
		System.out.println("Qual quarto quer acender a luz (1 a 3)");
		int quarto = sc.nextInt();
		
		while(tentativa>=1) {
			
			if(acerto==1) {
				System.out.println("Qual quarto quer acender a luz (1 a 3)");
				quarto = sc.nextInt();
			}
			System.out.println("Qual interruptor você vai apertar?(1 a 3)");
			interruptor = sc.nextInt();
			
			if(interruptor==1) { //Quarto 3
				if(quarto == 3) {
					System.out.println("Você quer ir até o quarto? [S/N]");
					sc.nextLine();
					resposta = sc.nextLine();
					if(resposta.charAt(0) == 'S' || resposta.charAt(0) == 's'){
						System.out.println("\nParabens! Você acertou o quarto");
						acerto += 1;
						tentativa -=1;
					}
				}
				else if(quarto==2 || quarto==1){
					System.out.println("Você quer ir até o quarto? [S/N]");
					sc.nextLine();
					resposta = sc.nextLine();
					if(resposta.charAt(0) == 'S' || resposta.charAt(0) == 's'){
						System.out.println("Não acendeu a luz");
						tentativa -=1;
					}
				}
				else {
					System.out.println("Esse quarto não existe");
				}
			}
			
			else if(interruptor==2) {//Quarto 1
				if(quarto == 1) {
					System.out.println("Você quer ir até o quarto? [S/N]");
					sc.nextLine();
					resposta = sc.nextLine();
					if(resposta.charAt(0) == 'S' || resposta.charAt(0) == 's'){
						System.out.println("\nParabens! Você acertou o quarto");;
						acerto += 1;
						tentativa -=1;
					}
				}
				else if(quarto==2 ||quarto==3){
					System.out.println("Você quer ir até o quarto? [S/N]");
					sc.nextLine();
					resposta = sc.nextLine();
					if(resposta.charAt(0) == 'S' || resposta.charAt(0) == 's'){
						System.out.println("Não acendeu a luz");
						tentativa -=1;
					}
				}
				else {
					System.out.println("Esse quarto não existe");
				}
			}
			
			else if(interruptor==3) { //Quarto 2
				if(quarto == 2) {
					System.out.println("Você quer ir até o quarto? [S/N]");
					sc.nextLine();
					resposta = sc.nextLine();
					if(resposta.charAt(0) == 'S' || resposta.charAt(0) == 's'){
						System.out.println("\nParabens! Você acertou o quarto");;
						acerto += 1;
						tentativa -=1;
					}
				}
				else if(quarto==1 ||quarto==3){
					System.out.println("Você quer ir até o quarto? [S/N]");
					sc.nextLine();
					resposta = sc.nextLine();
					if(resposta.charAt(0) == 'S' || resposta.charAt(0) == 's'){
						System.out.println("Não acendeu a luz");
						tentativa -=1;
					}
				}
				else {
					System.out.println("Esse quarto não existe");
				}	
			}
			else {
				System.out.println("Não existe esse quarto ou sala");
				tentativa = 0;
			}
		}
		if(acerto ==2) {
			System.out.println("\nInterruptor 1 = Quarto 3");
			System.out.println("Interruptor 2 = Quarto 1");
			System.out.println("Interruptor 3 = Quarto 2");
		}
		else {
			System.out.println("Você não descorbriu qual interruptor acende cada quarto");
		}
		sc.close();
	}
}