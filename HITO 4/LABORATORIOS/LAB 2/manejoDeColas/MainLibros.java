package manejoDeColas;

public class MainLibros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaDeLibros cola = new ColaDeLibros();
		
		Libro lib1 = new Libro(1,"Juan","Masculino","MANGA",80);
		Libro lib2 = new Libro(2,"Saul","Masculino","MANGA",100);
		Libro lib3 = new Libro(3,"Ana","Femenino","HISTORIA",40);
		Libro lib4 = new Libro(4,"Micaela","Femenino","HISTORIA",30);
		Libro lib5 = new Libro(5,"Pepito","otro","NOVELA",20);
		Libro lib6 = new Libro(6,"Pep","otro","NOVELA",20);
		Libro lib7 = new Libro(7,"Carlos","Masculino","ARTE",200);
		
		cola.adicionar(lib1);
		cola.adicionar(lib2);
		cola.adicionar(lib3);
		cola.adicionar(lib4);
		cola.adicionar(lib5);
		cola.adicionar(lib6);
		cola.adicionar(lib7);
		
		
		//cola.mostrar();
		//Crear metodo estatico que muestre el libro con menor paginas
		//detMenor(cola).mostrar();
		
		//reordenar la cola de femenino a masculino
		//reordenalibro(cola);
		
		//ordenass de manera acentende en base a la cantidad de paginas
		ordenar(cola);

	}

	private static void ordenar(ColaDeLibros cola) {
		// TODO Auto-generated method stub
		ColaDeLibros colamenores = new ColaDeLibros();
		ColaDeLibros aux = new ColaDeLibros();
		int nroElem = cola.nroElem();
		
		for(int i = 1; i <= nroElem; i++) {
			
			Libro libro = detMenor(cola); 
			
			while(!cola.esVacia()) {
			 
				Libro item = cola.eliminar();
				
				if(item.getCodigoLibro() == libro.getCodigoLibro()) {
					colamenores.adicionar(item);
				}
				else {
					aux.adicionar(item); 
				}
			} 
			cola.vaciar(aux);
		}
		
		cola.vaciar(colamenores);
		cola.mostrar();
		
	}

	private static void reordenalibro(ColaDeLibros cola) {
		// TODO Auto-generated method stub
		ColaDeLibros auxO = new ColaDeLibros();
		ColaDeLibros auxM = new ColaDeLibros();
		Libro item = null;
	
		int min = Integer.MAX_VALUE;
		int nroElem = cola.nroElem();
		
		for(int i = 1; i <= nroElem; i++) {
			item = cola.eliminar();
			if(item.getGenero().equals("otro")) {
				auxO.adicionar(item);
			}
			else {
				if(item.getGenero().equals("Masculino")) {
					auxM.adicionar(item);
				}
				else {
					cola.adicionar(item);
				}
			}
		}
		
		cola.vaciar(auxM);
		cola.vaciar(auxO);
		
		cola.mostrar();
		
	}

	private static Libro detMenor(ColaDeLibros cola) {
		// TODO Auto-generated method stub
		ColaDeLibros aux = new ColaDeLibros();
		Libro minlibropaginas = null;
		int min = Integer.MAX_VALUE;
		int nroElem = cola.nroElem();
		
		while(!cola.esVacia()) {
			Libro item = cola.eliminar();
			if(item.getPaginas() < min) {
				min = item.getPaginas();
				minlibropaginas = item;
			}
			aux.adicionar(item);
		}
		
		cola.vaciar(aux);
		/*
		for(int i = 1; i <= nroElem; i++) {
			item = cola.eliminar();
			if(item.getPaginas() < min) {
				minlibropaginas = item;
				min = item.getPaginas();
			}
			
			cola.adicionar(item);
		}
		*/
		
		
		return minlibropaginas;
		
	}

}
