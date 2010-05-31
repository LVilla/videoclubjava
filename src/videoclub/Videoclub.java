package videoclub;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import videoclub.Utiles;

public class Videoclub {
	
	/**
	 * Atributos de la clase Videoclub
	 * Contiene la cadena que representa el idioma
	 * de la interfaz
	 */
	private String idioma;


	
	/**
	 * @return el idioma
	 */
	public String getIdioma() {
		return idioma;
	}

	/**
	 * @param el idioma
	 */
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	/**
	 * @param args
	 * M�todo principal que inicia el programa Videoclub
	 * por consola y llama a las clases auxiliares
	 */
	public static void main(String[] args) {
		/*
		 * Este constructor inicializa gastos, ingresos 
		 * e idioma
		 */
		Videoclub videoclub= new Videoclub();
		/*
		 * Este constructor ya conecta con base de datos
		 * y establece la conexi�n
		 */
		BaseDeDatos datos= new BaseDeDatos();
		/*
		 * Inicio del programa por consola
		 */
		videoclub.Bienvenida();
		videoclub.Menu(datos);
	}
	
	/**
	 * Metodo que nos imprime por pantalla el segundo menu,
	 * en este caso el menu que nos permite alquilar, devolver o salir
	 * 
	 * @param utiles,videoclub
	 */
	
	public void Menu(BaseDeDatos datos){
		boolean flag = true;
		String sOpcion;
		int iOpcion;
		int idSocio;
		System.out.println("Por favor, introduzca el usuario:");
		idSocio= Utiles.leerInt();
		if(idSocio==0) {
			System.out.println("Error introduciendo par�metros");
		}else {
			System.out.println("Bienvenido socio n� "+idSocio);
		
		/* Ojo: Las operaciones se pueden llevar a cabo todas las veces que 
		 		el usuario desee, hasta que no presione la opcion 3. Salir*/
		while (flag) {
			System.out.println("\n------------Men� TOPE------------");
			System.out.println("Seleccione una opcion: ");
			System.out.println("1. Alquilar");
			System.out.println("2. Devolver");
			System.out.println("3. Salir");
			System.out.println("-------------");
			System.out.println("4. Men� Admin");
			
			// Recojo la opcion seleccionada por el usuario
			sOpcion = Utiles.leerDatos();
			
			// Parseo el string a entero ya que el switch solo recoje enteros
			iOpcion = Utiles.StringAint(sOpcion);
			
			// Segun la opcion seleccionada se accedera a un metodo u otro
			switch (iOpcion) {
			case 1:
				alquilar(datos, idSocio);
				break;
			case 2:
				System.out.println("Introduzca id de pel�cula");
				sOpcion=Utiles.leerDatos();
				int idPelicula= Integer.parseInt(sOpcion);
				//DEVOLVER PELICULA
				datos.devolverPelicula(idPelicula, idSocio);
				break;
			case 3:
				flag = false;
				break;
			case 4:
				menuAdmin(datos, idSocio);
			default:
				System.out.println("Introduzca una de las 3 opciones por favor");
			}
		}
		}
		
	}
	
