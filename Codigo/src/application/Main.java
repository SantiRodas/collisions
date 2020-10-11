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

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {

	// --------------------------------------------------------------------------------------
	
	// RELACION CON LA CLASE CONTROLADORA INICIAL

	ControladoraInicial controladora;

	// --------------------------------------------------------------------------------------
	
	// METODO MAIN

	public Main() {

		controladora = new ControladoraInicial();

	}

	// --------------------------------------------------------------------------------------
	
	// METODO PRINCIPAL
	
	@Override
	public void start(Stage primaryStage) {
		
		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PanelInicio.fxml"));

			fxmlLoader.setController(controladora);

			Parent root = fxmlLoader.load();

			Scene scene = new Scene(root);

			primaryStage.setScene(scene);

			primaryStage.setTitle("Colisiones");

			primaryStage.show();

		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	// --------------------------------------------------------------------------------------
	
	// METODO LAUNCH

	public static void main(String[] args) {
		
		launch(args);
		
	}
	
	// --------------------------------------------------------------------------------------
	
}
