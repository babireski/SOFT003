import java.util.*;

public class Account
{
	private String name;
	private String email;
	private String password;
	private List<List<Stretch>> routes = new ArrayList<List<Stretch>>();
	
	public Account(String name, String email, String password)
	{
		this.name = name;
		this.email = email;
		this.password = password;
	}

	/* Getters */

	public String getName()
	{
		return name;
	}

	public String getEmail()
	{
		return email;
	}

	public String getPassword()
	{
		return password;
	}

	public List<List<Stretch>> getRoutes()
	{
		return routes;
	}

	/* Setters */

	public void setName(String name)
	{
		this.name = name;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public void setRoutes(List<List<Stretch>> routes)
	{
		this.routes = routes;
	}

	/* Others */

	public void addRoute(List<Stretch> route)
	{
		routes.add(route);
	}

	public void evaluatePlace(Place place, Evaluation evaluation)
	{
		evaluation.setEvaluator(this);
		App.getInstance().addEvaluation(place, evaluation);
	}

	public void reportInaccessibility(Stretch stretch, Inaccessibility inaccessibility)
	{
		inaccessibility.setReporter(this);
		App.getInstance().addInaccessibility(stretch, inaccessibility);
	}

	public void deleteAccount()
	{
		App.getInstance().deleteAccount(this);
	}
}
