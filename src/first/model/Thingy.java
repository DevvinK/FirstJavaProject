package first.model;

public class Thingy
{

	private String name;
	private String movie;
	private String food;
	
	public Thingy()
	{
		/*
		 name = "Potato Head";
		 movie = "It better have more plot than action";
		 food = "Spicy is best";
		 */
	}
	
	/**
	 * 
	 * @param name What is the Thingy's name?
	 * @param food The favorite food of the Thingy.
	 * @param movie Its favorite movie!
	 */
	public Thingy(String name, String food, String movie)
	{
	this.name = name;
	this.food = food;
	this.movie = movie;
	
	}
	
	 
	public void setMovie(String movie)
	{
		this.movie = movie;
	}
	public void setFood(String food)
	{
		this.food = food;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getMovie()
	{
		return movie;
	}
	public String getFood()
	{
		return food;
	}
	public String getName()
	{
		return name;
	}
}
