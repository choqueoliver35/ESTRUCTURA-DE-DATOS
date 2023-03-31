package TareaH2;

public class Departamento {
	
	private String nombre;
	private int nroProv;
	private Provincia[] provincias;
	
	public Departamento() {
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
	
	public void agregarNuevaProvincia(Provincia nuevaProvincia) {
		
        Provincia[] nueProvincia = new Provincia[provincias.length +1 ];
        
		for(int i=0;i<provincias.length; i++) {
			nueProvincia[i] = provincias[i];
		}
		
		nueProvincia[nueProvincia.length - 1] = nuevaProvincia;
		
		setProvincias(nueProvincia);
		
		setNroProv(nueProvincia.length);		
    }
	
	
}
