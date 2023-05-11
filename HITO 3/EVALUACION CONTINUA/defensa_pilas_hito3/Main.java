package defensa_pilas_hito3;

import java.util.*;

import PilaDeClientes.Cliente;
import PilaDeClientes.PilaCliente;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estudiante est1 = new Estudiante("Nombre1","Apellido1",18,"El Alto",85,"12345678LP");
		Estudiante est2 = new Estudiante("Nombre2","Apellido2",18,"Santa cruz",55,"12345695CZ");
		Estudiante est3 = new Estudiante("Nombre3","Apellido3",20,"Santa Cruz",65,"12345687CZ");
		Estudiante est4 = new Estudiante("Nombre4","Apellido4",21,"El Alto",92,"12345632LP");
		Estudiante est5 = new Estudiante("Nombre5","Apellido5",19,"El Alto",100,"12345614LP");
		
		PilaEstudiante pila = new PilaEstudiante();
		pila.adicionar(est1);
		pila.adicionar(est2);
		pila.adicionar(est3);
		pila.adicionar(est4);
		pila.adicionar(est5);
		
		//pila.mostrar();
		
		
		//detEstaprob(pila,"El Alto");
		
		
		System.out.println("\n\n");
		kEsimoPosicion(pila,4);
		pila.mostrar();
		
		
		/*
		System.out.println("\n\n");
		menorNota(pila);
		pila.mostrar();
		*/
		
		/*
		String str = est1.getCI();
		String substr = str.substring(str.length() -2);
		System.out.println(substr);
		pilaCB(pila,"LP");
		pila.mostrar();
		*/

	}
	
	private static void pilaCB(PilaEstudiante pila, String cede) {
		// TODO Auto-generated method stub
		PilaEstudiante aux = new PilaEstudiante();
		PilaEstudiante aux1 = new PilaEstudiante();
		Estudiante item = null;
		String str = "";
		String substr = "";
		while(!pila.esVacio()) {
			
			item = pila.eliminar();
			str = item.getCI();
			substr = str.substring(str.length() -2);
			
			if(substr.equals(cede)) {
				aux1.adicionar(item);
			}
			else{
				aux.adicionar(item);
			}
		}
		pila.vaciar(aux);
		pila.vaciar(aux1);
	
	}

	
	private static void menorNota(PilaEstudiante pila) {
		// TODO Auto-generated method stub
		
		PilaEstudiante aux = new PilaEstudiante();
		PilaEstudiante aux1 = new PilaEstudiante();
		aux.vaciar(pila);
		Estudiante item = null;
		int itemAux = 100;
		Estudiante itemmin = null;
		
		while(!aux.esVacio()) 
		{
			item = aux.eliminar();
			
			if(item.getNotafinal() < itemAux) {
				
				itemmin = item;
				itemAux = item.getNotafinal();
				pila.adicionar(item);
			}
			else
			{
				pila.adicionar(item);
			}
			
		}
		
		
		while(!pila.esVacio()) 
		{
			item = pila.eliminar();
			
			if(item == itemmin) {
				
			}
			else
			{
				aux1.adicionar(item);
			}
			
		}
	
		
		pila.adicionar(itemmin);
		pila.vaciar(aux1);
		
	}


	private static void kEsimoPosicion(PilaEstudiante pila, int valorTope) {
		// TODO Auto-generated method stub
		PilaEstudiante aux = new PilaEstudiante();
		Estudiante item = null;
		Estudiante itemAux = null;
		
		if(valorTope <= pila.nroElem()) {
			aux.vaciar(pila);
			
			while(!aux.esVacio()) 
			{
				item = aux.eliminar();
				
				pila.adicionar(item);
				
		
				if(pila.nroElem()==valorTope)
				{				
					itemAux = item;
				}
				
			}
			
			aux.vaciar(pila);
			while(!aux.esVacio()) 
			{
				item = aux.eliminar();

				if(item==itemAux)
				{				
				}
				else {
					pila.adicionar(item);
				}
				
			}
			
			
			pila.adicionar(itemAux);
		}
		else {
			System.out.println("la pila no tiene esa cantidad de elementos");
			
		}
			
		
	}

	private static void detEstaprob(PilaEstudiante pila, String sede) {
		// TODO Auto-generated method stub
		
		PilaEstudiante aux = new PilaEstudiante();
		
		Estudiante item = null;
		
		int cont = 0;

		String str = "";
		String substr = str.substring(8, 2);
		while(!pila.esVacio()) {
			
			item = pila.eliminar();
			str = item.getCI();
			substr = str.substring(str.length() -2);
			
			if(item.getSede().equals(sede)) {
				if(item.getNotafinal() > 50) {
					if(substr.equals("LP")) {
						cont++;
					}
				}
					
			}
				
			aux.adicionar(item);
		}
		
		pila.vaciar(aux);
		System.out.println("El numero de estudiantes aprobados de la cede " + sede +" son: " + cont);
		
	}
	
	
	
}
