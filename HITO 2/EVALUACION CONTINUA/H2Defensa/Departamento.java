package H2Defensa;


public class Departamento {
	private String nombre;
	private int nroProv;
	private Provincia[] provincias;
	
	public Departamento() {
	}
	
	public Departamento(String nombre, int nroProv ,Provincia[] provincias) {
		this.nombre = nombre;
		this.provincias = provincias;
		this.nroProv = nroProv;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getNroProv() {
		return nroProv;
	}
	public void setNroProv(int nroProv) {
		this.nroProv = nroProv;
	}
	
	public Provincia[] getProvincias() {
		return provincias;
	}
	public void setProvincias(Provincia[] provincias) {
		this.provincias = provincias;
	}
	
	public void mostrarDepartamento() {
		
		System.out.println("Nombre del Departamento: " + getNombre());
		System.out.println("Nombre del Nro de Provincias: " + getNroProv());
		for(int i=0;i<this.getProvincias().length; i++) {
			
			provincias[i].mostrarProvincia();
		}
	}
	
	
	public void agregaProvincia(Provincia nuevoProv) {
		
		Provincia[] nuevoDepartamentos = new Provincia[provincias.length + 1];
		
		for (int i = 0; i < provincias.length; i++) {
			nuevoDepartamentos[i] = provincias[i];
		}
		
		nuevoDepartamentos[nuevoDepartamentos.length - 1] = nuevoProv;
		
		setProvincias(nuevoDepartamentos);
		
		setNroProv(getNroProv() + 1);
		
		

	}
	
	
	
	
}
