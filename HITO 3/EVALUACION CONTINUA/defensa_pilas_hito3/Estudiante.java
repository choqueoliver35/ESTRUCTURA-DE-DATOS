package defensa_pilas_hito3;

public class Estudiante {
	
	private String nombres;
    private String apellidos;
    private int edad;
    private String sede;
    private int notafinal;
    private String CI;
    
    
	public Estudiante(String nombres, String apellidos, int edad, String sede, int notafinal, String cI) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.sede = sede;
		this.notafinal = notafinal;
		CI = cI;
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
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	public int getNotafinal() {
		return notafinal;
	}
	public void setNotafinal(int notafinal) {
		this.notafinal = notafinal;
	}
	public String getCI() {
		return CI;
	}
	public void setCI(String cI) {
		CI = cI;
	}
	
	public void muestraEstudiante() {
		System.out.println("\nEstudiante\n");
		System.out.println("Nombre: " + this.getNombres());
		System.out.println("Apellido: " + this.getApellidos());
		System.out.println("Edad: " + this.getEdad());
		System.out.println("Sede: " + this.getSede());
		System.out.println("Nota Final: " + this.getNotafinal());
		System.out.println("CI: " + this.getCI());
	}
    
    

}
