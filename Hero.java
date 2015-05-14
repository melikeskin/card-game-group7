
public class Hero {

	private String name;
	private int health;
	private int armor;
	private int mana;
	private int attack;
	private Deck deck;
	
	public Hero(String name)
	{
		this.name = name;
	}
	
	public Hero(String name, int health)
	{
		this.name = name;
		this.health = health;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getHealth()
	{
		return health;
	}
	
	public void setAttack(int number)
	{
		attack = number;
	}
	
	public int getAttack()
	{
		return attack;
	}
	
	public void attacked(int damage)
	{
		int tmp = damage;
		if(armor != 0)
		{
			armor -= damage;
			tmp -= armor;
			if(armor < 0)
				armor = 0;
		}
		if(tmp > 0)
			health -= tmp;
	}
	
	public int getArmor()
	{
		return armor;
	}
	
	public int getMana()
	{
		return mana;
	}
	
	public void useMana(int mana)
	{
		this.mana -= mana;
	}
	
	public void increaseMana()
	{
		increaseMana(1);
	}
	
	public void increaseMana(int number)
	{
		int difference = 10 - mana;
		if(difference <= number)
			mana = 10;
		else
			mana += number;
	}

	public void increaseArmor(int number)
	{
		armor += number;
	}
	
	public void increaseArmor()
	{
		increaseArmor(1);
	}
	
	public void useAbility()
	{
		if(name == "Warrior")
		{
			increaseArmor(2);
		}
		else if (name == "Druid")
		{
			increaseArmor(1);
			attack++;
		}
		else if (name == "Priest")
		{
			health += 2;
		}
	}
	
	public Deck getDeck()
	{
		return deck;
	}
	
	public void setDeck(Deck deck)
	{
		this.deck = deck;
	}
}
