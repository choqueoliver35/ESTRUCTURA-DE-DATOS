package manejoDeColas;

import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ColaDeNumeros cola = new ColaDeNumeros();
		cola.adicionar(1);
		cola.adicionar(2);
		cola.adicionar(4);
		cola.adicionar(4);
		cola.adicionar(5);
		cola.adicionar(6);
		cola.adicionar(5);

		
		cola.mostrar();
		
		//detNumMult(cola,2);
		
		//elimElemRep(cola);
		
		System.out.println("\n");
		//elimElemRep(cola);
		//cola.mostrar();
		
		repitemas(cola);
		cola.mostrar();
		/*
		int[] a = new int[10];
		a = encontrarNumeroMasRepetido(cola);
		
		for(int i = 0; i<=10; i++) {
			System.out.println(a[i]);
		}
		*/

		//System.out.println(verificaSiExisteUnoMas(cola,4));
		
		
		
	}


	public static boolean verificaSiExisteUnoMas(ColaDeNumeros cola, int num) {
		// TODO Auto-generated method stub
		int cont = 0;
		int item = 0;
		int nroElem = cola.nroElem();
		
		for(int i = 1; i <= nroElem; i++) {
			item = cola.eliminar();
			if(item == num) {
				cont++;
			}
			
			cola.adicionar(item);
			
		}
		
		if(cont > 0) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static void repitemas(ColaDeNumeros cola) {
		// TODO Auto-generated method stub
		int nroElem = cola.nroElem();
		int item = 0;
		int[] a = new int[10];

		
		for(int i=1; i<=nroElem; i++){
			item = cola.eliminar();
			
			if(verificaSiExisteUnoMas(cola,item)) {
				
				a[i] = item;
				
				
			}
			
			cola.adicionar(item);
		}
		for(int i=1; i<=nroElem; i++){
			
			item = cola.eliminar();
			
			if(a[i] == item ) {
				
			}
			else{				
				cola.adicionar(item);
			}
			
		}
		

	}


	
	/*
	public static int[] encontrarNumeroMasRepetido(ColaDeNumeros cola) {
	   
	    ColaDeNumeros aux1 = new ColaDeNumeros();
	    ColaDeNumeros aux2 = new ColaDeNumeros();
	    int[] aux3 = new int[100];
	    int maxRepetido = 0;
	    int maxnumrep = 0;
	    int cont = 0;
	    int item = 0;
	    int elementoActual = 0;
	    int i = 0;

	    while(!cola.esVacia()) {
			
			item = cola.eliminar();
			aux1.adicionar(item);
			aux2.adicionar(item);
		}
	

	    while (!aux1.esVacia()){
	    	
	        item = aux1.eliminar();
	        cont = 0;

	        while (!aux2.esVacia()) {
	            elementoActual = aux2.eliminar();

	            if (elementoActual == item) {
	            	cont++;
	            }

	            cola.adicionar(elementoActual);
	        }
	        
	        aux2.vaciar(cola);
	        
	        if(cont > 1) {	        	
	        	aux3[i] = item;
	        	i++;
	        }
	    }

	    cola.vaciar(aux2);
	    return aux3;
	}




	
	private static void elimElemRep(ColaDeNumeros cola) {
		// TODO Auto-generated method stub
		int item = 0;

		int j = 0;
		int[] aux3 = new int[10];
		int nroElem = cola.nroElem();
		aux3 = encontrarNumeroMasRepetido(cola);
		ColaDeNumeros aux = new ColaDeNumeros();
	

		while(!cola.esVacia()) {
				
			item = cola.eliminar();
				
			if(aux3[j] == item) {
				j++;					
			}
		
			else {
				aux.adicionar(item);
			}			
		}
        

		cola.vaciar(aux);
	}
	*/

	private static void detNumMult(ColaDeNumeros cola, int mult) {
		// TODO Auto-generated method stub
	
		int item = 0;
		int cont = 0;
		ColaDeNumeros aux = new ColaDeNumeros();
		
		while(!cola.esVacia()) {
			
			item = cola.eliminar();
			if(item % mult == 0) {
				cont++;
			}
				
			aux.adicionar(item);
		}
		cola.vaciar(aux);
		
		System.out.println("El numero de elementos que son multiplos de " + mult +" son: " + cont);
	}
	
	
	

}
