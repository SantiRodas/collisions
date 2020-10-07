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

public class Persona {
	
	// --------------------------------------------------------------------------------------
	
	// CONSTANTES PARA UTILIZAR EN EL PROGRAMA
	
	public final static String ROL_PROFESOR = "Profesor";
	public final static String ROL_ESTUDIANTE = "Estudiante";
	
	// --------------------------------------------------------------------------------------
	
	// ATRIBUTOS DE LA CLASE PERSONA
	
	private String nombre;
	
	private String rol;
	
	// --------------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CLASE PERSONA
	
	public Persona(String nombre, String rol) {

		this.nombre = nombre;
		
		this.rol = rol;
		
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
	
}
