package exercícios;

import java.util.Scanner;



public class Computdor {
	public static void main(String[] args) {

		computador computador = new computador();

		computador.nome = "PC Gamer Mancer, Intel Core I7, GTX 1650 4GB, 16GB DE RAM, SSD 240GB, Fonte 500W 80 Plus";
		computador.ano = 2021;
		computador.modelo = "Mancer";
		computador.cor = "Branco";
		computador.estilo = "Feita para jogos!";

		System.out.println(computador.nome);
		System.out.println(computador.ano);
		System.out.println(computador.modelo);
		System.out.println(computador.cor);
		System.out.println(computador.estilo);
	}

	public static class computador {

		Scanner sc = new Scanner(System.in);

		int ano;
		String cor;
		String modelo;
		String nome;
		String estilo;
	}

}
