
public class EntityController {
	private ControllerConnector controllerConnector;
	private entityController entityController;
	
	EntityController(ControllerConnector controllerConnector){
		this.controllerConnector = controllerConnector;
	}
	
	public EntityController getEntityController(){
		return entityController;
	}
	public ControllerConnector getControllerConnector(){
		return controllerConnector;
	}
}

