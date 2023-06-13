package com.inti.beans;

import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn( name="discriminator", discriminatorType =
DiscriminatorType.INTEGER )
@DiscriminatorValue("0")
public class Paiement {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	protected int id;
	protected double montant;
	protected LocalDate date;
	
	public Paiement() {
		super();
	}
	public Paiement(double montant, LocalDate date) {
		super();
		this.montant = montant;
		this.date = date;
	}
	public Paiement(int id, double montant, LocalDate date) {
		super();
		this.id = id;
		this.montant = montant;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Paiement [id=" + id + ", montant=" + montant + ", date=" + date + "]";
	}
	
	
	

}
