import java.util.*;

public class System
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
}
