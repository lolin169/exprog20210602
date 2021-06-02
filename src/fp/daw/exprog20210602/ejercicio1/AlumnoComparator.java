package fp.daw.exprog20210602.ejercicio1;

import java.util.Comparator;

public class AlumnoComparator implements Comparator<Alumno> {

	@Override
	public int compare(Alumno a, Alumno b) {
		if (a.getCiclo().compareTo(b.getCiclo()) < 0)
			return -1;
		else if (a.getCiclo().compareTo(b.getCiclo()) > 0)
			return 1;
		else if (a.getCurso() < b.getCurso())
			return -1;
		else if (a.getCurso() > b.getCurso())
			return 1;

		return 0;
	}

}
