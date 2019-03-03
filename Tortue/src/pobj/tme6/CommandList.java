package pobj.tme6;

import java.util.ArrayList;
import java.util.List;

public class CommandList implements ICommand {
	
	List<ICommand> commands;
	
	public CommandList() {
		commands = new ArrayList<ICommand>();
	}
	
	public void addCommand(ICommand command) {
		commands.add(command);
	}
	@Override
	public void execute(IColorTurtle turtle) {
		for (ICommand iCommand : commands) {
			iCommand.execute(turtle);
		}
		
	}
	public List<ICommand> getCommands() {
		return commands;
	}

}
