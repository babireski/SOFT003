import junit.framework.TestCase;
import java.util.*;
import org.junit.*;

public class AppTest extends TestCase
{
	public AppTest()
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
	public void testCreateAccount()
	{
		App app = App.getInstance();
		
		Account account = new Account("Pedro", "pedro@gmail.com", "12345");
		app.addAccount(account);

		List<Account> expected = new ArrayList<Account>();
		List<Account> actual = app.getAccounts();

		expected.add(account);

		assertEquals(expected, actual);
	}
}
