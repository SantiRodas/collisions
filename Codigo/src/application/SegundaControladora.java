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

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import model.Principal;

public class SegundaControladora {

	// ---------------------------------------------------------------------------------------

	// RELACIONES

	Principal principal;
	
	ControladoraInformacion controladora;

	// ---------------------------------------------------------------------------------------

	// METODO CONSTRUCTOR

	public SegundaControladora() {

		principal = new Principal();
		
		controladora = new ControladoraInformacion();
		
	}

	// ---------------------------------------------------------------------------------------

	@FXML
	private Button botonAceptar;

	@FXML
	private TextField nombreTexto;

	@FXML
	private ChoiceBox<String> rolTexto;

	// ---------------------------------------------------------------------------------------

	@FXML
	public void aceptar(ActionEvent event) throws IOException {

		try {
			
			String nombre = nombreTexto.getText();
			
			boolean validacion = this.comprobacion(nombre);
			
			String rol = rolTexto.getValue();
			
			if(nombre.isEmpty() == true || rol == null) {
				
				throw new NullPointerException("Vacio");
				
			} else if(validacion == true) {
				
				throw new NumberFormatException("Incorrecto");
				
			} else {
				
				principal.agregarSistema(nombre, rol);
				
			}

			// ******************************************

			Node source = (Node) event.getSource();

			Stage stage = (Stage) source.getScene().getWindow();

			stage.close();

			// ------------------------------------------

			Stage primaryStage = new Stage();

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("panelPrincipal.fxml"));

			fxmlLoader.setController(controladora);

			Parent root = fxmlLoader.load();

			Scene scene = new Scene(root);

			primaryStage.setScene(scene);

			primaryStage.setTitle("Informacion");

			primaryStage.show();

		} catch(NullPointerException e1) {

			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Informacion importante");
			alert.setHeaderText(null);
			alert.setContentText("Por favor llene todos los datos requeridos");

			alert.showAndWait();

		} catch(NumberFormatException e2) {

			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Informacion importante");
			alert.setHeaderText(null);
			alert.setContentText("Datos invalidos, por favor intente nuevamente");

			alert.showAndWait();

		}

	}

	// ---------------------------------------------------------------------------------------

	// METODO PARA INICIALIZAR EL SISTEMA

	public void initialize() {

		rolTexto.getItems().add("Profesor");

		rolTexto.getItems().add("Estudiante");
	
	}

	// ---------------------------------------------------------------------------------------
	
	public boolean comprobacion(String cadena) {
		
        try {
        	
            Integer.parseInt(cadena);
            
            return true;
            
        } catch (NumberFormatException e) {
        	
            return false;
            
        }
        
    }
	
	// ---------------------------------------------------------------------------------------

}
