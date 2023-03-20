package clases;

public abstract class Documento {
	private String titulo;
	private String autor;
	private int numEjemplares;
	private int numEjemplaresPrestados;

	public Documento(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.numEjemplaresPrestados = numEjemplaresPrestados;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}

	public int getNumEjemplaresPrestados() {
		return numEjemplaresPrestados;
	}

	public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
		this.numEjemplaresPrestados = numEjemplaresPrestados;
	}

	public void modificarNumEjemplaresPrestados(int cambio) {
	    this.numEjemplaresPrestados += cambio;
	}

	public abstract void prestamo();

	public abstract void devolucion();
}
