package first.model;

public class PMFriend
{
	//Declation section
	private String name;
	private int age;
	private String personality;
	private boolean isImaginary;
	private double weight;
	private String hobby;
	
	public void setName(String name)
	{
		this.name = name;
		
	}
	
	public void setPersonality(String personality)
	{
		this.personality = personality;
		
	}
	
	public void setHobby(String hobby)
	{
		this.hobby = hobby;
		
	}
	
	public void setAge(int age)
	{
		this.age = age;
		
	}
	
	public void setIsImaginary(boolean isImaginary)
	{
		this.isImaginary = isImaginary;
		
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
		
	}
	
	public String getName()
	{
		return name;
		
	}
	
	public String getPersonality()
	{
		return personality;
		
	}
	
	public String getHobby()
	{
		return hobby;
		
	}
	
	public int getAge()
	{
		return age;
		
	}
	
	public double getWeight()
	{
		return weight;
		
	}
	
	public boolean getIsImaginary()
	{
		return isImaginary;
		
	}

	/**
	 *  Initialize with bad values
	 */
	public PMFriend()
	{
		name = "nameless";
		age = -10;
		personality = "";
		isImaginary = false;
		weight = -325566556;
		hobby = "never";
		
	}
	
	public PMFriend(String name, int age, String personality, boolean isImaginary, double weight, String hobby)
	{
		this.name = name;
		this.age = age;
		this.personality = personality;
		this.isImaginary = isImaginary;
		this.weight = weight;
		this.hobby = hobby;
		
		
	}
}
