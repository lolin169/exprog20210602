package fp.daw.exprog20210602.ejercicio1;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class PruebaAlumno {

	public static void main(String[] args) {

		Set<Alumno> alumnos = new TreeSet<>();
		alumnos.add(new Alumno("Juan", "Rodr�guez Su�rez", LocalDate.of(1980, 4, 21), "Ciclo Medio", 2));
		alumnos.add(new Alumno("Juan", "Rodr�guez Su�rez", LocalDate.of(1985, 8, 2), "Ciclo Superior", 1));
		alumnos.add(new Alumno("Antonio", "Rodr�guez Su�rez", LocalDate.of(1983, 4, 1), "Ciclo Superior", 2));
		alumnos.add(new Alumno("Felipe", "Arias Dominguez", LocalDate.of(1990, 2, 11), "Ciclo Medio", 1));
		alumnos.add(new Alumno("Julian", "Antunez Su�rez", LocalDate.of(1981, 3, 21), "Ciclo Medio", 2));

		System.out.println(alumnos.toString().replace("[", "").replace("]", ""));

		Set<Alumno> alumnos2 = new TreeSet<>(new AlumnoComparator());
		alumnos2.add(new Alumno("Juan", "Rodríguez Suárez", LocalDate.of(1980, 4, 21), "Ciclo Medio", 2));
//		Vamos a probar a meter un alumno igual al primero para ver que no lo añade al conjunto
		alumnos2.add(new Alumno("Juan", "Rodríguez Suárez", LocalDate.of(1985, 8, 2), "Ciclo Superior", 1));
		alumnos2.add(new Alumno("Antonio", "Rodríguez Suárez", LocalDate.of(1983, 4, 1), "Ciclo Superior", 2));
		alumnos2.add(new Alumno("Felipe", "Arias Dominguez", LocalDate.of(1990, 2, 11), "Ciclo Medio", 1));
		alumnos2.add(new Alumno("Julian", "Antunez Suárez", LocalDate.of(1981, 3, 21), "Ciclo Medio", 2));

		System.out.println(alumnos2.toString().replace("[", "").replace("]", ""));

		try (ObjectOutputStream escritor = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream("alumnos.obj")))) {
			for (Alumno al : alumnos)
				escritor.writeObject(al);
			alumnos2.forEach(alum -> {
				try {
					escritor.writeObject(alum);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
			System.out.println("Archivo .obj escrito correctamente.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
