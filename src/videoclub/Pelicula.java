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

	private int idpeli = 0;
	private int numalquiler = 0;
	private String titulo = "";
	private String genero = "";
	private Date altabd;
	private Date ultimoalq;

	/** pedir� por teclado el Id de la pel�cula y devolvera su valor int**/
	
	public int getIdpeli() {
		return idpeli;
	}

	/** devolver� el Id de la pel�cula  int**/
	
	public void setIdpeli(int idpeli) {
		this.idpeli = idpeli;
	}

	/** se asignar� el n�mero de alquiler a la pel�cula alquilada y devolvera su valor int**/
	
	public int getNumalquiler() {
		return numalquiler;
	}

	/** devolvera el valor int del alquiler**/
	
	public void setNumalquiler(int numalquiler) {
		this.numalquiler = numalquiler;
	}

	/** pedir� por teclado el t�tulo de la pel�cula y devolvera su valor como String**/
	
	public String getTitulo() {
		return titulo;
	}
	/**devolvera el t�tulo como valor String**/
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/** tomar� valores ya cargados en un arraylist g�nero**/
	
	public String getGenero() {
		return genero;
	}

	/**devolvera el valor String del objeto en el arraylist g�nero que necesitemos**/
	
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/** Se asignar� la fecha con la que se ha dado de alta el titulo o la copia 
	 * del mismo en nuestra base de datos con un tipo Date**/
	
	public Date getAltabd() {
		return altabd;
	}

	/** Devolver� la fecha con la que se ha dado de alta el t�ulo o
	 * la copia del mismo en nuestra base de datos**/
	 
	
	public void setAltabd(Date altabd) {
		this.altabd = altabd;
	}

	/** Tomar� la fecha del �ltimo alquiler del objeto pel�cula**/
	
	public Date getUltimoalq() {
		return ultimoalq;
	}

	/** devolver� la fecha del �ltimo alquiler del objeo pel�cula**/
	
	public void setUltimoalq(Date ultimoalq) {
		this.ultimoalq = ultimoalq;
	}

}
