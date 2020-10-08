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

import figuras.Barra;
import hilos.BarraHilo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ControladoraInicial {

	// ---------------------------------------------------------------------------------------

	// RELACIONES

	private Barra barra;

	private SegundaControladora controladora;

	// --------------------------------------------------------------------------------------

	// RECURSOS DE LA CLASE CONTROLADORA INICIAL

	@FXML
	private Rectangle cuadro;

	@FXML
	private Button botonIniciar;

	@FXML
	private Button botonContinuar;

	@FXML
	private Label label1;

	// --------------------------------------------------------------------------------------

	// METODO CONSTRUCTOR

	public ControladoraInicial() {

		barra = new Barra();

		controladora = new SegundaControladora();

		cuadro = new Rectangle();
		
		actualizarBarra();

	}

	// --------------------------------------------------------------------------------------

	// METODO CONTINUAR

	@FXML
	public void continuar(ActionEvent event) throws IOException {

		Node source = (Node) event.getSource();

		Stage stage = (Stage) source.getScene().getWindow();

		stage.close();

		// ******************************************

		Stage primaryStage = new Stage();

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PanelInformacion.fxml"));

		fxmlLoader.setController(controladora);

		Parent root = fxmlLoader.load();

		Scene scene = new Scene(root);

		primaryStage.setScene(scene);

		primaryStage.setTitle("Informacion");

		primaryStage.show();

	}

	// --------------------------------------------------------------------------------------

	// METODO INICIAR

	@FXML
	public void iniciar(ActionEvent event) {

		BarraHilo bh = new BarraHilo(barra, this, 20);
		
		label1.setText("Ejecutando componentes y pruebas del sistema");

		bh.start();

		barra.setValidacion(true);

	}

	// --------------------------------------------------------------------------------------

	// METODO ACTUALIZAR BARRA

	public void actualizarBarra() {

		cuadro.setWidth(barra.getValor() + 1);

	}

	// --------------------------------------------------------------------------------------

	// METODO INICIALIZAR BARRA

	public void initialize() {

		botonIniciar.setDisable(false);

		botonContinuar.setDisable(true);

	}

	// ---------------------------------------------------------------------------------------

	// METODO INICIAR CONTINUAR

	public void iniciarContinuar() {

		botonIniciar.setDisable(true);

		botonContinuar.setDisable(false);

		barra.setValidacion(false);
		
		label1.setVisible(false);
		
	}

	// ---------------------------------------------------------------------------------------

}
