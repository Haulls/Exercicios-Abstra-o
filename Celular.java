package exercícios;

import java.util.Scanner;

public class Celular {

	public static void main(String[] args) {
			
		Celular1 Celular = new Celular1();
		
		Celular.ano=2020;
		Celular.modelo="Galaxy j4";
		Celular.cor = "Preto";
		Celular.SO = "Android10";
		Celular.ligar();
		Celular.Desligar();
		Celular.vibrar();
	
	
	System.out.println(Celular.ano);
	System.out.println(Celular.modelo);
	System.out.println(Celular.cor);
	System.out.println(Celular.SO);
	}
		

	
		public static class Celular1{
			
				Scanner sc = new Scanner(System.in);
		
		int ano;
		String cor;
		String modelo;
		String SO;
		
		void ligar() {
			System.out.println("Ligando....");
		}
		void Desligar() {
			System.out.println("Desligando....");
		}
		void vibrar() {
			System.out.println("Vibrando....");
		}

		
		
		
		
			}
		}
			

	

	


