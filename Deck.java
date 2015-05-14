import java.util.ArrayList;


public class Deck {

	private ArrayList<Card> cards;
	
	public Deck()
	{
		cards = new ArrayList<Card>();
	}
	
	public Card drawCard()
	{
		Card drawn = cards.remove(0);
		return drawn;
	}
	
	public void addCard(Card card)
	{
		if(cards.size() < 30)
			cards.add(card);
	}
}
