package ejercicios;


public class Ejercicios 
{
	
	
	private int i;
	private int limite;
	
	public Ejercicios() {
		this.i=1;
		this.limite=1;
	}
	
	public void mostrarMensaje() 
	{
		System.out.println("hola mundo desde java");
	}
	
	public void generarNaturalesFor() 
	{
		System.out.println("\nGenerando Numeros Natuales For");
		for(i=1; i<=10; i++) 
		{
			if(i==10) 
			{
				System.out.println(i);
			}
			else 
			{
				System.out.print(i + ",");
			}
		}
	}
	
	public void generarNaturalesForPares() 
	{
		System.out.println("\nGenerando Numeros Natuales Pares For");
		for(i=1; i<=20; i++) 
		{
			if(i%2==0) 
			{
				if(i==20) 
				{
					System.out.println(i);
				}
				else 
				{
					System.out.print(i + ",");
				}
			}
		}
	}
	
	public void generarNaturalesWhile() 
	{
		System.out.println("\nGenerando Numeros Natuales While");
		
		i=1;
		while(i<=10) 
		{
			System.out.println(i);
			i+=2;
		}
	}
	
}
