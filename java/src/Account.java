import java.util.*;

public class Account
{
	private String name;
	private String email;
	private String password;
	private List<List<Stretch>> routes;
	
	public Account(String name, String email, String password, List<List<Stretch>> routes)
	{
		this.name = name;
		this.email = email;
		this.password = password;
		this.routes = routes;
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

	/* Others */

	public void addRoute(List<Stretch> route)
	{
		routes.add(route);
	}

	public void evaluatePlace(Place place)
	{
		Main.evaluatePlace(place, this);
	}

	public void reportInaccessibility(Stretch stretch)
	{
		Main.reportInaccessibility(stretch, this);
	}

	public void deleteAccount()
	{
		Main.deleteAccount(this);
	}
}
