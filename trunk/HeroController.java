
public class HeroController {
	private EntityController entityController;
	private InterfaceController interfaceController;
	private BoardController boardController;
	private int mana, health;
	
	public HeroController (EntityController entityController,
		InterfaceController interfaceController,
		BoardController boardController,
		int mana,int health)
	{	
		this.entityController = entityController;
		this.interfaceController = interfaceController;
		this.boardController = boardController;
		this.mana = mana;
		this.health = health;
		
	}
	
	public void setBoardfaceController(BoardController boardController){
		this.boardController = boardController;
	}
	
	public void increaseMana(int mana){
		mana = mana + 1;
	}
	public void isGameEnd(){
		player.gameActive(false);
	}
	
}
