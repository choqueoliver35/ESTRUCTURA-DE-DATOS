package TareaH2;

public class Provincia {

	private String nombre;
	
	public Provincia() {
	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void mostrarProvincia() {
		System.out.println("Nombre de la provincia: " + getNombre());
	}

}
