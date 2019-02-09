

	/**
	 * Testing class for Product object
	 *
	 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
	 * @version 2018-08-25
	 */
	public class AnimalTest
	{

	    /**
	     * Test the empty Animal constructor and the getters
	     */
	    public void emptyConstructorTest() throws AssertException
	    {
	        // Use the default constructor
	        Animal animal = new Animal();

	        // The name should be "noname", color "unknown", height and weight 0.
	        Assert.assertEquals("unknown", animal.getColor());
	        Assert.assertEquals("noname", animal.getName());
	        Assert.assertEquals(0, animal.getHeight(), 0.01);
	        Assert.assertEquals(0, animal.getWeight(), 0.01);
	    }

	    // TODO: test full constructor, getters, and toString
	    public void actualConstructorTest() throws AssertException
	    {
	    	Animal ani=new Animal("Orange","Tony",200.1, 5.8);
	    	Assert.assertTrue(ani.getColor().equals("Orange"));
	    	Assert.assertTrue(ani.getName().equals("Tony"));
	    	Assert.assertEquals(200.1, ani.getWeight(),0.01);
	    	Assert.assertEquals(5.8, ani.getHeight(),0.01);
	    }
	    public void Test() throws AssertException
	    {
	    	Animal display=new Animal();
	    	String expected="Tony, a Orange-colored animal. 200.1 pounds, 5.8 inches" +"\n";
	    	Assert.assertEquals(expected, display.toString());
	    }
	}



