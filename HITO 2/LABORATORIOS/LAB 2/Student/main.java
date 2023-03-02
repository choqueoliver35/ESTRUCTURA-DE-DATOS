package Student;

import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leer = new Scanner(System.in);
		
		student st = new student("Pepito","pep",25);
		
		String nombre = st.getFullName();
		String apellido = st.getLastName();
		int edad = st.getAge();
		System.out.println(nombre + " " + apellido + " " + edad);
		
		st.setAge(30);
		st.setFullName("pepito1");
		st.setLastName("pep1");
		
		 nombre = st.getFullName();
		 apellido = st.getLastName();
		 edad = st.getAge();
		
		System.out.println(nombre + " " + apellido + " " + edad);
		
		
	
		
		

	}

}
