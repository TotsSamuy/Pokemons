package attacks;

import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove{
	public AerialAce(){
		 super(Type.FLYING, 65, 0);
	}
	
	@Override
	protected boolean checkAccuracy(Pokemon att, Pokemon def){
		return true;
	}
	
	@Override
	protected String describe(){
		return "Shalom";
	}
}