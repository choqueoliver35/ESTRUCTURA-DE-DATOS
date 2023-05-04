package PilaDeClientes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente c1 = new  Cliente("Nombre1","Apellido1",18,"Direccion1","Masculino");
		Cliente c2 = new  Cliente("Nombre2","Apellido2",18,"Direccion2","Femenino");
		Cliente c3 = new  Cliente("Nombre3","Apellido3",18,"Direccion3","Masculino");
		Cliente c4 = new  Cliente("Nombre4","Apellido4",20,"Direccion4","Femenino");
		Cliente c5 = new  Cliente("Nombre5","Apellido5",21,"Direccion5","Femenino");
		
		PilaCliente pc1 = new PilaCliente();
		
		pc1.adicionar(c1);
		pc1.adicionar(c2);
		pc1.adicionar(c3);
		pc1.adicionar(c4);
		pc1.adicionar(c5);
	
		//pc1.mostrar();
		//mayoresCiertaEdad(pc1, 20);	
		
		/*
		System.out.println("\n\n");
		kEsimoPosicion(pc1, 3);
		pc1.mostrar();
		*/
		
		/*
		System.out.println("\n\n");
		asignaDireccion(pc1, "New Direccion");
		pc1.mostrar();
		*/
		
		/*
		System.out.println("\n\n");
		reordenaPila(pc1);
		pc1.mostrar();
		*/
		
		
	}

	private static PilaCliente pilaGenMasc(PilaCliente pila) {
		// TODO Auto-generated method stub
		PilaCliente aux = new PilaCliente();
		aux.vaciar(pila);
		Cliente item = null;
		PilaCliente pilaMasc = new PilaCliente();
		
		while(!aux.esVacio()) {
			
			item = aux.eliminar();
			if(item.getGenero().equals("Masculino")) {
				pilaMasc.adicionar(item);
			}
				
			pila.adicionar(item);
		}
		
		return pilaMasc;
	}
	
	private static PilaCliente pilaGenFem(PilaCliente pila) {
		// TODO Auto-generated method stub
		PilaCliente aux = new PilaCliente();
		aux.vaciar(pila);
		Cliente item = null;
		PilaCliente pilaFem = new PilaCliente();
		
		while(!aux.esVacio()) {
			
			item = aux.eliminar();
			if(item.getGenero().equals("Femenino")) {
				pilaFem.adicionar(item);
			}
				
			pila.adicionar(item);
		}
		
		return pilaFem;
	}

	private static void reordenaPila(PilaCliente pila) {
		// TODO Auto-generated method stub
		PilaCliente aux = new PilaCliente();
		PilaCliente pilamasc = new PilaCliente();
		PilaCliente pilafem = new PilaCliente();
		
		aux.vaciar(pila);
		
		pilamasc = pilaGenMasc(aux);
		pilafem = pilaGenFem(aux);
		
		pila.vaciar(pilamasc);
		pila.vaciar(pilafem);
		
		
	}

	private static void asignaDireccion(PilaCliente pila, String nuevaDireccion) {
		// TODO Auto-generated method stub
		PilaCliente aux = new PilaCliente();
		Cliente item = null;
		
		
		aux.vaciar(pila);
		
		while(!aux.esVacio()) {
			
			item = aux.eliminar();
			
			if(item.getGenero().equals("Femenino")) {
				
				item.setDireccion(nuevaDireccion);
				pila.adicionar(item);
			}
			else {
				pila.adicionar(item);
			}
		}
		
	}

	private static void kEsimoPosicion(PilaCliente pila, int valorTope) {
		// TODO Auto-generated method stub
		PilaCliente aux = new PilaCliente();
		Cliente item = null;
		Cliente itemAux = null;
		
		aux.vaciar(pila);
		
		while(!aux.esVacio()) {
			
			item = aux.eliminar();
			
			if(aux.nroElem() == valorTope - 1) {
				
				itemAux = item;
			}
			else {
				pila.adicionar(item);
			}
		}
		
		pila.adicionar(itemAux);
		
	}

	private static void mayoresCiertaEdad(PilaCliente pila, int edadMayor) {
		// TODO Auto-generated method stub
		PilaCliente aux = new PilaCliente();
		Cliente item = null;
		int cont = 0;
		
		while(!pila.esVacio()) {
			
			item = pila.eliminar();
			
			if(item.getEdad() > edadMayor) {
				cont++;
			}
				
			aux.adicionar(item);
		}
		
		pila.vaciar(aux);
		
		System.out.println("El Numero de Clientes con edad mayor a " + edadMayor + " es: " + cont);
	
	}
	
	
	
	
	
		
	
}

