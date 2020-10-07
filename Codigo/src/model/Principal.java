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

public class Principal {
	
	// --------------------------------------------------------------------------------------
	
	// RELACION CON LA CLASE PERSONA
	
	ArrayList<Persona> personas;
	
	// --------------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LA CLASE PERSONA
	
	public Principal() {
		
		personas = new ArrayList<>();
		
	}
	
	// --------------------------------------------------------------------------------------
	
	// METODO PARA AGREGAR PERSONA EN EL SISTEMA
	
	public void agregarSistema(String nombre, String rol) {
		
		personas.add(new Persona(nombre, rol));
		
	}
	
	// --------------------------------------------------------------------------------------

}
