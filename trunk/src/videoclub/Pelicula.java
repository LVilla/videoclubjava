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

	/**
	 * 
	 *  devolvera el id del objeto pel�cula valor int**/
	
	public int getIdpeli() {
		return idpeli;
	}

	/** 
	 * asignar� el Id de la pel�cula  int**/
	
	public void setIdpeli(int idpeli) {
		this.idpeli = idpeli;
	}

	/**
	 *  devolver� el n�mero de alquiler de la pel�cula alquilada **/
	
	public int getNumalquiler() {
		return numalquiler;
	}

	/**
	 *  asignar� el valor int del alquiler**/
	
	public void setNumalquiler(int numalquiler) {
		this.numalquiler = numalquiler;
	}

	/**
	 *  devolver� el t�tulo de la pel�cula**/
	
	public String getTitulo() {
		return titulo;
	}
	/**
	 *  asignar� el t�tulo como valor String**/
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 *  devolver� valores ya cargados en un arraylist g�nero**/
	
	public String getGenero() {
		return genero;
	}

	/**
	 * asignar� el del objeto al arraylist g�nero **/
	
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 *  Se devolver� la fecha con la que se ha dado de alta el titulo o la copia 
	 * del mismo en nuestra base de datos con un tipo Date**/
	
	public Date getAltabd() {
		return altabd;
	}

	/**
	 *  Asignar� la fecha con la que se ha dado de alta el t�ulo o
	 * la copia del mismo en nuestra base de datos**/
	 
	
	public void setAltabd(Date altabd) {
		this.altabd = altabd;
	}

	/** 
	 * 
	 * Devolver� la fecha del �ltimo alquiler del objeto pel�cula**/
	
	public Date getUltimoalq() {
		return ultimoalq;
	}

	/** 
	 * 
	 * Asignar� la fecha del �ltimo alquiler del objeo pel�cula**/
	
	public void setUltimoalq(Date ultimoalq) {
		this.ultimoalq = ultimoalq;
	}

}
