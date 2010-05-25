package videoclub;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Videoclub {

	/**
	 * Atributos de la clase Videoclub
	 * Contiene los ArrayList repesentativas a las clases
	 * que ir�n a base de datos
	 */
	private ArrayList peliculas;
	private ArrayList socios;
	private ArrayList alquileres;
	private ArrayList distribuidores;
	private ArrayList almacenes;
	private ArrayList oficinas;
	
	/**
	 * Atributos de la clase Videoclub
	 * Contiene un ArrayList interno para el mantenimiento
	 * de los generos de las pel�culas
	 */
	private ArrayList generos;

	/**
	 * Atributos de la clase Videoclub
	 * Contiene los datos de facturaci�n
	 */
	private int gastos;
	private int ingresos;

	/**
	 * Atributos de la clase Videoclub
	 * Contiene la cadena que representa el idioma
	 * de la interfaz
	 */
	private String idioma;

	/**
	 * @return las pel�culas
	 */
	public ArrayList getPeliculas() {
		return peliculas;
	}

	/**
	 * @param las pel�culas
	 */
	public void setPeliculas(ArrayList peliculas) {
		this.peliculas = peliculas;
	}

	/**
	 * @return los socios
	 */
	public ArrayList getSocios() {
		return socios;
	}

	/**
	 * @param los socios
	 */
	public void setSocios(ArrayList socios) {
		this.socios = socios;
	}

	/**
	 * @return los alquileres
	 */
	public ArrayList getAlquileres() {
		return alquileres;
	}

	/**
	 * @param los alquileres
	 */
	public void setAlquileres(ArrayList alquileres) {
		this.alquileres = alquileres;
	}

	/**
	 * @return los distribuidores
	 */
	public ArrayList getDistribuidores() {
		return distribuidores;
	}

	/**
	 * @param los distribuidores
	 */
	public void setDistribuidores(ArrayList distribuidores) {
		this.distribuidores = distribuidores;
	}

	/**
	 * @return los almacenes
	 */
	public ArrayList getAlmacenes() {
		return almacenes;
	}

	/**
	 * @param los almacenes
	 */
	public void setAlmacenes(ArrayList almacenes) {
		this.almacenes = almacenes;
	}

	/**
	 * @return las oficinas
	 */
	public ArrayList getOficinas() {
		return oficinas;
	}

	/**
	 * @param las oficinas
	 */
	public void setOficinas(ArrayList oficinas) {
		this.oficinas = oficinas;
	}

	/**
	 * @return los generos
	 */
	public ArrayList getGeneros() {
		return generos;
	}

	/**
	 * @param los generos
	 */
	public void setGeneros(ArrayList generos) {
		this.generos = generos;
	}

	/**
	 * @return los gastos
	 */
	public int getGastos() {
		return gastos;
	}

	/**
	 * @param los gastos
	 */
	public void setGastos(int gastos) {
		this.gastos = gastos;
	}

	/**
	 * @return los ingresos
	 */
	public int getIngresos() {
		return ingresos;
	}

	/**
	 * @param los ingresos
	 */
	public void setIngresos(int ingresos) {
		this.ingresos = ingresos;
	}
	
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
		Videoclub videoclub= new Videoclub();
		System.out.println("------------Bienvenido al Videoclub TOPE------------");
		System.out.println("Seleccione el idioma: ");
		System.out.println("1. Espa�ol");
		System.out.println("2. Ingles");
		System.out.println("3. Frances");
		System.out.println("4. Italiano");
		System.out.println("5. Alem�n");
		String aux= cogerCadena();
		videoclub.idioma= aux;
	}
	
	/**
	 * M�todo auxiliar de recogida de datos por teclado
	 */
	public static String cogerCadena(){
		String texto="";
		try{
			//Obtenci�n del objeto Reader
			InputStreamReader conv= new InputStreamReader(System.in);
			//Obtenci�n del BufferedReader
			BufferedReader entrada= new BufferedReader(conv);
			texto= entrada.readLine();
		} catch (IOException e){
			System.out.println(e.toString());
		}
		return texto;
	}
		

}
