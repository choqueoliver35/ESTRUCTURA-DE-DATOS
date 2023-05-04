package PilaDeNumerosH3;

public class mainLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro book1 = new Libro("Homero",500,30.00,"La Odisea","Historia");
		Libro book2 = new Libro("Homero",300,20.00,"La Ileada","Historia");
		
		PilaDeLibros pilaA = new PilaDeLibros();
		
		Libro book3 = new Libro("Desconocido",500,50.00,"Madrid Zombi","Terror");
		Libro book4 = new Libro("Desconocido",300,80.00,"Pinocho","Fantasia");
		
		PilaDeLibros pilaB = new PilaDeLibros();
		
		pilaA.adicionar(book1);
		pilaA.adicionar(book2);
		
		pilaA.mostrar();
		
		
		pilaB.adicionar(book3);
		pilaB.adicionar(book4);
		
		pilaB.mostrar();
		//determinar cuantos libros tienen un costo mayor 25
		
		//mostrarSegunCosto(pilaA,25.00);

		
		//descuentaSeguncategoria(pilaA,"Historia");
		//pilaA.mostrar();
		
		exchangeBooks(pilaA,pilaB);
		pilaA.mostrar();
		pilaB.mostrar();
	}

	private static void exchangeBooks(PilaDeLibros pila1, PilaDeLibros pila2) 
	{
		// TODO Auto-generated method stub
	
		Libro item1 = null;
		Libro item2 = null;
		
		Libro max1 = findMax(pila1);
		Libro max2 = findMax(pila2);
		
		PilaDeLibros aux = new PilaDeLibros();
		PilaDeLibros aux1 = new PilaDeLibros();
		while(!pila1.esVacio()) 
		{
			item1 = pila1.eliminar();
			
			if(item1.equals(max1)) 
			{
				item1 = max2;
			}
			
			aux.adicionar(item1);
		}
		
		while(!pila2.esVacio()) 
		{
			item2 = pila2.eliminar();
			
			if(item2.equals(max2)) 
			{
				item2 = max1;
			}
			
			aux.adicionar(item2);
		}
		pila1.vaciar(aux);
		pila2.vaciar(aux1);
	
		

		
		
		
		
	}

	private static void descuentaSeguncategoria(PilaDeLibros pila, String categoria)
	{
		// TODO Auto-generated method stub
		Libro item = null;
		double auxlib = 0;
		// TODO Auto-generated method stub
		PilaDeLibros aux = new PilaDeLibros();
		
		
		while(!pila.esVacio()) 
		{
			item = pila.eliminar();
			
			if((item.getCategoria()).equals(categoria)) 
			{
				auxlib = item.getPrecio();
				auxlib = auxlib - auxlib*0.1;
				item.setPrecio(auxlib);
			}
			
			aux.adicionar(item);
		}
		pila.vaciar(aux);
	}

	private static void mostrarSegunCosto(PilaDeLibros pila, double costo) {
		// TODO Auto-generated method stub
		
		Libro item = null;
		int contador = 0;
		// TODO Auto-generated method stub
		PilaDeLibros aux = new PilaDeLibros();
		
		
		while(!pila.esVacio()) 
		{
			item = pila.eliminar();
			
			if(item.getPrecio() > costo) 
			{
				contador++;
			}
			
			aux.adicionar(item);
		}
		pila.vaciar(aux);
		
		System.out.println("Libros con precio mayor a "+ costo +" Bs = " + contador);
		
	}


	private static Libro findMax(PilaDeLibros pila) 
	{
		// TODO Auto-generated method stub
		Libro item = null;
		double max = 0;
		Libro itemMax = null;
		
		PilaDeLibros aux = new PilaDeLibros();
		while(!pila.esVacio()) 
		{
			item = pila.eliminar();
			
			if(item.getPrecio() > max)
			{				
				itemMax = item;
			}
			aux.adicionar(item);
		}
		pila.vaciar(aux);
		
		return itemMax;
	}


}
