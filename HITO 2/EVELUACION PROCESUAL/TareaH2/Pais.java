
package TareaH2;


public class Pais {

	private int nroDeps;
	private Departamento[] departamentos;
	private String nombre;
	
	public Pais() {
		
	}
	

	
	public int getNroDeps() {
		return nroDeps;
	}
	public void setNroDeps(int nroDeps) {
		this.nroDeps = nroDeps;
	}
	public Departamento[] getDepartamentos() {
		return departamentos;
	}
	public void setDepartamentos(Departamento[] departamentos) {
		this.departamentos = departamentos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	public void mostrarPais() {
		
		System.out.println("Nombre del Pais: " + getNombre());
		System.out.println("Nombre del Nro  de Departamentos: " + getNroDeps());
		for(int i=0;i<this.getDepartamentos().length; i++) {
			
			departamentos[i].mostrarDepartamento();
		}
	}
	
	public void agregarNuevoDepartamento(Departamento departamento) {
		

		Departamento[] nuevoDepartamentos = new Departamento[departamentos.length + 1];
		
		for (int i = 0; i < departamentos.length; i++) {
			nuevoDepartamentos[i] = departamentos[i];
		}
		
		nuevoDepartamentos[nuevoDepartamentos.length - 1] = departamento;
		
		setDepartamentos(nuevoDepartamentos);
		
		setNroDeps(getNroDeps() + 1);
	}
}
