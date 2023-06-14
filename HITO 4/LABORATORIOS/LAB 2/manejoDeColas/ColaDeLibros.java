package manejoDeColas;

public class ColaDeLibros {

	private int max;
	private int fin;
	private int ini;
	private Libro[] libros;

	
	public ColaDeLibros() {

		this.max = 100;
		this.fin = 0;
		this.ini = 0;
		this.libros = new Libro[this.max + 1];
	} 
	
	
	public int getFin() {
		return fin;
	}


	public int getIni() {
		return ini;
	}


	public boolean esVacia() {
		if(ini == 0 && fin == 0) {
			return true;	
		}
		else {
			return false;
		}
	}
	
	public boolean esLlena() {
		if(fin == max ) {
			return true;	
		}
		else {
			return false;
		}
	}
	
	public void adicionar(Libro newLibros)
    {
        if(esLlena())
        {
            System.out.println("La cola es Llena");
        }
        else
        {
        	fin ++;
        	libros[fin] = newLibros;
            
        }
    } 
	
	 
	public Libro eliminar()
	 
	{
		Libro deleteNum = null;

	    if(esVacia() == true)
	    {
	    	System.out.println("La cola esta Vacia");   
	    }
	    else  
	    { 
	    	ini++;
	    	deleteNum = libros[this.ini];
	    	
	    	if(ini == fin) {
	    		ini = fin = 0;
	    	}
	    		
	    
	    }
	        
	    return deleteNum; 
	}
	
	 
	public int nroElem()   
	{
		return fin - ini;    
	}
	
	public void vaciar(ColaDeLibros cola)
    {
        while(!cola.esVacia())
            adicionar(cola.eliminar());
    }
	
	public void mostrar()
    {
        Libro item = null;
        
        if(esVacia())
        {
            System.out.println("\n No hay item que Mostrar");
        }
        else
        {
            System.out.println("Mostrando la COLA DE LIBROS");
            
            ColaDeLibros aux = new ColaDeLibros();
            
            while(!esVacia())
            {
                item = eliminar();
                item.mostrar();
                aux.adicionar(item);
            }
            vaciar(aux);
        }
        
        
    }
}
