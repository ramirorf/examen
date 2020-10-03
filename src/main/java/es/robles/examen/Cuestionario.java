package es.robles.examen;

import java.util.List;
import java.util.Scanner;

public class Cuestionario {
	
	private final List<Pregunta> preguntas;
	
	public Cuestionario(List<Pregunta> preguntas) {
		super();
		this.preguntas = preguntas;
	}

	public void hacerCuestionario() {
		System.out.println("Comienzo de las preguntas ("+preguntas.size()+")\n");
		int aciertos=0;
		if(preguntas != null) {
			for(Pregunta pregunta : preguntas) {
				if(pregunta.hacerPregunta()) {
					System.out.println("\n¡Muy bien!\n");
					aciertos++;
				} else {
					System.out.println("\nCasi... la respuesta era "+pregunta.getRespuesta()+"\n");
				}
			}
		}
		int resultado =  Math.round((aciertos/(float)preguntas.size())*10);
		System.out.println("\nResultado: "+resultado);
	}

	public List<Pregunta> getPreguntas() {
		return preguntas;
	}
}
