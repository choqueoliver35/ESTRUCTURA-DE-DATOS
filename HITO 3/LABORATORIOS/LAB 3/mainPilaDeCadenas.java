package PilaDeNumerosH3;

public class mainPilaDeCadenas {

	public static void main(String[] args)
	{
		PilaDeCadenas nombresEDD = new PilaDeCadenas(10);
		
		nombresEDD.adicionar("wiliam");
		nombresEDD.adicionar("Andres");
		nombresEDD.adicionar("Josias");
		nombresEDD.adicionar("Iris");
		nombresEDD.adicionar("Jonathan");
		nombresEDD.adicionar("Ilia");
		
		//nombresEDD.llenar(6);
		
		nombresEDD.mostrar();
		
		System.out.println("\n");
		cuentanombres(nombresEDD,"Andres");
		
		//lab3
		//añadirentre(nombresEDD,"Ana","Andres");
		
		//nombresEDD.mostrar();
		
		//cambiar(nombresEDD);
		
		//nombresEDD.mostrar();
		
		
		//kesimo(nombresEDD, 3);
		
		//nombresEDD.mostrar();
		
	}

	private static void kesimo(PilaDeCadenas pila, int kesimo) {
		// TODO Auto-generated method stub
		String item;
		String nomaux = "";
		PilaDeCadenas aux = new PilaDeCadenas(10);
		aux.vaciar(pila);
	
		
		while(!aux.esVacio()) 
		{
			item = aux.eliminar();
			
			if(aux.nroElem()==kesimo)
			{				
				nomaux = item;
				
			}
			else
			{
				pila.adicionar(item);
			}
			
		}
		
		pila.adicionar(nomaux);
		
		
	}

	private static void cambiar(PilaDeCadenas pila) {
		// TODO Auto-generated method stub
		String item = pila.eliminar();
		PilaDeCadenas aux = new PilaDeCadenas(10);
		aux.vaciar(pila);
		String item2 = aux.eliminar();
		pila.adicionar(item);
		pila.vaciar(aux);
		pila.adicionar(item2);
	}

	private static void añadirentre(PilaDeCadenas pila, String nom,String nomquem) {
		// TODO Auto-generated method stub
		
		String item;
	
		// TODO Auto-generated method stub
		PilaDeCadenas aux = new PilaDeCadenas(10);
		while(!pila.esVacio()) 
		{
			item = pila.eliminar();
			
			if(item.equals(nomquem))
			{				
				
				aux.adicionar(nom);
			}
			aux.adicionar(item);
		}
		pila.vaciar(aux);
		
	}

	private static void cuentanombres(PilaDeCadenas pila, String nom) {
		// TODO Auto-generated method stub
		
		String item;
		int numderep = 0;
		// TODO Auto-generated method stub
		PilaDeCadenas aux = new PilaDeCadenas(10);
		while(!pila.esVacio()) 
		{
			item = pila.eliminar();
			
			if(nom.equals(item))
			{				
				numderep++;
			}
			aux.adicionar(item);
		}
		pila.vaciar(aux);
		
		System.out.println("El nombre " + nom +" se repite: " + numderep);
	}
	
	
	
	

	

}
