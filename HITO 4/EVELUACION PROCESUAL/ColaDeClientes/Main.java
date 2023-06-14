package ColaDeClientes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 12
		Cliente cliente1 = new Cliente("John", "Doe", 30, "Estados Unidos", "Masculino", "GOLD");
        Cliente cliente2 = new Cliente("Karen", "Smith", 25, "Canadá", "Femenino", "VIP");
        Cliente cliente3 = new Cliente("Saul", "Pérez", 61, "Bolivia", "Masculino", "GOLD");
        Cliente cliente4 = new Cliente("Robert", "Gomez", 28, "Argentina", "Femenino", "VIP");
        Cliente cliente5 = new Cliente("Bruss", "Lee", 71, "Bolivia", "Masculino", "GOLD");
        
        ColaDeClientes cola = new ColaDeClientes();
        cola.adicionar(cliente1);
        cola.adicionar(cliente2);
        cola.adicionar(cliente3);
        cola.adicionar(cliente4);
        cola.adicionar(cliente5);
        
        cola.mostrar();
        
        //Ejercicio 13
        //promocionNacionalidad(cola,"VIP","Bolivia");
        
        //cola.mostrar();
        
        //Ejercicio 14
        //subirarriba(cola,60);
        
        
        //cola.mostrar();
        
        //Ejercicio 15
        
        Cliente cliente6 = new Cliente("John", "Doe", 30, "Estados Unidos", "Masculino", "GOLD");
        Cliente cliente7 = new Cliente("Saul", "Smith", 25, "Canadá", "Femenino", "VIP");
        Cliente cliente8 = new Cliente("Juan", "Pérez", 60, "México", "Masculino", "GOLD");
        Cliente cliente9 = new Cliente("Maria", "Gomez", 28, "Argentina", "Femenino", "VIP");
        Cliente cliente10 = new Cliente("Robert", "Lee", 60, "Bolivia", "Masculino", "GOLD");
        
        ColaDeClientes cola2 = new ColaDeClientes();
        cola2.adicionar(cliente6);
        cola2.adicionar(cliente7);
        cola2.adicionar(cliente8);
        cola2.adicionar(cliente9);
        cola2.adicionar(cliente10);
    
        //cambiarVuelo(cola,cola2,"Saul");
        
        //cola2.mostrar();

        

	}

	private static void cambiarVuelo(ColaDeClientes cola, ColaDeClientes cola2, String nombre) {
		// TODO Auto-generated method stub

		Cliente item = null;
		int nroElem = cola.nroElem();
		ColaDeClientes aux1 = new ColaDeClientes();
		ColaDeClientes aux2 = new ColaDeClientes();
		
		for(int i = 1; i <= nroElem; i++) {

			item = cola.eliminar();
			
			if(item.getNombres().equals(nombre)) {
				aux1.adicionar(item);
			}
			
			cola.adicionar(item);
		}
	
		aux2.vaciar(cola2);
		cola2.vaciar(aux1);
		cola2.vaciar(aux2);
	
	}
		
		
	

	private static void subirarriba(ColaDeClientes cola, int edad) {
		// TODO Auto-generated method stub
		Cliente item = null;
		
		ColaDeClientes aux1 = new ColaDeClientes();
		ColaDeClientes aux2 = new ColaDeClientes();
		
		while(!cola.esVacia()) {

			item = cola.eliminar();
			
			if(item.getEdad() > 60) {
				aux1.adicionar(item);
			}
			else {
				aux2.adicionar(item);
			}
		}
		
		cola.vaciar(aux1);
		cola.vaciar(aux2);
		
	}

	private static void promocionNacionalidad(ColaDeClientes cola, String TipoCliente, String Nacionalidad) {
		// TODO Auto-generated method stub
	
		Cliente item = null;
		int nroElem = cola.nroElem();
		
		for(int i = 1; i <= nroElem; i++) {
			item = cola.eliminar();
			
			if(item.getTipo() != TipoCliente && item.getPais().equals(Nacionalidad)) {
				item.setTipo(TipoCliente);
			}
			else {
				
			}
			
			cola.adicionar(item);
		}
		
		
		
	}

}
