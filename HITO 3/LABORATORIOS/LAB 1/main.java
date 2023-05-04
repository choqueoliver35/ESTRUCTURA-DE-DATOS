package PilaDeNumerosH3;

public class main {

	public static void main(String[] args)
	{
		//LAB1
		// TODO Auto-generated method stub
		PilaNumeros pila1 = new PilaNumeros();
		pila1.adicionar(10);
		pila1.adicionar(2);
		pila1.adicionar(5);
		pila1.adicionar(23);
		pila1.adicionar(5);
		
		pila1.mostrar();
		
		//System.out.println("\n\nNumero max");
		//muestraNumeroMax(pila1);

		//System.out.println("\n\n");
		//pila1.mostrar();
		
		//determinar cuantos numeros 5 hay en la pila
		//el metodo recive 2 parametros
		//la pila
		//el numero a buscar
		//System.out.println("\n\n");
		//numeroDeRepeticiones(pila1, 5);
		
		//System.out.println("\n\n");
		//pila1.mostrar();
		
		//System.out.println("\n\nNumero max "+findMax(pila1));
		
		//System.out.println("\n\nNumero min "+findMin(pila1));
		
		
		//exchangeMaxMin(pila1);
		//System.out.println("\n\nMostrando la pila Exchanging Max and Min\n");
		//pila1.mostrar();
		
		
		
	}
	
	private static int findMin(PilaNumeros pila)
	{
		// TODO Auto-generated method stub
		int item = 0;
		int min = findMax(pila);
		
		PilaNumeros aux = new PilaNumeros();
		
		while(!pila.esVacio()) 
		{
			item = pila.eliminar();
			
			if(item < min)
			{				
				min = item;
			}
			
			aux.adicionar(item);
		}
		pila.vaciar(aux);
		
		return min;
	}

	private static int findMax(PilaNumeros pila) 
	{
		// TODO Auto-generated method stub
		int item = 0;
		int max = 0;
		
		PilaNumeros aux = new PilaNumeros();
		while(!pila.esVacio()) 
		{
			item = pila.eliminar();
			
			if(item > max)
			{				
				max = item;
			}
			aux.adicionar(item);
		}
		pila.vaciar(aux);
		
		return max;
	}

	private static void exchangeMaxMin(PilaNumeros pila) 
	{
		int max = findMax(pila);
		int min = findMin(pila);
		int item = 0;
		
		
		PilaNumeros aux = new PilaNumeros();
		while(!pila.esVacio()) 
		{
			item = pila.eliminar();
			
			if(item == max)
			{				
				item = min;
			}
			else 
			{
				if(item == min) 
				{
					item = max;
				}
			}
		
			aux.adicionar(item);
		}
		pila.vaciar(aux);
		
		
		
		
	}

	private static void numeroDeRepeticiones(PilaNumeros pila, int numbusc)
	{
		// TODO Auto-generated method stub
		int item = 0;
		int numderep = 0;
		// TODO Auto-generated method stub
		PilaNumeros aux = new PilaNumeros();
		while(!pila.esVacio()) 
		{
			item = pila.eliminar();
			
			if(item == numbusc)
			{				
				numderep++;
			}
			aux.adicionar(item);
		}
		pila.vaciar(aux);
		
		System.out.println("El numero " + numbusc +" se repite: " + numderep);
	}

	private static void muestraNumeroMax(PilaNumeros pila)
	{
		int item = 0;
		int max = 0;
		// TODO Auto-generated method stub
		PilaNumeros aux = new PilaNumeros();
		while(!pila.esVacio()) 
		{
			item = pila.eliminar();
			
			if(item > max)
			{				
				max = item;
			}
			aux.adicionar(item);
		}
		pila.vaciar(aux);
		
		System.out.println("Numero: " + max);
	}
	

}
