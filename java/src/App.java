import java.util.*;

public class App
{
	private List<Stretch> stretches;
	private List<Account> accounts;
	private List<Place> places;

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

	public List<Stretch> getRoute(Coordinate departure, Coordinate destination)
	{
		List<Stretch> route = new ArrayList<Stretch>();

		return route;
	}
}
