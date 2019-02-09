public class EquipmentTest
{
	public void constructorTest() throws AssertException
	{
		Equipment equip=new Equipment("Batarang/5,3.22,700.06,bat-shaped boomerang");
		Assert.assertTrue(equip.getName().equals("Batarang"));
		Assert.assertTrue(equip.getDescription().equals("bat-shaped boomerang"));
		Assert.assertEquals(5,equip.getCount());
		
	}
}