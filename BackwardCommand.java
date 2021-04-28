package a5.commands;

import a5.Turtle;

/**
 * Command that walks the turtle backwards.
 *
 */
public class BackwardCommand extends WalkCommand {

	public BackwardCommand(Turtle t, double distance) {
		super(t, distance);        
        this.distance = distance;
	}
	
	public void execute() {
        this.turtle.backward(getDistance());
    }
}