import java.util.*;

public class Place 
{
	private String name;
	private String description;
	private Stretch location;
	private List<Evaluation> evaluations;

	public Place(String name, String description, Stretch location, List<Evaluation> evaluations)
	{
		this.name = name;
		this.description = description;
		this.location = location;
		this.evaluations = evaluations;
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

	public Stretch getLocation()
	{
		return location;
	}

	public List<Evaluation> getEvaluations()
	{
		return evaluations;
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

	public void setLocation(Stretch location)
	{
		this.location = location;
	}

	public void setEvaluations(List<Evaluation> evaluations)
	{
		this.evaluations = evaluations;
	}

	/* Others */

	public void addEvaluation(Evaluation evaluation)
	{
		evaluations.add(evaluation);
	}
}
