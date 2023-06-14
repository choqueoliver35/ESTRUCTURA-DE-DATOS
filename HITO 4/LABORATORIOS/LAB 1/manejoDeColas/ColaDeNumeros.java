package manejoDeColas;

public class ColaDeNumeros {
	
	private int max;
	private int fin;
	private int ini;
	private int[] numeros;

	
	public ColaDeNumeros() {

		this.max = 100;
		this.fin = 0;
		this.ini = 0;
		this.numeros = new int[this.max + 1];
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
	
	public void adicionar(int newNumero)
    {
        if(esLlena())
        {
            System.out.println("La cola es Llena");
        }
        else
        {
        	fin ++;
            numeros[fin] = newNumero;
            
        }
    } 
	
	 
	public int eliminar()
	 
	{
		int deleteNum = 0;

	    if(esVacia() == true)
	    {
	    	System.out.println("La cola de numeros esta Vacia");   
	    }
	    else  
	    { 
	    	ini++;
	    	deleteNum = numeros[this.ini];
	    	
	    	if(ini == fin) {
	    		ini = 0;
	    		fin = 0;
	    	}
	    		
	    
	    }
	        
	    return deleteNum; 
	}
	
	 
	public int nroElem()   
	{
		return fin - ini;    
	}
	
	public void vaciar(ColaDeNumeros cola)
    {
        while(!cola.esVacia())
            adicionar(cola.eliminar());
    }
	
	public void mostrar()
    {
        int item = 0;
        if(esVacia())
        {
            System.out.println("\n No hay item que Mostrar");
        }
        else
        {
            System.out.println("Mostrando la PILA DE ESTUDIANTES");
            
            ColaDeNumeros aux = new ColaDeNumeros();
            
            while(!esVacia())
            {
                item = eliminar();
                System.out.println("Numero: " + item);
                aux.adicionar(item);
            }
            vaciar(aux);
        }
        
        
    }

}
