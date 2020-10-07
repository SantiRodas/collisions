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

package hilos;

import application.ControladoraInicial;
import figuras.Barra;

public class BarraHilo extends Thread {

	// ---------------------------------------------------------------------------------------

	// ATRIBUTOS DEL HILO BARRA

	private Barra barra;

	private ControladoraInicial controladora;

	private int time;

	// ---------------------------------------------------------------------------------------

	// METODO CONSTRUCTOR DEL HILO BARRA

	public BarraHilo(Barra barra, ControladoraInicial controladora, int time) {

		this.barra = barra;
		this.controladora = controladora;
		this.time = time;

	}

	// ---------------------------------------------------------------------------------------

	// METODOS GET DEL HILO BARRA

	public Barra getBarra() {
		return barra;
	}

	public ControladoraInicial getControladora() {
		return controladora;
	}

	public int getTime() {
		return time;
	}

	// ---------------------------------------------------------------------------------------

	// METODOS SET DEL HILO BARRA

	public void setBarra(Barra barra) {
		this.barra = barra;
	}

	public void setControladora(ControladoraInicial controladora) {
		this.controladora = controladora;
	}

	public void setTime(int time) {
		this.time = time;
	}

	// ---------------------------------------------------------------------------------------

	// METODO RUN DEL HILO BARRA

	public void run() {

		while(barra.isValidacion()) {

			barra.avanzar();

			controladora.actualizarBarra();

			try {

				sleep(time);

			} catch(InterruptedException e) {

				e.printStackTrace();

			}

		}

		controladora.iniciarContinuar();

	}

	// ---------------------------------------------------------------------------------------

}

