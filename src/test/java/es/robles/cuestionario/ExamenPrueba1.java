package es.robles.cuestionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import es.robles.examen.Cuestionario;
import es.robles.examen.Pregunta;

public class ExamenPrueba1 {
	
	public static void main(String[] args) {
		try(Scanner teclado = new Scanner(System.in)) {
			List<Pregunta> preguntas = crearPreguntas(teclado);
			Cuestionario cuestionario = new Cuestionario(preguntas);
			cuestionario.hacerCuestionario();
		}
	}

	private static List<Pregunta> crearPreguntas(Scanner teclado) {
		List<Pregunta> preguntas = new ArrayList<>();
		preguntas.add(new Pregunta(teclado,"1+1","2"));
		preguntas.add(new Pregunta(teclado,"2+2","4"));
		preguntas.add(new Pregunta(teclado,"3+3","6"));
		return preguntas;
	}

}
