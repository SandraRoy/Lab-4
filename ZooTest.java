class ZooTest
{
	public void TestCapacity() throws AssertException
	{
		Zoo zoo1=new Zoo(30);
		Assert.assertEquals(30, zoo1.getCapacity(),0.01);
	}
	public void TestHeight() throws AssertException
	{
		Zoo zoo2=new Zoo(30);
		Animal hippo=new Animal("Grey","Dan",30.5,40.0);
		Animal rhino=new Animal("Grey","Jim",21.3, 50.0);
		zoo2.addAnimal(hippo);
		zoo2.addAnimal(rhino);
		Assert.assertEquals(90.0, zoo2.getTotalHeight(),0.01);
		
		
	}
	public void Test() throws AssertException
	{
		Zoo zoo3=new Zoo(30);
		Animal ani=new Animal("Grey","Jim",21.3,50.0);
		Assert.assertTrue(("These animals live in the zoo: \n"+ani.toString()).equals(zoo3.toString()));
	}
}