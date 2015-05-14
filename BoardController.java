
public class BoardController {
	private EntityController entityController;
	private InterfaceController interfaceController;
	private Card playedMinions[];
	
	public BoardController(EntityController entityController,
			InterfaceController interfaceController, Card playedMinions){
		
		this.entityContoller = entityController;
		this.interfaceController = interfaceController;
		this.playedMinions = playedMinions;
		
	}
	
	public void playMinion(Player player, MinionCard minion){
		playedMinions[player.getNoOfCards() + 1] = player.playCard(minion);
	}
	
	public void setEntityController(EntityController entityController){
		this.entityController = entitiyController;

	}
	
	public void setEntityInterfaceController(InterfaceController interfaceController){
		this.interfaceController = interfaceController;

	}
}
