package oop_gita_scolastica;

import java.util.Scanner;

public class Studente {
	
	// ATTRIBUTI
	
	private String cognome;
	private String nome;
	private String classe;
	private int euro_pagati;
	
	
	// COSTRUTTORE DEFAULT:
	
	Studente(){
		this.cognome = "";
		this.nome = "";
		this.classe = "";
		this.euro_pagati = 0;
		
	}
	
	
	// COSTRUTTORE CON PARAMETRI:
	
	Studente(String cognome, String nome, String classe, int euro_pagati){
		this.cognome = cognome;
		this.nome = nome;
		this.classe = classe;
		this.euro_pagati = euro_pagati;
		
	}
	
	
	// SET & GET:
	
	
	// COGNOME:
	
	public void setCognome(String cognome) {
		if(cognome.length() > 0) {
			this.cognome = cognome;
			
		}else {
			this.cognome = "";
			
		}
	}
	
	public String getCognome() {
		return cognome;
	}
	
	
	// NOME:
	
	public void setNome(String nome) {
		if(nome.length() > 0) {
			this.nome = nome;
			
		}else {
			this.nome = "";
			
		}
	}
	
	public String getNome() {
		return nome;
		
	}
	
	
	// CLASSE:
	
	public void setClasse(String classe) {
		if(classe.length() > 0) {
			this.classe = classe;
			
		}else {
			this.classe = "";
			
		}
	}
	
	public String getClasse() {
		return classe;
		
	}
	
	
	// EURO_PAGATI:
	
	public void setEuro_pagati(int euro_pagati) {
		if(euro_pagati > 0) {
			this.euro_pagati = euro_pagati;
			
		}else {
			this.euro_pagati = 0;
			
		}
	}
	
	public int getEuro_pagati() {
		return euro_pagati;
		
	}
	
	
	
	// INSERIMENTO:
	
	public void inserimento() {
		Scanner keyboard = new Scanner(System.in);
		
		String cognome;
		String nome;
		String classe;
		int euro_pagati;
		
		
		// COGNOME:
		
		do {
			System.out.print("Cognome: ");
			cognome = keyboard.nextLine();
			
		}while(cognome.length() <= 0);
		setCognome(cognome);
		
		
		// NOME:
		
		do {
			System.out.print("Nome: ");
			nome = keyboard.nextLine();
			
		}while(nome.length() <= 0);
		setNome(nome);
		
		
		// CLASSE:
		
		do {
			System.out.print("Classe: ");
			classe = keyboard.nextLine();
			
		}while(classe.length() <= 0);
		setClasse(classe);
		
		
		// EURO_PAGATI:
		
		do {
			System.out.print("Euro pagati: ");
			euro_pagati = keyboard.nextInt();
			keyboard.nextLine();
			
		}while(euro_pagati < 0);
		setEuro_pagati(euro_pagati);
		
	}
	
	
	
	// VISUALIZZA:
	
	public void visualizza() {
		System.out.println();
		System.out.println(" - STUDENTE - ");
		System.out.println("Cognome: " + cognome);
		System.out.println("Nome: " + nome);
		System.out.println("Classe: " + classe);
		System.out.println("Euro pagati: " + euro_pagati);
		System.out.println();
		
	}
	
	
	// VISUALIZZA QUOTA:
	
	public void visualizza_quota() {
		System.out.println();
		System.out.println("Euro pagati: " + euro_pagati);
		System.out.println();
		
	}
	
	
	
	// TO STRING:
	
	public String toString() {
		return "Cognome: " + getCognome() + " Nome: " + getNome() + " Classe: " + getClasse() + " Euro pagati: " + getEuro_pagati();
		
	}
	
}
