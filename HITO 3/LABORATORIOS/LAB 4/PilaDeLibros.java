package PilaDeNumerosH3;

import java.util.Scanner;

public class PilaDeLibros {

	private int max;
	private int tope;
	private Libro[] Libro;

	public PilaDeLibros() 
	{	
		this.max = 10;
		this.tope = 0;
		this.Libro = new Libro[this.max + 1];
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
	
	public void adicionar(Libro newBook) 
	{
		if(esLlena()) 
		{
			System.out.println("La pila es Llena");
		}
		else 
		{
			tope = tope + 1;
			Libro[tope] = newBook;
		}
	}
	
	public Libro eliminar() 
	{      
		Libro libroEliminado = null;
		
		if(esVacio() == true) 
		{
			System.out.println("La pila de libros esta Vacia");
		}
		else
		{
			libroEliminado = Libro[this.tope];
			tope = tope -1;
		}
		return libroEliminado;
	}
	
	
	public void vaciar(PilaDeLibros pila) 
	{
		while(!pila.esVacio())
			adicionar(pila.eliminar());
	}
	
	public void mostrar() 
	{
		Libro item = null;
		if(esVacio()) 
		{			
			System.out.println("\n No hay item que Mostrar");
		}
		else 
		{
			System.out.println("Mostrando la PILA DE LIBROS");
			PilaDeLibros aux = new PilaDeLibros();
			while(!esVacio()) 
			{
				item = eliminar();
				item.mostrarLibro();
				aux.adicionar(item);
			}
			vaciar(aux);
		}
	}
	
	/*
	public void llenar(int nroItems) 
	{
		
		Scanner leer = new Scanner(System.in);
		Libro nombre;
		System.out.println("Llenando la Pila deNombres(Cadenas)");
		for (int i = 0; i < nroItems; i++) 
		{
			System.out.println("Ingrese el nombre: " + (i+1) + ": ");
			nombre = leer.nextLine();
			adicionar(nombre);
			System.out.println();
		}
	}
	
	*/
}
