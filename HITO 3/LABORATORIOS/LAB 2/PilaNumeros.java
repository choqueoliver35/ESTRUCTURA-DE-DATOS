package PilaDeNumerosH3;
import java.util.*;

public class PilaNumeros {
	// TODO Auto-generated constructor stub
	private int max;
	private int tope;
	private int[] p;

	public PilaNumeros() 
	{	
		this.max = 10;
		this.tope = 0;
		this.p = new int[this.max + 1];
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
	
	public void adicionar(int NuevoNumero) 
	{
		if(esLlena() == true) 
		{
			System.out.println("La pila es Llena");
		}
		else 
		{
			tope = tope + 1;
			p[tope] = NuevoNumero;
		}
	}
	
	public int eliminar() 
	{      
		int iteEliminado = 0;
		
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
	
	public void vaciar(PilaNumeros pila) 
	{
		while(!pila.esVacio())
			adicionar(pila.eliminar());
	}
	
	public void mostrar() 
	{
		int item = 0;
		if(esVacio()==true) 
		{			
			System.out.println("\n No hay ITEMS que Mostrar");
		}
		else 
		{
			System.out.println("Mostrando la PILA DE NUMEROS");
			PilaNumeros aux = new PilaNumeros();
			while(esVacio() == false) 
			{
				item = eliminar();
				System.out.println("Numero: " + item);
				aux.adicionar(item);
			}
			vaciar(aux);
		}
	}
	
	public void llenar() 
	{
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Llenando la Pila deNombres(Cadenas)");
		if(esLlena() == true) 
		{
			System.out.println("La pila esta Llena");
		}
		else
		{
			while(esLlena() == false) 
			{
				
			}
		}
	}

	

	
}
