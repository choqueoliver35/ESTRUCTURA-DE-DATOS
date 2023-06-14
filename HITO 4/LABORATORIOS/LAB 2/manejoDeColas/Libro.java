package manejoDeColas;

public class Libro {

	private int codigoLibro;
	private String autor;
	private String genero;
	private String categoria;
	private int paginas;
	
	public Libro(int codigoLibro, String autor, String genero, String categoria, int paginas) {
		super();
		this.codigoLibro = codigoLibro;
		this.autor = autor;
		this.genero = genero;
		this.categoria = categoria;
		this.paginas = paginas;
	}

	public int getCodigoLibro() {
		return codigoLibro;
	}

	public void setCodigoLibro(int codigoLibro) {
		this.codigoLibro = codigoLibro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	
	public void mostrar() {
		System.out.println("Mostrando datos del libro");
		System.out.println("Codigo: " + this.getCodigoLibro());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Genero: " + this.getGenero());
		System.out.println("Categoria: " + this.getCategoria());
		System.out.println("Paginas: " + this.getPaginas());
		System.out.println();
	}
	
}
