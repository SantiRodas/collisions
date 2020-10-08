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

import java.util.ArrayList;

public class Persona {

	// --------------------------------------------------------------------------------------

	// CONSTANTES PARA UTILIZAR EN EL PROGRAMA

	public final static String ROL_PROFESOR = "Profesor";
	public final static String ROL_ESTUDIANTE = "Estudiante";

	// --------------------------------------------------------------------------------------

	// RELACIONES

	ArrayList<Calculo> calculos;

	// --------------------------------------------------------------------------------------

	// ATRIBUTOS DE LA CLASE PERSONA

	private String nombre;

	private String rol;

	// --------------------------------------------------------------------------------------

	// METODO CONSTRUCTOR DE LA CLASE PERSONA

	public Persona(String nombre, String rol) {

		this.nombre = nombre;

		this.rol = rol;

		calculos = new ArrayList<>();

	}

	// --------------------------------------------------------------------------------------

	// METODOS GET DE LA CLASE PERSONA

	public String getNombre() {
		return nombre;
	}

	public String getRol() {
		return rol;
	}

	// --------------------------------------------------------------------------------------

	// METODOS SET DE LA CLASE PERSONA

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	// --------------------------------------------------------------------------------------

	// METODO PARA AGREGAR CALCULO

	public void agregarCalculo(double velocidadInicialA, double velocidadFinalA, double masaA, double velocidadInicialB, double velocidadFinalB, double masaB) {

		calculos.add(new Calculo(velocidadInicialA, velocidadFinalA, masaA, velocidadInicialB, velocidadFinalB, masaB));

	}

	// --------------------------------------------------------------------------------------
	
	// METODO PARA ENCONTRAR LA VELOCIDAD FINAL DE LA PRIMERA PARTICULA
	
	public double vfc1 (double m1, double m2, double vi1, double vi2) {
		
		double total = 0;
		
		total = ((m1 - m2 / m1 + m2)*vi1) + ((2*m2 / m1 + m2) * vi2);
		
		return total;
		
	}
	
	// --------------------------------------------------------------------------------------
	
	// METODO PARA ENCONTRAR LA VELOCIDAD FINAL DE LA SEGUNDA PARTICULA
	
	public double vfc2 (double m1, double m2, double vi1, double vi2, double vf1) {
		
		double total = 0;
		
		total = ((m1 / m2) * (vi1 - vf1)) + vi2;
		
		return total;
		
	}
	
	// --------------------------------------------------------------------------------------

}
