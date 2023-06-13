package com.inti.beans;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class CB extends Paiement {
	
	/**
	 * test github
	 */
	
	private int numeroCarte;
	private LocalDate dateExpiration;
	
	
	public CB() {
		super();
	}


	public CB(int id, double montant, LocalDate date, int numeroCarte, LocalDate dateExpiration) {
		super(id, montant, date);
		this.numeroCarte = numeroCarte;
		this.dateExpiration = dateExpiration;
	}


	public int getNumeroCarte() {
		return numeroCarte;
	}


	public void setNumeroCarte(int numeroCarte) {
		this.numeroCarte = numeroCarte;
	}


	public LocalDate getDateExpiration() {
		return dateExpiration;
	}


	public void setDateExpiration(LocalDate dateExpiration) {
		this.dateExpiration = dateExpiration;
	}


	@Override
	public String toString() {
		return "CB [numeroCarte=" + numeroCarte + ", dateExpiration=" + dateExpiration + "]";
	}
	
	
	

}
