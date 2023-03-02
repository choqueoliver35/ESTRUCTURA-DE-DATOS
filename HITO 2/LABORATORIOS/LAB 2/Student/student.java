package Student;

public class student {

	private String fullname;
	private String lastname;
	private int age;
	
	public student(String fullname, String lastname, int age) 
	{
		this.fullname=fullname;
		this.lastname=lastname;
		this.age = age;
	}
	
	public String getFullName() 
	{
		return this.fullname;
	}
	
	public void setFullName(String fullname) 
	{
		this.fullname = fullname;
	}
	
	public String getLastName() 
	{
		return this.lastname;
	}
	

	public void setLastName(String lastname) 
	{
		this.lastname = lastname;
	}
	
	
	public int getAge() 
	{
		return this.age;
	}
	

	public void setAge(int age) 
	{
		this.age = age;
	}
	
	

}