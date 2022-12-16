import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.*;

public class StretchTest extends TestCase
{
	public StretchTest()
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
	public void testStretch() throws Exception
	{
		assertThrows(Exception.class, () -> {new Stretch(null, 0, null);});
		assertThrows(Exception.class, () -> {new Stretch(null, -1, null);});
	}
}