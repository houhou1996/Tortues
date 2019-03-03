package pobj.tme6;

public class SubstituionSaveTurtle extends SaveTurtle {
	
	private ICommand subs;
	public SubstituionSaveTurtle(ICommand subs) {
		this.subs = subs;
		
	}
	@Override
	public void move(int length) {
		super.getCommand().addCommand(subs);
	}
}
