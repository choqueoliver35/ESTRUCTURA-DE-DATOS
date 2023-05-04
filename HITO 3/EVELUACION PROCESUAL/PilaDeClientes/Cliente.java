package PilaDeClientes;

public class Cliente {
	
	private String nombres;
	private String apellidos;
	private int edad;
	private String direccion;
	private String genero;
	
	public Cliente(String nombres, String apellidos, int edad, String direccion, String genero) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.direccion = direccion;
		this.genero = genero;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	public void muestraCliente() {
		System.out.println("\nCliente");
		System.out.println("Nombre: " + this.getNombres());
		System.out.println("Apellido: " + this.getApellidos());
		System.out.println("Edad: " + this.getEdad());
		System.out.println("Direccion: " + this.getDireccion());
		System.out.println("Genero: " + this.getGenero());
	}
	
	
}
