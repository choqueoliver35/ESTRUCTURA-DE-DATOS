package PilaDeNumerosH3;

import java.util.Scanner;

public class PilaDeCadenas 
{

	private int max;
	private int tope;
	private String[] p;

	public PilaDeCadenas(int max) 
	{	
		this.max = 10;
		this.tope = 0;
		this.p = new String[this.max + 1];
	}
	
	public boolean esVacio() 
	{
		if(this.tope == 0) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean esLlena() 
	{
		if(this.tope == this.max) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public int nroElem() 
	{
		return this.tope;
	}
	
	public void adicionar(String i) 
	{
		if(esLlena() == true) 
		{
			System.out.println("La pila es Llena");
		}
		else 
		{
			tope = tope + 1;
			p[tope] = i;
		}
	}
	
	public String eliminar() 
	{      
		String iteEliminado = "";
		
		if(esVacio() == true) 
		{
			System.out.println("La pila esta Vacia");
		}
		else
		{
			iteEliminado = p[this.tope];
			tope = tope -1;
		}
		return iteEliminado;
	}
	
	public void vaciar(PilaDeCadenas pila) 
	{
		while(!pila.esVacio())
			adicionar(pila.eliminar());
	}
	
	public void mostrar() 
	{
		String item = "";
		if(esVacio()==true) 
		{			
			System.out.println("\n No hay item que Mostrar");
		}
		else 
		{
			System.out.println("Mostrando la PILA DE NUMEROS");
			PilaDeCadenas aux = new PilaDeCadenas(this.max);
			while(esVacio() == false) 
			{
				item = eliminar();
				System.out.println("Numero: " + item);
				aux.adicionar(item);
			}
			vaciar(aux);
		}
	}
	
	public void llenar(int nroItems) 
	{
		
		Scanner leer = new Scanner(System.in);
		String nombre;
		System.out.println("Llenando la Pila deNombres(Cadenas)");
		for (int i = 0; i < nroItems; i++) 
		{
			System.out.println("Ingrese el nombre: " + (i+1) + ": ");
			nombre = leer.nextLine();
			adicionar(nombre);
			System.out.println();
		}
		
		
		
	}
	

}
