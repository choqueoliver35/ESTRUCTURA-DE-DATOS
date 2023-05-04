package PilaDeNumerosH3;

public class main {

	public static void main(String[] args)
	{
		
		PilaNumeros pila1 = new PilaNumeros();
		pila1.adicionar(10);
		pila1.adicionar(2);
		pila1.adicionar(5);
		pila1.adicionar(23);
		pila1.adicionar(5);
		
		pila1.mostrar();
		
		
		//LAB2
		//cantidadParImpar(pila1);
		
		//System.out.println("\n\n");
		//agregar(pila1);
		//pila1.mostrar();
		
		//System.out.println("\n\n");
		//agregar_v2(pila1,100);
		//pila1.mostrar();
	}
	

	private static void agregar_v2(PilaNumeros pila, int item)
	{
		// TODO Auto-generated method stub
	
		
		PilaNumeros aux = new PilaNumeros();
		
		aux.vaciar(pila);
		aux.adicionar(item);
		pila.vaciar(aux);
		
	}
	private static void agregar(PilaNumeros pila) {
		// TODO Auto-generated method stub
		int item = 100;
		
		
		
		PilaNumeros aux = new PilaNumeros();
		while(!pila.esVacio()) 
		{
			aux.adicionar(pila.eliminar());
		}
		
		pila.adicionar(item);
		
		while(!aux.esVacio()) 
		{
			pila.adicionar(aux.eliminar());
		}
		
		
	}

	private static void cantidadParImpar(PilaNumeros pila) {
		// TODO Auto-generated method stub
		int item = 0;
		int cimpar=0;
		int cpar=0;
		
		PilaNumeros aux = new PilaNumeros();
		while(!pila.esVacio()) 
		{
			item = pila.eliminar();
			
			if(item % 2 == 0)
			{				
				cpar++;
			}
			else 
			{
				if(item % 2 != 0) 
				{
					cimpar++;
				}
			}
			
			aux.adicionar(item);
		}
		pila.vaciar(aux);
		
		System.out.println("Cantidad de pares: "+cimpar);
		System.out.println("Cantidad de impares: "+cpar);
	}

}
