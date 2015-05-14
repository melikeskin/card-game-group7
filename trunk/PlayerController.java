
public class PlayerController {
	private EntityController entityController;
	private InterfaceController interfaceController;
	private HeroController heroController;
	private int turnTime;
	private int turn;
	
	
	public PlayerController (EntityController entityController,	
			InterfaceController interfaceController,
			HeroController heroController,int turnTime,int turn)
	{
		this.entityController = entityController;
		this.interfaceController = interfaceController;
		this.heroController = heroController;
		this.turnTime = turnTime;
		this.turn = turn;
	}
	public void updateCards (){
		
	}
	public void resetTurnTime (){
		turnTime = 60;
	}
	public void setTurn(int turn){
		this.turn = turn;
	}
	public void newGame(){
		
	}
}
