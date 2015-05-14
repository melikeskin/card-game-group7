
public abstract class SpellCard extends Card {

	private boolean isPlayable;
	private Player player;
	
	public void setIsPlayable(boolean state)
	{
		isPlayable = state;
	}
	
	public boolean getIsPlayable()
	{
		return isPlayable;
	}
	
	public void setPlayer(Player player)
	{
		this.player = player;
	}
	
	public abstract void playEffect();
}
