import java.util.ArrayList;

public class Player {
	private Player opponent;
	private Hero hero;
	private boolean hisTurn;
	private ArrayList<Card> hand;
	private ArrayList<Card> playedCards;
	private MinionCard selectedMinion;
	private SpellCard selectedSpell;
	private WeaponCard selectedWeapon;
	private boolean selectedHero;
	private MinionCard targetMinion;
	private Hero targetHero;
	
	public Player(Hero hero)
	{
		this.hero = hero;
		hand = new ArrayList<Card>();
		playedCards = new ArrayList<Card>();
	}
	
	public SpellCard getSelectedSpell()
	{
		return selectedSpell;
	}
	
	public WeaponCard getSelectedWeapon()
	{
		return selectedWeapon;
	}
	
	public void setSelectedSpell(SpellCard selectedSpell)
	{
		this.selectedSpell = selectedSpell;
	}
	
	public void setSelectedWeapon(WeaponCard selectedWeapon)
	{
		this.selectedWeapon = selectedWeapon;
	}
	
	public Player getOpponent()
	{
		return opponent;
	}
	
	public void setOpponent(Player opponent)
	{
		this.opponent = opponent;
	}
	
	public void setHisTurn(boolean state)
	{
		hisTurn = state;
	}
	
	public boolean getHisTurn()
	{
		return hisTurn;
	}
	
	public ArrayList<Card> getPlayedCards()
	{
		return playedCards;
	}

	public void setHero(Hero hero)
	{
		this.hero = hero;
	}
	
	public void setSelectedMinion(MinionCard selectedMinion)
	{
		this.selectedMinion = selectedMinion;
	}
	
	public MinionCard getSelectedMinion()
	{
		return selectedMinion;
	}
	
	public Hero getSelectedHero()
	{
		return hero;
	}
	
	public void setHeroSelected(boolean state)
	{
		selectedHero = state;
	}
	
	public MinionCard getTargetMinion()
	{
		return targetMinion;
	}
	
	public void setTargetMinion(MinionCard targetMinion)
	{
		this.targetMinion = targetMinion;
	}
	
	public void setTargetHero(Hero targetHero)
	{
		this.targetHero = targetHero;
	}
	
	public Hero getTargetHero()
	{
		return targetHero;
	}
	
	public void attack(MinionCard card)

	{
		targetMinion = card;
		if(selectedMinion != null)
		{
			selectedMinion.setHealth(selectedMinion.getHealth() - targetMinion.getDamage());
			targetMinion.setHealth(targetMinion.getHealth() - selectedMinion.getDamage());
		}
		else if(selectedHero == true)
		{
			targetMinion.setHealth(targetMinion.getHealth() - hero.getAttack());
			hero.attacked(targetMinion.getDamage());
		}
	}

	public void select(Object card)
	{
		if(card instanceof Hero)
		{
			selectedHero = true;
		}
		else if (card instanceof MinionCard)
		{
			selectedMinion = (MinionCard)card;
		}
		else if( card instanceof SpellCard)
		{
			selectedSpell = (SpellCard)card;
		}
		else if(card instanceof WeaponCard)
		{
			selectedWeapon = (WeaponCard)card;
		}
	}
	
	public void deselect()
	{
		selectedHero = false;
		selectedMinion = null;
		selectedSpell = null;
		selectedWeapon = null;
	}

	public void attackHero()
	{
		if(selectedMinion != null)
		{
			opponent.hero.attacked(selectedMinion.getDamage());
		}
		else if (selectedHero == true)
		{
			opponent.hero.attacked(hero.getAttack());
		}
	}
	
	public void drawCard()
	{
		hand.add(hero.getDeck().drawCard());
	}
	
	public void playCard()
	{
		if(selectedMinion != null)
		{
			//TODO
		}
	}
	
	public void selectDeck(Deck deck)
	{
		hero.setDeck(deck);
	}
}

