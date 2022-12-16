import junit.framework.TestCase;
import java.util.*;
import org.javatuples.*;
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

	@Test 
	public void testAddEvaluation() throws Exception
	{
		App app = App.getInstance();
		
		Account account = new Account("Pedro", "pedro@gmail.com", "12345");
		Stretch stretch = new Stretch("Rua das Flores", 150, new Pair<Coordinate,Coordinate>(new Coordinate(1640, 1530), new Coordinate(1780, 1610)));
		Place place = new Place("Parque da Cidade", "Um parquinho com um lago no centro da cidade", stretch);
		Evaluation evaluation = new Evaluation(account, "Boa acessibilidade", 10);

		app.addEvaluation(place, evaluation);

		assertTrue(place.getEvaluations().contains(evaluation));
	}

	@Test 
	public void testAddInaccessibility() throws Exception
	{
		App app = App.getInstance();
		
		Account account = new Account("Pedro", "pedro@gmail.com", "12345");
		Stretch stretch = new Stretch("Rua das Flores", 150, new Pair<Coordinate,Coordinate>(new Coordinate(1640, 1530), new Coordinate(1780, 1610)));
		Inaccessibility inaccessibility = new Inaccessibility(account, "Faixa sem rampa", "Existe uma faixa com acesso sem rampa logo em frente ao Banco Nacional");

		app.addInaccessibility(stretch, inaccessibility);

		assertTrue(stretch.getInaccessibilities().contains(inaccessibility));
	}
}
