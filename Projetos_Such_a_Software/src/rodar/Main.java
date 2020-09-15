package rodar;

import estrutura.Atendente;

public class Main {

	public static void main(String[] args) {
		Atendente atendente1 = new Atendente();
		Atendente atendente2 = new Atendente();
		
		atendente1.setCargo("Gente boa");
		System.out.println(atendente1.getCargo());

		atendente2.setCargo("oia");
		System.out.println(atendente2.getCargo());
	}

}
