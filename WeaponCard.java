
public class WeaponCard {

	private int durability;
	private int damage;
	
	public WeaponCard(int durability, int damage)
	{
		this.durability = durability;
		this.damage = damage;
	}
	
	public int getDurability()
	{
		return durability;
	}
	
	public int getDamage()
	{
		return damage;
	}
	
	public void decreaseDurability()
	{
		durability--;
	}
}
