package manejo_de_pilas;

public class Nombres 
{
	
	private String Paralelo;
	private String[] Nombres;
	
	
	public Nombres(String Paralelo, String[] Nombres) 
	{
		// TODO Auto-generated constructor stub
		
        this.Paralelo = Paralelo;
        this.Nombres = Nombres;	
	}


	public String getParalelo() {
		return Paralelo;
	}


	public void setParalelo(String paralelo) {
		Paralelo = paralelo;
	}


	public String[] getNombres() {
		return Nombres;
	}


	public void setNombres(String[] nombres) {
		Nombres = nombres;
	}
	
	public void mostrar() 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Paralelo: " + Paralelo);
		for(int i=0; i<6; i++) 
		{
			System.out.println(Nombres[i]);
		}
	}

}
