package br.com.adryan.kaki;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in);) {
			Integer tamanho = 0;
			System.out.println("informe o tamanho do ovo ");
			tamanho = ler.nextInt();
			Ovo ovo = new Ovo(tamanho);
			String fritar = "fritar"; 
			ovo.quebrar();
			while (!fritar.equals("parar")) {
				System.out.println("deseja fritar? ");
				fritar = ler.next();
				if (!fritar.equals("parar")) {
					ovo.fritar();
				}
			}
			ovo.pegarStatus();
			System.out.println(ovo.pegarStatus());
			
		}
	}
}