package project1;

public class School {
	private String Name;
	private int Age;
	
	public School (String newName, int newAge ) {
		Name= newName;
		Age = newAge;
	}
	public String GetName()
	{
		return Name;
	}
	
	public int GetAge()
	{
		return Age;
	}

}
