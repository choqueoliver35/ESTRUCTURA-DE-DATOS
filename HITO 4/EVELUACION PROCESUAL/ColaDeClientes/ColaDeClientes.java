package ColaDeClientes;


public class ColaDeClientes {
	private int max;
	private int fin;
	private int ini;
	private Cliente[] cliente;

	
	public ColaDeClientes() {

		this.max = 100;
		this.fin = 0;
		this.ini = 0;
		this.cliente = new Cliente[this.max + 1];
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
	
	public void adicionar(Cliente newCliente)
    {
        if(esLlena())
        {
            System.out.println("La cola es Llena");
        }
        else
        {
        	fin ++;
        	cliente[fin] = newCliente;
            
        }
    } 
	
	 
	public Cliente eliminar()
	 
	{
		Cliente deleteCliente = null;

	    if(esVacia() == true)
	    {
	    	System.out.println("La cola de clientes esta Vacia");   
	    }
	    else  
	    { 
	    	ini++;
	    	deleteCliente = cliente[this.ini];
	    	
	    	if(ini == fin) {
	    		ini = 0;
	    		fin = 0;
	    	}
	    		
	    
	    }
	        
	    return deleteCliente; 
	}
	
	 
	public int nroElem()   
	{
		return fin - ini;    
	}
	
	public void vaciar(ColaDeClientes cola)
    {
        while(!cola.esVacia())
            adicionar(cola.eliminar());
    }
	
	public void mostrar()
    {
		Cliente item = null;
        if(esVacia())
        {
            System.out.println("\n No hay item que Mostrar");
        }
        else
        {
            System.out.println("Mostrando la COLA DE CLIENTES");
            
            ColaDeClientes aux = new ColaDeClientes();
            
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
