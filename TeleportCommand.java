package a5.commands;

import a5.Turtle;
import ca.queensu.cs.cisc124.notes.basics.geometry.Point2;

/**
 * Command that teleports the turtle to a position.
 *
 */
public class TeleportCommand extends Command {
	
	protected Point2 position;
	
	public TeleportCommand(Turtle t, Point2 position){
		super(t);
        this.position = position;    
	}
	
	public Point2 getPosition(){
		return this.position;
	}
	
	public void execute() {
        this.turtle.teleport(getPosition());
    }
}