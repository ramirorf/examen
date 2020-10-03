package es.robles.cuestionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import es.robles.examen.Cuestionario;
import es.robles.examen.Pregunta;

public class ExamenNumerosRomanos {
	
	public static void main(String[] args) {
		try(Scanner teclado = new Scanner(System.in)) {
			List<Pregunta> preguntas = crearPreguntas(teclado,3);
			Cuestionario cuestionario = new Cuestionario(preguntas);
			cuestionario.hacerCuestionario();
		}
	}

	private static List<Pregunta> crearPreguntas(Scanner teclado, int contadorPreguntas) {
		List<Pregunta> preguntas = new ArrayList<>();
		for(int i=0;i!=contadorPreguntas;i++) {
			Random r = new Random();
			int numero = r.nextInt(2000)+1; 
			preguntas.add(new Pregunta(teclado,numero+" en numeros romanos",convertirANumerosRomanos(numero)));
		}
		return preguntas;
	}
	
	public static String convertirANumerosRomanos(int numero) {
	      int i, miles, centenas, decenas, unidades;
	      String romano = "";
	      
	      //obtenemos cada cifra del n�mero
	      miles = numero / 1000;
	      centenas = numero / 100 % 10;
	      decenas = numero / 10 % 10;
	      unidades = numero % 10;

	      //millar
	      for (i = 1; i <= miles; i++) {
	             romano = romano + "M";
	      }

	      //centenas
	      if (centenas == 9) {
	          romano = romano + "CM";
	      } else if (centenas >= 5) {
	                 romano = romano + "D";
	                 for (i = 6; i <= centenas; i++) {
	                      romano = romano + "C";
	                 }
	      } else if (centenas == 4) {
	                 romano = romano + "CD";
	      } else {
	                 for (i = 1; i <= centenas; i++) {
	                      romano = romano + "C";
	             }
	      }

	      //decenas
	      if (decenas == 9) {
	          romano = romano + "XC";
	      } else if (decenas >= 5) {
	                 romano = romano + "L";
	                 for (i = 6; i <= decenas; i++) {
	                      romano = romano + "X";
	                 }
	      } else if (decenas == 4) {
	                 romano = romano + "XL";
	      } else {
	                 for (i = 1; i <= decenas; i++) {
	                      romano = romano + "X";
	                 }
	      }

	      //unidades
	      if (unidades == 9) {
	          romano = romano + "IX";
	      } else if (unidades >= 5) {
	                 romano = romano + "V";
	                 for (i = 6; i <= unidades; i++) {                                                           
	                      romano = romano + "I";
	                 }
	      } else if (unidades == 4) {
	                 romano = romano + "IV";
	      } else {
	                 for (i = 1; i <= unidades; i++) {
	                      romano = romano + "I";
	                 }
	      }
	      return romano;
	  }
}
