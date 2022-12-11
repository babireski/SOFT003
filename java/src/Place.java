public class Place 
{
	private String name;
	private String description;

	public Place(String name, String description)
	{
		this.name = name;
		this.description = description;
	}

	/* Getters */

	public String getName()
	{
		return name;
	}

	public String getDescription()
	{
		return description;
	}

	/* Setters */

	public void setName(String name)
	{
		this.name = name;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}
}
