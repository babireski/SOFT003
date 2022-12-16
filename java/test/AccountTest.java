import junit.framework.TestCase;
import java.util.*;
import org.javatuples.*;
import org.junit.*;

public class AccountTest extends TestCase
{
	public AccountTest()
	{

	}

	@Before
	public void setUp()
	{

	}

	@After
	public void tearDown()
	{

	}

	@Test
	public void testAddRoute() throws Exception
	{
		Stretch s = new Stretch("Rua das Flores", 150, new Pair<Coordinate,Coordinate>(new Coordinate(1640, 1530), new Coordinate(1780, 1610)), null);
		Stretch t = new Stretch("Rua das Palmeiras", 500, new Pair<Coordinate,Coordinate>(new Coordinate(1780, 1610), new Coordinate(1800, 1600)), null);
		
		List<Stretch> route = new ArrayList<Stretch>();
		route.add(s);
		route.add(t);

		Account account = new Account("Pedro", "pedro@gmail.com", "12345");
		account.addRoute(route);

		List<List<Stretch>> expected = new ArrayList<List<Stretch>>();
		List<List<Stretch>> actual = account.getRoutes();

		expected.add(route);

		assertEquals(expected, actual);
	}

	@Test
	public void testDeleteAccount()
	{
		App app = App.getInstance();
		
		Account account = new Account("Pedro", "pedro@gmail.com", "12345");
		app.addAccount(account);
		account.deleteAccount();

		List<Account> expected = new ArrayList<Account>();
		List<Account> actual = app.getAccounts();

		assertEquals(expected, actual);
	}
}