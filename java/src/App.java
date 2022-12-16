import java.util.*;

public class App
{
	private static Scanner input = new Scanner(System.in);
	private List<Stretch> stretches;
	private List<Account> accounts;
	private List<Place> places;
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

	public Evaluation newEvaluation(Account account) throws Exception
	{
		System.out.print("Insert comment: ");
		String comment = input.nextLine();
		System.out.print("Insert rating: ");
		float rating = Float.parseFloat(input.nextLine());

		return new Evaluation(account, comment, rating);
	}

	public Inaccessibility newInaccessibility(Account account)
	{
		System.out.print("Insert type: ");
		String type = input.nextLine();
		System.out.print("Insert description: ");
		String description = input.nextLine();

		return new Inaccessibility(account, type, description);
	}
}