package oop_gita_scolastica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		Gita gita;
		String destinazione;
		int dim;
		int scelta;
		
		do {
			System.out.print("Inserire la destinazione: ");
			destinazione = keyboard.nextLine();
		}while(destinazione.length() <= 0);
		
		
		do {
			System.out.print("Inserire la dimensione del programma (MAX 50): ");
			dim = keyboard.nextInt();
			keyboard.nextLine();
			
		}while((dim <= 0) || (dim > 50));
		
		gita = new Gita(destinazione, dim);
		
		System.out.println();
		System.out.println("Destinazione: " + destinazione);
		
		
		// MENU:
		
		do {
			System.out.println();
			System.out.println(" - MENU - ");
			System.out.println("1) Inserimento studenti");
			System.out.println("2) Visualizza studenti");
			System.out.println("3) Visualizza quota studente");
			System.out.println("4) Aggiunta euro studente");
			System.out.println("5) Elimina studente");
			System.out.println("6) Visualizza in ordine alfabetico");
			System.out.println("7) Esci dal programma");
			System.out.println();
			System.out.print("Opzione scelta: ");
			scelta = keyboard.nextInt();
			keyboard.nextLine();
			
			switch(scelta) {
			case 1:
				gita.inserimento_studenti();
				break;
				
			case 2:
				gita.visualizza_info_studenti();
				break;
				
			case 3:
				String cognome;
				String nome;
				
				System.out.print("Cognome: ");
				cognome = keyboard.nextLine();
				
				System.out.print("Nome: ");
				nome = keyboard.nextLine();
				
				gita.visualizza_quota_studente(cognome, nome);
				
			case 4:
				
				int euro;
				
				System.out.print("Cognome: ");
				cognome = keyboard.nextLine();
				
				System.out.print("Nome: ");
				nome = keyboard.nextLine();
				
				System.out.print("Aggiunta: ");
				euro = keyboard.nextInt();
				keyboard.nextLine();
				
				gita.aggiunta_euro(cognome, nome, euro);
				
			case 5:
				
				System.out.print("Cognome: ");
				cognome = keyboard.nextLine();
				
				System.out.print("Nome: ");
				nome = keyboard.nextLine();
				
				gita.elimina_studente(cognome, nome);
				
			case 6:
				gita.visualizza_in_ordine_alfabetico();
				
			}
			
		}while(scelta != 7);

	}

}
