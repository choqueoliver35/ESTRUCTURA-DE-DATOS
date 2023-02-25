package Math_utils;



public class Math_utils 
{
	private String nameAPP;
	private String version;
	private int year;
	
	public Math_utils(String nameAPP, String version, int year) 
	{
		this.nameAPP=nameAPP;
		this.version=version;
		this.year=year;
	}
	
	public void printAPP() 
	{
		System.out.println(nameAPP + " - " + version + " - "+ year);
	}
	
	public void generateNaturaleNumbers(int limit) 
	{
		System.out.println("\nGenerando Numeros Natuales");
		for(int i=1; i<=limit; i++) 
		{
			if(i==limit) 
			{
				System.out.println(i);
			}
			else 
			{
				System.out.print(i + ",");
			}
		}
	}
	
	public void generatePairNumbers(int limit) 
	{
		for(int i=1; i<=limit; i++) 
		{
			if(i%2==0) 
			{
				if(i==limit) 
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
	
	public void generateExtensionFromCI(String ci) 
	{
	
		
		System.out.println(ci.substring(8));
		
	
	}
	
	


	
}
