package manejo_de_pilas;

import java.util.*;

public class mainNombres {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String[] Nombres = new String[5];
		
		Nombres[0] = "Ana";
		Nombres[1] = "Juan";
		Nombres[2] = "Pepito";
		Nombres[3] = "Carla";
		Nombres[4] = "Freddy";
		
		Nombres edd = new Nombres("EDD",Nombres);
		
		//creaar un  metodo que determine cuantas personas 
		//del paralelo tienen el nombre pepito
		
		
		numNom(edd);
		
		int c = buscarnom(edd, "Mijail");
		
		System.out.println("Mijail se repite: " + c + "veces");
		
		
		//Scanner leer = new Scanner(System.in);

		//String a = leer.nextLine();
		
		
		//agregarNom(edd, a);
		
		//mostrar(edd);
		
		//agregarNom1(edd, a);
		
		//edd.mostrar();
		
		
		agregarNomFinal(edd, "harold");
	
		edd.mostrar();
	}

	
	
	private static void agregarNomFinal(Nombres edd, String nombreAgregado)
	{
		// TODO Auto-generated method stub
		String[] Nombres = edd.getNombres();
		String[] aux = new String[Nombres.length + 1];
		
		for(int i=0; i<Nombres.length; i++)
		{
			aux[i] = Nombres[i];
		}
	
		
		aux[Nombres.length] = nombreAgregado;
		
		edd.setNombres(aux);
	}



	private static void agregarNom1(Nombres edd, String nombreAgregado) 
	{
		// TODO Auto-generated method stub
		String[] Nombres = edd.getNombres();
		String[] aux = new String[Nombres.length + 1];
		
		
		aux[0] = nombreAgregado;
		
		
		for(int i=0; i<Nombres.length; i++)
		{
			aux[i+1] = Nombres[i];
		}
		
		edd.setNombres(aux);
		
		
		
	}

	private static void agregarNom(Nombres edd, String nombreAgregado) 
	{
		// TODO Auto-generated method stub
		String[] Nombres = edd.getNombres();
		
		int i=0;
		int a=0;
		int b=1;;
		String[] aux = new String[Nombres.length + 1];
		
		aux[0] = Nombres[i];
		Nombres[i] = nombreAgregado;
		
		for(i=1; i<Nombres.length; i++)
		{
			aux[b] = Nombres[i];
			Nombres[i] = aux[a];
			a++;
			b++;
			
		}
		
		edd.setNombres(Nombres);
		
		
		
	}

	private static int buscarnom(Nombres edd, String nombreBuscar) {
		// TODO Auto-generated method stub
		String[] Nombres = edd.getNombres();
		
		int i=0, contador=0;
		
		for(i=0; i<Nombres.length; i++)
		{
			if(Nombres[i] == nombreBuscar) 
			{
				contador+=1; 
			}
		}
		
		return contador;
		
	}

	private static void numNom(Nombres edd) 
	{
		// TODO Auto-generated method stub
		int a=0;
		for(int i=0; i<edd.getNombres().length; i++)
		{
			if(edd.getNombres()[i]=="Pepito") 
			{
				a++;
			}
		}
		
		System.out.println("hay " + a + " personas que se llaman pepito");
	}

}
