import java.util.*;

public class App
{
	private List<Stretch> stretches = new ArrayList<Stretch>();
	private List<Account> accounts = new ArrayList<Account>();
	private List<Place> places = new ArrayList<Place>();
	private static App instance = null;

	public static App getInstance()
	{
		if(instance == null)
		{
			instance = new App();
		}

		return instance;
	}

	/* Add */

	public void addStretch(Stretch stretch)
	{
		stretches.add(stretch);
	}

	public void addAccount(Account account)
	{
		accounts.add(account);
	}

	public void addPlaces(Place place)
	{
		places.add(place);
	}

	/* Delete */
	
	public void deleteStretch(Stretch stretch)
	{
		stretches.remove(stretch);
	}

	public void deleteAccount(Account account)
	{
		accounts.remove(account);
	}

	public void deletePlaces(Place place)
	{
		places.remove(place);
	}

	/* Others */
	
	public List<Stretch> getRoute(Coordinate departure, Coordinate destination)
	{
		List<Stretch> route = new ArrayList<Stretch>();

		return route;
	}

	public void evaluatePlace(Place place, Evaluation evaluation)
	{
		place.addEvaluation(evaluation);
	}

	public void reportInaccessibility(Stretch stretch, Inaccessibility inaccessibility)
	{
		stretch.addInaccessibility(inaccessibility);
	}
}