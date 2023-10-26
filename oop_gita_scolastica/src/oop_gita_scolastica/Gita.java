package oop_gita_scolastica;

public class Gita {
	
	// ATTRIBUTI:
	
	private String destinazione;
	private int dim = 0;
	private int n_studenti_inseriti;
	private Studente aS[];
	
	// COSTRUTTORE DEFAULT:
	
	Gita(){
		this.destinazione = "";
		dim = 0;
		n_studenti_inseriti = 0;
		aS = new Studente[dim];
		
	}
	
	
	// COSTRUTTORE CON PARAMETRI:
	
	Gita(String destinazione, int dim){
		this.destinazione = destinazione;
		this.dim = dim;
		n_studenti_inseriti = 0;
		aS = new Studente[dim];
		
	}
	
	
	// INSERIMENTO STUDENTI:
	
	public void inserimento_studenti() {
		if(n_studenti_inseriti < dim) {
				Studente s = new Studente();
				
				System.out.println("Inserire studente n" + (n_studenti_inseriti + 1) + ": ");
				System.out.println();
				s.inserimento();
				
				aS[n_studenti_inseriti] = s;
				n_studenti_inseriti ++;
				
		}else {
			System.out.println("Errore: il programma è PIENO!");
			
		}
	}
	
	
	
	// VISUALIZZA INFORMAZIONI STUDENTI:
	
	public void visualizza_info_studenti() {
		if(n_studenti_inseriti > 0) {
			for(int i = 0; i < n_studenti_inseriti; i++) {
				aS[i].visualizza();
				
			}
		}else {
			System.out.println("Erroe: il programma è VUOTO!");
			
		}
	}
	
	
	
	// VISUALIZZA QUOTA STUDENTE:
	
	public void visualizza_quota_studente(String cognome, String nome) {
		if(n_studenti_inseriti > 0) {
			for(int i = 0; i < n_studenti_inseriti; i++) {
				if(aS[i].getNome().equalsIgnoreCase(nome) && (aS[i].getCognome().equalsIgnoreCase(cognome))) {
					aS[i].visualizza_quota();
					
				}
			}
		}else {
			System.out.println("Errore: il programma è VUOTO!");
			
		}
	}
	
	
	// AGGIUNTA EURO STUDENTE:
	
	public void aggiunta_euro(String cognome, String nome, int euro) {
		if(n_studenti_inseriti > 0) {
			for(int i = 0; i < n_studenti_inseriti; i++) {
				if(aS[i].getCognome().equalsIgnoreCase(cognome) && (aS[i].getNome().equalsIgnoreCase(nome))) {
					aS[i].setEuro_pagati(aS[i].getEuro_pagati() + euro);
					
				}
			}
		}
	}
	
	
	// ELIMINA STUDENTE:
	
	public void elimina_studente(String cognome, String nome) {
		if(n_studenti_inseriti > 0) {
			for(int i = 0; i < n_studenti_inseriti; i++) {
				if(aS[i].getCognome().equalsIgnoreCase(cognome) && (aS[i].getNome().equalsIgnoreCase(nome))) {
					aS[i] = aS[n_studenti_inseriti -1];
					aS[i] = null;
					n_studenti_inseriti --;
				}
			}
		}
	}
	
	
	// VISUALIZZA IN ORDINE ALFABETICO:
	
	void visualizza_in_ordine_alfabetico() {
		Studente temp;
		int n_max = n_studenti_inseriti - 1;
		int n_min = 0;
		int i;
		int j;

		for(i = 0; i < n_studenti_inseriti; i++) {
			for(j = i + 1; j < n_studenti_inseriti; j++) {
				if(aS[i].getCognome().compareToIgnoreCase(aS[j].getCognome()) > 0) {
					temp = aS[i];
					aS[i] = aS[j];
					aS[j] = temp;

				}
			}
		}

		if(n_studenti_inseriti > 0) {
			for(i = 0; i < n_studenti_inseriti; i++) {
				aS[i].visualizza();

			}
		}else {
			System.out.println("Errore: impossibile visualizzare i dati del programma => il programma è vuoto");
			
		}


	}
	
	
	
	
	
	
	
	
	

}
