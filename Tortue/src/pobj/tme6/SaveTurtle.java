package pobj.tme6;

import javafx.scene.paint.Color;

public class SaveTurtle implements IColorTurtle{
	private CommandList c;
	
	public SaveTurtle() {
		c = new CommandList();
	}
	
	@Override
	public void move(int length) {
		c.addCommand(new CommandMove(length));
	}

	@Override
	public void turn(int angle) {
		c.addCommand(new CommandTurn(angle));
		
	}

	@Override
	public void up() {
		c.addCommand(new CommandUp());
		
	}

	@Override
	public void down() {
		c.addCommand(new CommandDown());
		
	}

	@Override
	public void setColor(Color color) {
		c.addCommand(new CommandSetColor(color));
		
	}
	public CommandList getCommand() {
		return c;
	}

}
