package fp.daw.exprog20210602.ejercicio1;

import java.io.Serializable;
import java.time.LocalDate;

public class Alumno implements Serializable, Comparable<Alumno> {

	private static final long serialVersionUID = 1L;
	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;
	private String ciclo;
	private int curso;

	public Alumno(String nombre, String apellidos, String ciclo, int curso) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.ciclo = ciclo;
		this.curso = curso;
	}

	public Alumno(String nombre, String apellidos, LocalDate fechaNacimiento, String ciclo, int curso) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.ciclo = ciclo;
		this.curso = curso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((ciclo == null) ? 0 : ciclo.hashCode());
		result = prime * result + curso;
		result = prime * result + ((fechaNacimiento == null) ? 0 : fechaNacimiento.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (ciclo == null) {
			if (other.ciclo != null)
				return false;
		} else if (!ciclo.equals(other.ciclo))
			return false;
		if (curso != other.curso)
			return false;
		if (fechaNacimiento == null) {
			if (other.fechaNacimiento != null)
				return false;
		} else if (!fechaNacimiento.equals(other.fechaNacimiento))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return nombre + ", " + apellidos + ", Fecha de Nacimiento(" + fechaNacimiento + "), ciclo=" + ciclo + ", curso="
				+ curso + "\n";
	}

	@Override
	public int compareTo(Alumno o) {
		Alumno a = (Alumno) o;
		if (this.apellidos.compareTo(a.getApellidos()) < 0)
			return -1;
		else if (this.apellidos.compareTo(a.getApellidos()) > 0)
			return 1;
		else {
			if (this.nombre.compareTo(a.getNombre()) < 0)
				return -1;
			else if (this.nombre.compareTo(a.getNombre()) < 0)
				return 1;
			else
				return 0;
		}
	}

}
