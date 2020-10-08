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

package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import model.Persona;

public class ControladoraInformacion {
	
	// --------------------------------------------------------------------------------------
	
	// RELACIONES CON OTRAS CLASES
	
	Persona persona;

	// --------------------------------------------------------------------------------------
	
	// TAB'S DEL SISTEMA

	@FXML
	private Tab inicialesTab;
	
	@FXML
	private Tab finalesTab;
	
	@FXML
	private Tab velocidadesTab;
	
	// --------------------------------------------------------------------------------------

	@FXML
	private TextField vivica;

	@FXML
	private TextField vivicb;

	@FXML
	private TextField vimca;

	@FXML
	private TextField vimcb;
	
	// *********************************************
	
	@FXML
	private TextField vfvfca;

	@FXML
	private TextField vfvfcb;

	@FXML
	private TextField vfmca;
	
	@FXML
	private TextField vfmcb;
	
	// *********************************************
	
	@FXML
	private TextField vvica;

	@FXML
	private TextField vvicb;

	@FXML
	private TextField vvfca;

	@FXML
	private TextField vvfcb;

	// --------------------------------------------------------------------------------------

	@FXML
	private Button botonvi;
	
	@FXML
	private Button botonvf;
	
	@FXML
	private Button vboton;
	
	// --------------------------------------------------------------------------------------

	@FXML
	private Label vivfca;

	@FXML
	private Label vivfcb;
	
	// *********************************************

	@FXML
	private Label vfvica;

	@FXML
	private Label vfvicb;
	
	// *********************************************

	@FXML
	private Label vmca;

	@FXML
	private Label vmcb;
	
	// --------------------------------------------------------------------------------------

	@FXML
	public void calcularv(ActionEvent event) {

	}
	
	// --------------------------------------------------------------------------------------

	@FXML
	public void calcularvf(ActionEvent event) {
				
		double velocidadInicial1 = Double.parseDouble(vivica.getText());
		
		double velocidadInicial2 = Double.parseDouble(vivicb.getText());
		
		double masa1 = Double.parseDouble(vimca.getText());
		
		double masa2 = Double.parseDouble(vimcb.getText());
		
		// *********************************************
		
		double resultado1 = persona.vfc1(masa1, masa2, velocidadInicial1, velocidadInicial2);
		
		double resultado2 = persona.vfc2(masa1, masa2, velocidadInicial1, velocidadInicial2, resultado1);
		
		// *********************************************
		
		String resultado1Mostrar = String.valueOf(resultado1);
		
		String resultado2Mostrar = String.valueOf(resultado2);
		
		// *********************************************
		
		vivfca.setText(resultado1Mostrar);
		
		vivfcb.setText(resultado2Mostrar);
		
	}
	
	// --------------------------------------------------------------------------------------

	@FXML
	public void calcularvi(ActionEvent event) {

	}

	// --------------------------------------------------------------------------------------

}
