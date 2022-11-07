package exercícios;

import java.util.Scanner;



public class CadeiraGamer {
	public static void main(String[] args) {
cadeira cadeira1 = new cadeira();
		
		cadeira1.ano=2021;
		cadeira1.modelo="ThunderX3";
		cadeira1.cor = "Preto/vermelha";
		cadeira1.material = "couro";
		cadeira1.estilo = "cadeira gamer";
	
	
	System.out.println(cadeira1.ano);
	System.out.println(cadeira1.modelo);
	System.out.println(cadeira1.cor);
	System.out.println(cadeira1.material);
	System.out.println(cadeira1.estilo);
	}
		

	
		public static class cadeira{
			
				Scanner sc = new Scanner(System.in);
		
		int ano;
		String cor;
		String modelo;
		String material;
		String estilo;
		
		}
	}


