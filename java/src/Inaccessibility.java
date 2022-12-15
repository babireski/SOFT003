public class Inaccessibility
{
	private Account reporter;
	private String type;
	private String description;
	
	public Inaccessibility(Account reporter, String type, String description)
	{
		this.reporter = reporter;
		this.type = type;
		this.description = description;
	}

	/* Getters */

	public Account getReporter()
	{
		return reporter;
	}

	public String getType()
	{
		return type;
	}

	public String getDescription()
	{
		return description;
	}

	/* Setters */

	public void setReporter(Account reporter)
	{
		this.reporter = reporter;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}
}
