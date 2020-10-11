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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import model.Persona;

public class ControladoraInformacion {

	// --------------------------------------------------------------------------------------

	// RELACIONES CON OTRAS CLASES

	Persona persona;

	// --------------------------------------------------------------------------------------

	// METODO CONSTRUCTOR

	public ControladoraInformacion() {

		persona = new Persona("", "");

	}

	// --------------------------------------------------------------------------------------

	// TAB'S DEL SISTEMA

	@FXML
	private Tab inicialesTab;

	@FXML
	private Tab finalesTab; 

	@FXML
	private Tab extraTab;

	// --------------------------------------------------------------------------------------
	
	// TEXT FIELD'S DEL SISTEMA

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

	// --------------------------------------------------------------------------------------
	
	// BOTONES DEL SISTEMA

	@FXML
	private Button botonvi;

	@FXML
	private Button botonvf;

	// --------------------------------------------------------------------------------------
	
	// LABELES DEL SISTEMA

	@FXML
	private Label vivfca;

	@FXML
	private Label vivfcb;

	// *********************************************

	@FXML
	private Label vfvica;

	@FXML
	private Label vfvicb;

	// --------------------------------------------------------------------------------------
	
	// METODO PARA CALULCAR VELOCIDAD FINAL DE AMBOS CUERPOS

	@FXML
	public void calcularvf(ActionEvent event) {

		try {

			double vf1 = Double.parseDouble(vfvfca.getText());

			double vf2 = Double.parseDouble(vfvfcb.getText());

			double m1 = Double.parseDouble(vfmca.getText());

			double m2 = Double.parseDouble(vfmcb.getText());

			// *********************************************
			
			double resultado1 = persona.vic1(m1, m2, vf1, vf2);
			
			double resultado2 = persona.vic2(m1, m2, vf1, vf2, resultado1);

			// *********************************************

			String resultado1Real = String.valueOf(resultado1);

			String resultado2Real = String.valueOf(resultado2);

			// *********************************************

			vfvica.setText(resultado1Real);

			vfvicb.setText(resultado2Real);

			// *********************************************

			persona.agregarCalculo(resultado1, vf1, m1, resultado2, vf2, m2);

		} catch(NumberFormatException e1) {

			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Informacion importante");
			alert.setHeaderText(null);
			alert.setContentText("Datos invalidos, por favor revise las siguientes opciones: \n" +
					"\n 1. La informacion no debe de tener ninguna letra." + 
					"\n 2. Si utiliza decimales, por favor separelos con un punto." +
					"\n 3. Ningun campo puede estar vacio");

			alert.showAndWait();

		} catch(NullPointerException e2) {

			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Informacion importante");
			alert.setHeaderText(null);
			alert.setContentText("Por favor llene todos los datos requeridos");

			alert.showAndWait();

		}


	}

	// --------------------------------------------------------------------------------------
	
	// METODO PARA CALCULAR LA VELOCIDAD INICIAL DE AMBOS CUERPOS

	@FXML
	public void calcularvi(ActionEvent event) {

		try {

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

			persona.agregarCalculo(velocidadInicial1, resultado1, masa1, velocidadInicial2, resultado2, masa2);

		} catch(NumberFormatException e1) {

			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Informacion importante");
			alert.setHeaderText(null);
			alert.setContentText("Datos invalidos, por favor revise las siguientes opciones: \n" +
					"\n 1. La informacion no debe de tener ninguna letra." + 
					"\n 2. Si utiliza decimales, por favor separelos con un punto." +
					"\n 3. Ningun campo puede estar vacio");

			alert.showAndWait();

		} catch(NullPointerException e2) {

			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Informacion importante");
			alert.setHeaderText(null);
			alert.setContentText("Por favor llene todos los datos requeridos");

			alert.showAndWait();

		}

	}

	// --------------------------------------------------------------------------------------

}
