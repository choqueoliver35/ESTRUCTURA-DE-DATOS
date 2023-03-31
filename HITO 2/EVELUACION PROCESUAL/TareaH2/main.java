package TareaH2;

public class main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// Crear el país Bolivia
		Provincia prov1 = new Provincia();
		prov1.setNombre("Prov 1");
		Provincia prov2 = new Provincia();
		prov2.setNombre("Prov 2");
		
		Provincia[] provlapaz = new Provincia[2];
		provlapaz[0] = prov1;
		provlapaz[1] = prov2;
		
		Provincia prov3 = new Provincia();
		prov3.setNombre("Prov 3");
		Provincia prov4 = new Provincia();
		prov4.setNombre("Prov 4");
		
		Provincia[] provoruro = new Provincia[2];
		provoruro[0] = prov3;
		provoruro[1] = prov4;
		
		Provincia prov5 = new Provincia();
		prov5.setNombre("Prov 5");
		Provincia prov6 = new Provincia();
		prov6.setNombre("Prov 6");
		
		Provincia[] provpando = new Provincia[2];
		provpando[0] = prov5;
		provpando[1] = prov6;
		
		
		
		Departamento dep1 = new  Departamento(); 
		dep1.setNombre("La Paz");
		dep1.setNroProv(2);
		dep1.setProvincias(provlapaz);
		
		Departamento dep2 = new  Departamento();
		dep2.setNombre("Oruro");
		dep2.setNroProv(2);
		dep2.setProvincias(provoruro);
		Departamento dep3 = new  Departamento();
		dep3.setNombre("Pando");
		dep3.setNroProv(2);
		dep3.setProvincias(provpando);
		
		Departamento[] dep = new Departamento[3];
		dep[0] = dep1;
		dep[1] = dep2;
		dep[2] = dep3;
		
		Pais p = new Pais();
		p.setNombre("Bolivia");
		p.setNroDeps(3);
		p.setDepartamentos(dep);
		
		p.mostrarPais();
		
		/*
		*/
		
		Departamento depinsert = new  Departamento();
		Provincia prov7 = new Provincia();
		prov7.setNombre("Prov 4");
		Provincia prov8 = new Provincia();
		prov8.setNombre("Prov 4");
		
		Provincia[] provTarija = new Provincia[2];
		provTarija[0] = prov7;
		provTarija[1] = prov8;
		
		depinsert.setNombre("Tarija");
		depinsert.setNroProv(2);
		depinsert.setProvincias(provTarija);
		depinsert.agregarNuevaProvincia(prov6);
		
		System.out.println("\n\n");
		depinsert.mostrarDepartamento();
		
		Provincia[] provSC = new Provincia[0];
		
		Departamento depnew = new  Departamento();
		depnew.setNombre("Santa Cruz");
		depnew.setNroProv(0);
		depnew.setProvincias(provSC);
		
		p.agregarNuevoDepartamento(depnew);
		System.out.println("\n\n");
		p.mostrarPais();
		

	}

}
