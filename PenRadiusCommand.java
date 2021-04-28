package a5.commands;

import a5.Turtle;

/**
 * Command that changes the pen radius.
 */
public class PenRadiusCommand extends Command {

	protected float radius;
	
	public PenRadiusCommand(Turtle t, float radius){
		super(t);
		this.radius = radius;
	}
	
	public float getRadius() {
		return this.radius;
	}
	
	public void execute() {
		this.turtle.setPenRadius(getRadius());
	}
}
