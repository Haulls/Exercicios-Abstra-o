package exercícios;

import java.util.Scanner;



public class Bicicleta {
	public static void main(String[] args) {
Bicicleta3 bicicleta = new Bicicleta3();
		
		bicicleta.nome="KSW";
		bicicleta.ano=2021;
		bicicleta.modelo="Aro29";
		bicicleta.cor = "Branca";
		bicicleta.estilo = "Feita para corridas!";
	
	System.out.println(bicicleta.nome);
	System.out.println(bicicleta.ano);
	System.out.println(bicicleta.modelo);
	System.out.println(bicicleta.cor);
	System.out.println(bicicleta.estilo);
	}
		

	
		public static class Bicicleta3{
			
				Scanner sc = new Scanner(System.in);
		
				String nome ;
			    int ano;
				String cor ; 
				String modelo ; 
				String material ;
				String estilo ;

		
		
		
			}
		}

