package clases;
/**
 * Clase abstracta que representa un documento
 */
public abstract class Documento {
	private String titulo;
	private String autor;
	private int numEjemplares;
	private int numEjemplaresPrestados;
	/**
     * Constructor para la clase Documento
     *
     * @param titulo                Titulo del documento
     * @param autor                 El autor del documento
     * @param numEjemplares         Numero de copias del documento
     * @param numEjemplaresPrestados Numero de copias del documento que han sido prestados
     */
	public Documento(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.numEjemplaresPrestados = numEjemplaresPrestados;
	}
	/**
     * Devuelve el titulo del documento
     *
     * @return Titulo del documento
     */
	public String getTitulo() {
		return titulo;
	}
	/**
     * Establece el titulo del documento
     *
     * @param titulo Nuevo titulo del documenot
     */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
     * Devuelve el nombre del autor
     *
     * @return Nombre del autor
     */
	public String getAutor() {
		return autor;
	}
	/**
     * Establece el nombre del atuor
     *
     * @param titulo Nuevo nombre de autor
     */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
     * Devuelve el número de copias
     *
     * @return Número de ejemplares
     */
	public int getNumEjemplares() {
		return numEjemplares;
	}
	/**
     * Establece el número de copias
     *
     * @param Nuevo Número de copias
     */
	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}
	/**
     * Devuelve el número de ejemplares prestados
     *
     * @return Número de ejemplares
     */
	public int getNumEjemplaresPrestados() {
		return numEjemplaresPrestados;
	}
	/**
     * Establece el número de ejemplares prestados
     *
     * @param titulo Nuevo titulo del ejemplar prestado
     */
	public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
		this.numEjemplaresPrestados = numEjemplaresPrestados;
	}
	/**
     * Modifica el número de ejemplares prestados
     *
     * @return Número de ejemplares prestados modificado
     */
	public void modificarNumEjemplaresPrestados(int cambio) {
	    this.numEjemplaresPrestados += cambio;
	}
	  /**
     * Este método abstracto representa el préstamo de un documento.
     */
	public abstract void prestamo();
    /**
     * Este método abstracto representa la devolución de un documento.
     */
	public abstract void devolucion();
}
