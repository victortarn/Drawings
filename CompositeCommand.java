package a5.commands;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import a5.Turtle;

/**
 * A {@code CompositeCommand} represents a sequence of commands.
 * Executing a {@code CompositeCommand} simply executes each
 * command of the sequence in order.
 *
 */
public abstract class CompositeCommand extends Command {

	/**
	 * The sequence of commands making up this command.
	 */
	protected List<Command> commands;
	
	/**
	 * Specify the turtle that responds to this command.
     * 
     * @param t the turtle that responds to this command
	 */
	public CompositeCommand(Turtle t) {
		super(t);	
		commands = new ArrayList<Command>();
	}

	/**
	 * Adds the specified command to the end of this sequence
	 * of commands.
	 * 
	 * @param c the command to add
	 */
	public void addCommand(Command c) {
		// already implemented for you
		Objects.requireNonNull(c);
		this.commands.add(c);
	}
	
	/**
	 * Removes the specified command from this sequence of
	 * commands.
	 * 
	 * @param c the command to remove
	 */
	public void removeCommand(Command c) {
		// already implemented for you
		this.commands.remove(c);
	}
	
	/**
	 * Commands the turtle to perform each command in this
	 * command in sequence order.
	 */
	@Override
	public void execute() {
		int i = 0;
		
		while (i < commands.size()) {
			commands.get(i).execute();
			i++;
		}
	}

}
