package fp.daw.exprog20210602.ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.TreeMap;

public class Frecuencia {

	private Map<String, Integer> mapa = new TreeMap<>();
	private Charset codificacion = StandardCharsets.ISO_8859_1;

	public Frecuencia(File archivo) {
		try (BufferedReader lector = new BufferedReader(
				new InputStreamReader(new FileInputStream(archivo), codificacion))) {
			String linea;
			while ((linea = lector.readLine()) != null) {
				String[] palabras = linea.toLowerCase().split("\\P{L}+");
				for (String palabra : palabras) {
					if (!mapa.containsKey(palabra.toLowerCase()))
						mapa.put(palabra, 0);
					mapa.put(palabra, mapa.get(palabra) + 1);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int veces(String palabra) {
		if (mapa.containsKey(palabra))
			return mapa.get(palabra);
		return 0;
	}

}
