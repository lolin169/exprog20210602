package fp.daw.exprog20210602.ejercicio2;

import java.io.File;

public class PruebaFrecuencia {

	public static void main(String[] args) {
		Frecuencia quijote= new Frecuencia(new File("El Quijote ISO-8859-1.txt"));
		System.out.println("La palabra DE, aparece: "+ quijote.veces("de")+ " veces");
		System.out.println("La palabra MAÑANA, aparece: "+ quijote.veces("mañana")+ " veces");
		System.out.println("La palabra P, aparece: "+ quijote.veces("p")+ " veces");
	}

}
