package principal;

import clases.Enciclopedia;
import clases.Libro;

public class GestionBiblioteca {

	public static void main(String[] args) {

		// ======================
		// == Creamos 2 libros ==
		// ======================
		Libro l1 = new Libro("IT", "Stephen King", 1504, 5, 0);
		Libro l2 = new Libro("El Senor de los Anillos - La comunidad del anillo", "J.R.R. Tolkien", 547, 10, 10);

		// Mostramos informaci�n del primer libro
		System.out.println("");
		System.out.println("== Informaci�n del libro - " + l1.getTitulo() + " ==");
		System.out.println("Autor: " + l1.getAutor());
		System.out.println("N de páginas: " + l1.getNumPaginas() + " páginas");
		System.out.println("Número de ejemplares en posesión: " + l1.getNumEjemplares());
		System.out.println("Número de ejemplares prestados: " + l1.getNumEjemplaresPrestados());
		System.out.println("");

		// Devolvemos un ejemplar de l1 (mirad que no tenemos dejado ninguno...)
		l1.devolucion();
		// Prestamos uno
		l1.prestamo();
		// Y ahora lo devolvemos
		l1.devolucion();

		// Mostramos información del segundo libro
		System.out.println("");
		System.out.println("== Informaci�n del libro - " + l2.getTitulo() + " ==");
		System.out.println("Autor: " + l2.getAutor());
		System.out.println("Núm de páginas: " + l2.getNumPaginas() + " p�ginas");
		System.out.println("Número de ejemplares en posesión: " + l2.getNumEjemplares());
		System.out.println("Número de ejemplares prestados: " + l2.getNumEjemplaresPrestados());
		System.out.println("");

		// Devolvemos un ejemplar de l1 (mirad que no tenemos dejado ninguno...)
		l2.prestamo();
		// Prestamos uno
		l2.devolucion();
		// Y ahora lo devolvemos
		l2.prestamo();

		// =============================
		// == Creamos 2 enciclopedias ==
		// =============================
		Enciclopedia e1 = new Enciclopedia("Enciclopedia Espasa", "Antonio Ramirez", "ESPASA", 10, 5);
		Enciclopedia e2 = new Enciclopedia("Enciclopedia Encarta", "Bill Gates", "Microsoft", 20, 15);

		// Mostramos informaci�n de la primera enciclopedia
		System.out.println("");
		System.out.println("== Informaci�n de la enciclopedia - " + e1.getTitulo() + " ==");
		System.out.println("Autor: " + e1.getAutor());
		System.out.println("Editorial: " + e1.getEditorial());
		System.out.println("Número de ejemplares en posesi�n: " + e1.getNumEjemplares());
		System.out.println("Número de ejemplares prestados: " + e1.getNumEjemplaresPrestados());
		System.out.println("");

		// Devolvemos un ejemplar de e1
		e1.devolucion();
		// Prestamos una
		e1.prestamo();
		// Y ahora la devolvemos
		e1.devolucion();

		// Mostramos informaci�n de la segunda enciclopedia
		System.out.println("");
		System.out.println("== Información de la enciclopedia - " + e2.getTitulo() + " ==");
		System.out.println("Autor: " + e2.getAutor());
		System.out.println("Editorial: " + e2.getEditorial());
		System.out.println("Número de ejemplares en posesi�n: " + e2.getNumEjemplares());
		System.out.println("Número de ejemplares prestados: " + e2.getNumEjemplaresPrestados());
		System.out.println("");

		// Prestamos una
		e2.prestamo();
		// Devolvemos un ejemplar de e1
		e2.devolucion();
		// Prestamos una
		e2.prestamo();
		// Y ahora la devolvemos
		e2.devolucion();
	}
}
