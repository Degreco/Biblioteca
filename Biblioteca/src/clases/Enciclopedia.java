package clases;

public class Enciclopedia extends Documento {


	private String editorial;
	public Enciclopedia(String titulo, String autor, String editorial, int numEjemplares, int numEjemplaresPrestados) {
		super(titulo, autor, numEjemplares, numEjemplaresPrestados);
		this.editorial = editorial;

	}
	public String getEditorial() {return editorial;}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public void prestamo() {

		System.out.println("Iniciando el pr�stamo...");

		if (super.getNumEjemplares() == super.getNumEjemplaresPrestados()) {
			System.out.println("No se pueden prestar m�s enciclopedias, �est�n todas prestadas!");
			System.out.println("");
		} else {
			super.modificarNumEjemplaresPrestados(1);
			System.out.println("La enciclopedia se ha prestado correctamente.");
			System.out.println("");
		}

	}

	public void devolucion() {

		System.out.println("Iniciando la devoluci�n...");

		if (super.getNumEjemplaresPrestados() == 0) {
			System.out.println("No se pueden devolver m�s enciclopedias, �est�n todas devueltas!.");
			System.out.println("");
		} else {
			super.modificarNumEjemplaresPrestados(-1);;
			System.out.println("La enciclopedia se ha devuelto correctamente.");
			System.out.println("");
		}

	}

}
