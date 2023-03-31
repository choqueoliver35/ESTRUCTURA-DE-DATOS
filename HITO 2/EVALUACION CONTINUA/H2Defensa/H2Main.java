package H2Defensa;
import java.util.*;
public class H2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		Provincia pv1 = new Provincia("Provincia 1");
		Provincia pv2 = new Provincia("Provincia 2");
		Provincia pv3 = new Provincia("Provincia 3");
		Provincia pv4 = new Provincia("Provincia 4");
		
		Provincia[] provdep1 = new Provincia[2];
		provdep1[0] = pv1;
		provdep1[1] = pv2;
		
		
		Provincia[] provdep2 = new Provincia[2];
		provdep2[0] = pv3;
		provdep2[1] = pv4;
		
		Departamento dp1 = new Departamento("La paz",2,provdep1);
		
		
		Departamento dp2 = new Departamento("Tarija",2,provdep2);
		
	
		Departamento[] deppais = new Departamento[2];
		deppais[0] = dp1;
		deppais[1] = dp2;
		
		Pais pais = new Pais(deppais,2,"Bolivia");
		
		pais.mostrarPais();
	
		String newprovconsole = leer.nextLine();
		
		
		Provincia pv5 = new Provincia(newprovconsole);
		Provincia[] pvcbb = new Provincia[1];
		pvcbb[0] = pv5;
		
		String newdepconsole = leer.nextLine();
		
		Departamento newdep = new Departamento(newdepconsole,1,pvcbb);
		
		
		pais.agregaDepartamento(newdep);
		
		System.out.println("\n\n");
		pais.mostrarPais();
		
		Provincia pvmen = new Provincia("Mendez");
		
		pais.agregaDepartamentoProv("Tarija", pvmen);
		
		System.out.println("\n\n");
		pais.mostrarPais();
		
		

	}

}
