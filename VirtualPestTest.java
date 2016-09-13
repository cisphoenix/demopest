

/**
 * The test class VirtualPestTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class VirtualPestTest extends junit.framework.TestCase
{
    /**
     * Default constructor for test class VirtualPestTest
     */
    public VirtualPestTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }

	public void testConstructor()
	{
		VirtualPest virtualP1 = new VirtualPest("Fred", 1);
		assertEquals("Fred", virtualP1.getName());
		assertEquals(1, virtualP1.getIntState());
	}
	
	public void testGetFile()
	{
		VirtualPest virtualP1 = new VirtualPest("Fred", 1);
		assertEquals("trout.jpg", virtualP1.getFile());
    }


	public void testGetNumActions()
	{
		VirtualPest virtualP1 = new VirtualPest("Fred", 1);
		assertEquals(3, virtualP1.getNumActions());
	}
    
    public void testGetState()
	{
		VirtualPest virtualP2 = new VirtualPest("Fred", 1);
		assertEquals("hungry", virtualP2.getState());
	    virtualP2 = new VirtualPest("Fred", 2);
		assertEquals("sleepy", virtualP2.getState());
	    virtualP2 = new VirtualPest("Fred", 3);
		assertEquals("full", virtualP2.getState());    
	    virtualP2 = new VirtualPest("Fred", 4);
		assertEquals("grouchy", virtualP2.getState());    
	    virtualP2 = new VirtualPest("Fred", 5);
		assertEquals("error", virtualP2.getState());
    }
          
    public void testGetAction()
	{
		VirtualPest virtualP2 = new VirtualPest("Fred", 1);
		assertEquals("feed", virtualP2.getAction(1));
		assertEquals("pet", virtualP2.getAction(2));
		assertEquals("put to bed", virtualP2.getAction(3));
		assertEquals("", virtualP2.getAction(4));
    }

}



