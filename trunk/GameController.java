
public class GameController {
	
	private EntityController entityController;
	private InterfaceController interfaceController;
	private PlayerController playerController;


	public GameController(EntityController entityController, 
			InterfaceController interfaceController, 
		    PlayerController playerController)
	{
		
		this.interfaceController = interfaceController;
		this.entityController = entityController;
		this.playerController = playerController;
		
	}
	
	public void startGame()
	{
		
	}
	
	public void setPlayerController(PlayerController playerController){
		playerController = this.playerController;
	}
	public PlayerController getPlayerController(){
		return playerController;
	}
}
