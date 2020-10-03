package es.robles.examen;

import java.util.Scanner;

public class Pregunta {
	
	private final String pregunta;
	
	private final String respuesta;
	
	private final Scanner teclado;
	
	public Pregunta(Scanner teclado, String pregunta, String respuesta) {
		super();
		this.teclado = teclado;
		this.pregunta = pregunta;
		this.respuesta = respuesta;
	}

	public boolean comprobar(String respuestaCandidata) {
		return respuestaCandidata != null ? 
			respuesta.trim().toLowerCase().equalsIgnoreCase(respuestaCandidata.trim().toLowerCase()):
			false;
	}

	public boolean hacerPregunta() {
		System.out.print(pregunta+" ");
		return comprobar(teclado.nextLine());
	}

	public String getPregunta() {
		return pregunta;
	}

	public String getRespuesta() {
		return respuesta;
	}

}
