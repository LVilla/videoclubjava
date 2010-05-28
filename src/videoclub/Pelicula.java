package videoclub;

import java.lang.*;
import java.util.*;

/**
 * @version VIDEOCLUB 1.0
 * @author Miguel Angel Llamas fecha 25/05/2010
 */
/*
 * idpeli conendr� un valor �nico para cada objeo pel�cula, independientementesi
 * hay m�s de una copia del mismo t�tulo. numalguiler contendr� el n�mero de
 * alquiler t�tulo el nombre de la pel�cula g�nero, en principio tomar� los
 * valores de un arraylist g�nero que contendr� cargados los valores. altabd ser�
 * la fecha con la que damos de alta un objeto pelicula en nuestra base de
 * datos. ultimoalq contendr� la fecha del �ltimo alquiler del t�ulo alquilado.
 */

public class Pelicula {
	
	private int numAlquiler = 0;
	private String titulo = "";
	private String genero = "";
	private Date fechaAltaBD;
	private Date fechaUltimoAlq;


	private int idPeli = 0;
	public int getIdPeli() {
		return idPeli;
	}
	public void setIdPeli(int idPeli) {
		this.idPeli = idPeli;
	}
	public int getNumAlquiler() {
		return numAlquiler;
	}
	public void setNumAlquiler(int numAlquiler) {
		this.numAlquiler = numAlquiler;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Date getFechaAltaBD() {
		return fechaAltaBD;
	}
	public void setFechaAltaBD(Date fechaAltaBD) {
		this.fechaAltaBD = fechaAltaBD;
	}
	public Date getFechaUltimoAlq() {
		return fechaUltimoAlq;
	}
	public void setFechaUltimoAlq(Date fechaUltimoAlq) {
		this.fechaUltimoAlq = fechaUltimoAlq;
	}
	
}

	
	