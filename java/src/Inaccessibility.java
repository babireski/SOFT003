public class Inaccessibility
{
	private String type;
	private String description;
	private Account reporter;
	
	public Inaccessibility(String type, String description, Account reporter)
	{
		this.type = type;
		this.description = description;
		this.reporter = reporter;
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

	public Account getReporter()
	{
		return reporter;
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

	public void setReporter(Account reporter)
	{
		this.reporter = reporter;
	}
}
