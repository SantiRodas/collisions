/*
 * UNIVERSIDAD ICESI
 * FISICA Y LABORATORIO
 * PROYECTO DE COLISIONES
 * 
 * SANTIAGO RODAS RODRIGUEZ
 * DIANA CARVAJAL TORO
 * JULIAN GONZALES
 * FELIPE GOMEZ
 */

package model;

public class Calculo {
	
	// --------------------------------------------------------------------------------------
	
	// ATRIBUTOS DE LA CLASE CALCULO
	
	private double velocidadInicialA;
	
	private double velocidadFinalA;
	
	private double masaA;
	
	// ***************************************
	
	private double velocidadInicialB;
	
	private double velocidadFinalB;
	
	private double masaB;
	
	
	// --------------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CLASE CALCULO

	public Calculo(double velocidadInicialA, double velocidadFinalA, double masaA, double velocidadInicialB, double velocidadFinalB, double masaB) {

		this.velocidadInicialA = velocidadInicialA;
		this.velocidadFinalA = velocidadFinalA;
		this.masaA = masaA;
		
		this.velocidadInicialB = velocidadInicialB;
		this.velocidadFinalB = velocidadFinalB;
		this.masaB = masaB;
		
	}
	
	// --------------------------------------------------------------------------------------
	
	// METODOS GET DE LA CLASE CALCULO

	public double getVelocidadInicialA() {
		return velocidadInicialA;
	}
	
	public double getVelocidadFinalA() {
		return velocidadFinalA;
	}
	
	public double getMasaA() {
		return masaA;
	}
		
	// ***************************************
	
	public double getVelocidadInicialB() {
		return velocidadInicialB;
	}
	
	public double getVelocidadFinalB() {
		return velocidadFinalB;
	}
	
	public double getMasaB() {
		return masaB;
	}
		
	// --------------------------------------------------------------------------------------
	
	// METODOS SET DE LA CLASE CALCULO
	
	public void setVelocidadInicialA(double velocidadInicialA) {
		this.velocidadInicialA = velocidadInicialA;
	}
	
	public void setVelocidadFinalA(double velocidadFinalA) {
		this.velocidadFinalA = velocidadFinalA;
	}

	public void setMasaA(double masaA) {
		this.masaA = masaA;
	}
	
	// ***************************************

	public void setVelocidadInicialB(double velocidadInicialB) {
		this.velocidadInicialB = velocidadInicialB;
	}

	public void setVelocidadFinalB(double velocidadFinalB) {
		this.velocidadFinalB = velocidadFinalB;
	}

	public void setMasaB(double masaB) {
		this.masaB = masaB;
	}
	
	// --------------------------------------------------------------------------------------
	
}