	private void menuAdmin(BaseDeDatos datos, int idSocio) {
		boolean flag = true;
		String sOpcion;
		int iOpcion;		
		/* Ojo: Las operaciones se pueden llevar a cabo todas las veces que 
		 		el usuario desee, hasta que no presione la opcion 3. Salir*/
		while (flag) {
			System.out.println("\n------------Alquiler TOPE------------");
			System.out.println("Seleccione una opcion: ");
			System.out.println("1. Nuevo Socio");
			System.out.println("2. Nueva Pel�cula");
			System.out.println("3. Nueva Oficina");
			System.out.println("4. Mostrar Socios");
			System.out.println("5. Mostrar Pel�culas");
			System.out.println("6. Mostrar Oficinas");
			System.out.println("7. Mostrar Movimientos");
			System.out.println("8. Volver a Menu principal");
			
			// Recojo la opcion seleccionada por el usuario
			sOpcion = Utiles.leerDatos();
			
			// Parseo el string a entero ya que el switch solo recoje enteros
			iOpcion = Utiles.StringAint(sOpcion);
			
			// Segun la opcion seleccionada se accedera a un metodo u otro
			switch (iOpcion) {
			case 1:
				//A�ADIR SOCIO
				datos.almacenarSocio(Utiles.rellenarSocio());
				break;
			case 2:
				//A�ADIR PELICULA
				datos.almacenarPelicula(Utiles.rellenarPelicula());
				break;
			case 3:
				//A�ADIR OFICINA
				datos.almacenarOficina(Utiles.rellenarOficina());
			case 4:
				//MUESTRA TODOS LOS SOCIOS
				datos.mostrarSocios();
				break;
			case 5:
				//MUESTRA TODAS LAS PEL�CULAS
				datos.mostrarPeliculas();
				break;
			case 6:
				//MUESTRA TODAS LAS OFICINAS
				datos.mostrarOficinas();
				break;
			case 7:
				//MUESTRA TODOS LOS MOVIMIENTOS
				datos.mostrarMovimientos();
				break;
			case 8:
				flag = false;
				break;
			default:
				System.out.println("Introduzca una de las 3 opciones por favor");
			}
		}
	}

	
	/**
	 * Metodo que nos permite alquilar una pelicula
	 * @param videoclub
	 * @param idSocio 
	 */
	
	public void alquilar(BaseDeDatos datos, int idSocio){
		boolean flag = true;
		String sOpcion;
		int iOpcion;
		ArrayList<Pelicula> resultados = new ArrayList<Pelicula>();
		
		/* Ojo: Las operaciones se pueden llevar a cabo todas las veces que 
		 		el usuario desee, hasta que no presione la opcion 3. Salir*/
		while (flag) {
			System.out.println("\n------------Alquiler TOPE------------");
			System.out.println("Seleccione una opcion: ");
			System.out.println("1. TopSemanal");
			System.out.println("2. TopMensual");
			System.out.println("3. Novedades");
			System.out.println("4. Busqueda de Pel�culas");
			System.out.println("5. Mostrar Pel�culas");
			System.out.println("6. Alquilar Pel�cula");
			System.out.println("7. Volver a Menu principal");
			
			// Recojo la opcion seleccionada por el usuario
			sOpcion = Utiles.leerDatos();
			
			// Parseo el string a entero ya que el switch solo recoje enteros
			iOpcion = Utiles.StringAint(sOpcion);
			
			// Segun la opcion seleccionada se accedera a un metodo u otro
			switch (iOpcion) {
			case 1:
				//MOSTRAR TOP SEMANAL
				datos.topSemanalMensualNovedades(iOpcion);
				break;
			case 2:
				//MOSTRAR TOP MENSUAL
				datos.topSemanalMensualNovedades(iOpcion);
				break;
			case 3:
				//MOSTRAR NOVEDADES
				datos.topSemanalMensualNovedades(iOpcion);
				break;
			case 4:
				System.out.println("Introduzca la b�squeda");
				sOpcion=Utiles.leerDatos();
				//MOSTRAR RESULTADOS BUSQUEDA DE PELICULA
				datos.busquedaPelicula(sOpcion);
				break;
			case 5:
				//MUESTRA TODAS LAS PEL�CULAS
				datos.mostrarPeliculas();
				break;
			case 6:
				System.out.println("Introduzca id de pel�cula");
				sOpcion=Utiles.leerDatos();
				int idPelicula=Integer.parseInt(sOpcion);
				//A�ADIR ALQUILER PELICULA
				datos.alquilarPelicula(idPelicula, idSocio);
				break;
			case 7:
				flag = false;
				break;
			default:
				System.out.println("Introduzca una de las 3 opciones por favor");
			}
		}
	}
	

	/**
	 * Metodo que presenta la pantalla de los idiomas
	 * 
	 * @param videoclub
	 */
	
	public void Bienvenida(){
		
		System.out.println("------------Bienvenido al Videoclub TOPE------------");
		System.out.println("Seleccione el idioma: ");
		System.out.println("1. Espa�ol");
		System.out.println("2. Ingles");
		System.out.println("3. Frances");
		System.out.println("4. Italiano");
		System.out.println("5. Alem�n");
		String aux= Utiles.leerDatos();
		idioma= aux;
		
	}
}