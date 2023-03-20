package clases;

public class Libro extends Documento {
	private int numPaginas;

	public Libro(String titulo, String autor, int numPaginas, int numEjemplares, int numEjemplaresPrestados) {
		super(titulo, autor, numEjemplares, numEjemplaresPrestados);
		this.numPaginas = numPaginas;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public void prestamo() {

		System.out.println("Iniciando el pr�stamo...");

		if (super.getNumEjemplares() == super.getNumEjemplaresPrestados()) {
			System.out.println("No se pueden prestar m�s libros, �est�n todos prestados!");
			System.out.println("");
		} else {
			super.modificarNumEjemplaresPrestados(1);
			;
			System.out.println("El libro se ha prestado correctamente.");
			System.out.println("");
		}
	}

	public void devolucion() {
		System.out.println("Iniciando la devoluci�n...");
		if (super.getNumEjemplaresPrestados() == 0) {
			System.out.println("No se pueden devolver m�s libros, �est�n todos devueltos!.");
			System.out.println("");
		} else {
			super.modificarNumEjemplaresPrestados(-1);
			;
			System.out.println("El libro se ha devuelto correctamente.");
			System.out.println("");
		}
	}
}
