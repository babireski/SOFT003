public class Inaccessibility
{
	private String type;
	private String description;
	
	public Inaccessibility(String type, String description)
	{
		this.type = type;
		this.description = description;
	}

	/* Getters */

	public String getType()
	{
		return type;
	}

	public String getDescription()
	{
		return description;
	}

	/* Setters */

	public void setType(String type)
	{
		this.type = type;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}
}
