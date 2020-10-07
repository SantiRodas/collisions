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
	
	private double masaInicialA;
	
	private double masaFinalA;
	
	// ***************************************
	
	private double velocidadInicialB;
	
	private double velocidadFinalB;
	
	private double masaInicialB;
	
	private double masaFinalB;
	
	// --------------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CLASE CALCULO

	public Calculo(double velocidadInicialA, double velocidadFinalA, double masaInicialA, double masaFinalA, double velocidadInicialB, double velocidadFinalB, double masaInicialB, double masaFinalB) {

		this.velocidadInicialA = velocidadInicialA;
		this.velocidadFinalA = velocidadFinalA;
		this.masaInicialA = masaInicialA;
		this.masaFinalA = masaFinalA;
		
		this.velocidadInicialB = velocidadInicialB;
		this.velocidadFinalB = velocidadFinalB;
		this.masaInicialB = masaInicialB;
		this.masaFinalB = masaFinalB;
		
	}
	
	// --------------------------------------------------------------------------------------
	
	// METODOS GET DE LA CLASE CALCULO

	public double getVelocidadInicialA() {
		return velocidadInicialA;
	}
	
	public double getVelocidadFinalA() {
		return velocidadFinalA;
	}
	
	public double getMasaInicialA() {
		return masaInicialA;
	}
	
	public double getMasaFinalA() {
		return masaFinalA;
	}
	
	// ***************************************
	
	public double getVelocidadInicialB() {
		return velocidadInicialB;
	}
	
	public double getVelocidadFinalB() {
		return velocidadFinalB;
	}
	
	public double getMasaInicialB() {
		return masaInicialB;
	}
	
	public double getMasaFinalB() {
		return masaFinalB;
	}
	
	// --------------------------------------------------------------------------------------
	
	// METODOS SET DE LA CLASE CALCULO
	
	public void setVelocidadInicialA(double velocidadInicialA) {
		this.velocidadInicialA = velocidadInicialA;
	}
	
	public void setVelocidadFinalA(double velocidadFinalA) {
		this.velocidadFinalA = velocidadFinalA;
	}

	public void setMasaInicialA(double masaInicialA) {
		this.masaInicialA = masaInicialA;
	}

	public void setMasaFinalA(double masaFinalA) {
		this.masaFinalA = masaFinalA;
	}
	
	// ***************************************

	public void setVelocidadInicialB(double velocidadInicialB) {
		this.velocidadInicialB = velocidadInicialB;
	}

	public void setVelocidadFinalB(double velocidadFinalB) {
		this.velocidadFinalB = velocidadFinalB;
	}

	public void setMasaInicialB(double masaInicialB) {
		this.masaInicialB = masaInicialB;
	}

	public void setMasaFinalB(double masaFinalB) {
		this.masaFinalB = masaFinalB;
	}
	
	// --------------------------------------------------------------------------------------
	
}
